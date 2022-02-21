package com.programacionweb;

import com.programacionweb.entidades.Estudiante;

import java.sql.SQLException;

public class Main {

    public static void main(String[] args) throws SQLException {
//        Crear la tabla
//        CrearTabla cr = new CrearTabla();
//        cr.createTable();

//        Operaciones CRUD
        CRUD crud = new CRUD();
        // INSERT
//        crud.insertar(new Estudiante(1,"Leonardo Salinas","lasalinasb@uce.edu.ec","Ing. Computacion","FCA"));
//        crud.insertar(new Estudiante(2,"Leonardo Salinas2","lasalinasb@uce.edu.ec2","Ing. Computacion2","FCA2"));
        // SELECT
//        Estudiante estudiante = crud.getEstudiante(1);
//        System.out.println(estudiante);

//         UPDATE
        crud.update(1,"Leonardo Bolaños");

        // DELETE
        crud.delete(2);

    }
}
