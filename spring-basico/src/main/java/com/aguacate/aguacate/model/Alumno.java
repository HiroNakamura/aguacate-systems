package com.aguacate.aguacate.model;

public class Alumno{
    private int cedula;
    private String nombre;
    private int edad;

    public Alumno(){}

    public Alumno(int cedula, String nombre, int edad){
        super();
        this.cedula = cedula;
        this.nombre = nombre;
        this.edad = edad;
    }

    public Alumno(int cedula, String nombre){
        super();
        this.cedula = cedula;
        this.nombre = nombre;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public int getCedula(){
        return cedula;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre(){
        return nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad(){
        return edad;
    }

    @Override
    public String toString(){
        return "Alumno{ cedula: "+this.cedula +", nombre: "+this.nombre+", edad: "+this.edad+"}";
    }

}