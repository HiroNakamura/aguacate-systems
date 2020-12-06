package com.aguacate.aguacate.model;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Ciudad{
    String nombre;

    public Ciudad(){}

    public Ciudad(String nombre){
        this.nombre = nombre;
    }

    @PostConstruct
    public void init(){
        System.out.println("Se inicia bean Ciudad!!!");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("Se destruye bean Ciudad!!!");
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    @Override
    public String toString(){
        return "Ciudad{nombre: "+this.nombre+"}";
    }
}