package com.programacionweb;

import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.SQLException;
import java.sql.Statement;

public class CrearTabla {

    private final String url = "jdbc:postgresql://localhost:5432/prueba";
    private final String user = "postgres";
    private final String password = "1234";


    private static final String createTableSQL = "CREATE TABLE estudiante " +
            "(ID INT PRIMARY KEY ," +
            " NOMBRE TEXT, " +
            " EMAIL VARCHAR(50), " +
            " CARRERA VARCHAR(50), " +
            " FACULTAD VARCHAR(50))";

    public void createTable() throws SQLException {

        System.out.println(createTableSQL);
        try (Connection connection = DriverManager.getConnection(url, user, password);
             Statement statement = connection.createStatement();) {
             statement.execute(createTableSQL);
        } catch (SQLException e) {
            System.out.println("ERROR");
        }
    }



}
