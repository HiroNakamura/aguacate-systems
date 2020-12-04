package com.aguacate.aguacate.model;


public class Individuo{
    private int id;
    private String nombre;
    private Pais pais;

    public Individuo(){}

    public Individuo(int id, String nombre){
        super();
        this.id = id;
        this.nombre = nombre;
    }

    public Individuo(int id, String nombre, Pais pais){
        super();
        this.id = id;
        this.nombre = nombre;
        this.pais = pais;
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public Pais getPais(){
        return pais;
    }

    public void setPais(Pais pais){
        this.pais = pais;
    }

    @Override
    public String toString(){
        return "Individuo{id: "+this.id+", nombre: "+this.nombre+", pais: "+this.pais+"}";
    }


}