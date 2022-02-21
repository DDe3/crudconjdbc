package com.programacionweb.entidades;

public class Estudiante {

    private Integer id;
    private String nombre, email, carrera, facultad;


    public Estudiante() {}

    public Estudiante(Integer id, String nombre, String email, String carrera, String facultad) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.carrera = carrera;
        this.facultad = facultad;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", email='" + email + '\'' +
                ", carrera='" + carrera + '\'' +
                ", facultad='" + facultad + '\'' +
                '}';
    }
}
