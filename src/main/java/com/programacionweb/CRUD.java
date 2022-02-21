package com.programacionweb;

import com.programacionweb.entidades.Estudiante;

import java.sql.*;

public class CRUD {

    private final String url = "jdbc:postgresql://localhost:5432/prueba";
    private final String user = "postgres";
    private final String password = "1234";

    private static final String INSERT = "INSERT INTO estudiante" +
            "  (id, nombre, email, carrera, facultad) VALUES " +
            " (?, ?, ?, ?, ?);";

    private static final String SELECT = "select id,nombre,email,carrera,facultad from estudiante where id =?";

    private static final String UPDATE_NOMBRE = "update estudiante set nombre = ? where id = ?;";

    private static final String DELETE = "delete from estudiante where id = ?;";


    public void insertar(Estudiante estudiante) throws SQLException {
        try (Connection connection = DriverManager.getConnection(url, user, password);
            PreparedStatement preparedStatement = connection.prepareStatement(INSERT)) {
            preparedStatement.setInt(1, estudiante.getId());
            preparedStatement.setString(2, estudiante.getNombre());
            preparedStatement.setString(3, estudiante.getEmail());
            preparedStatement.setString(4, estudiante.getCarrera());
            preparedStatement.setString(5, estudiante.getFacultad());
            System.out.println(preparedStatement);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public Estudiante getEstudiante(Integer ide) {
        try (Connection connection = DriverManager.getConnection(url, user, password);
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT)) {
            preparedStatement.setInt(1, ide);
            System.out.println(preparedStatement);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String nombre = rs.getString("nombre");
                String email = rs.getString("email");
                String carrera = rs.getString("carrera");
                String facultad = rs.getString("facultad");
                return new Estudiante(id, nombre, email, carrera, facultad);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return null;
    }

    public void update(Integer id, String nombre) throws SQLException {
        try (Connection connection = DriverManager.getConnection(url, user, password);
             PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_NOMBRE)) {
            preparedStatement.setString(1, nombre);
            preparedStatement.setInt(2, id);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }


    public void delete(Integer id) throws SQLException {
        try (Connection connection = DriverManager.getConnection(url, user, password);
             PreparedStatement preparedStatement = connection.prepareStatement(DELETE)) {
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }

    }

}
