package com.aguacate.aguacate.model;


public class Pais{
    private String nombre;
    private Ciudad ciudad;

    public Pais(){}

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public Ciudad getCiudad(){
        return ciudad;
    }

    public void setCiudad(Ciudad ciudad){
        this.ciudad = ciudad;
    }

    @Override
    public String toString(){
        return "Pais{nombre: "+this.nombre+", ciudad: "+this.ciudad+"}";
    }
}