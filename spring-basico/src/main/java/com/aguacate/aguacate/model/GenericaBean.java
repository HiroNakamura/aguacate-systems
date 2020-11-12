package com.aguacate.aguacate.model;

import com.aguacate.aguacate.genericos.Generica;

public abstract class GenericaBean<T> implements Generica<T>{
    
    private Class<T> clase;


    public void setClase(Class<T> clase){
        this.clase = clase;
    }

    public Class<T> getClase(){
        return clase;
    }

    @Override
    public void merge(T clase){
        System.out.println("Se hizo el merge de la clase: "+clase);
    }

    @Override
    public void delete(T clase){
        System.out.println("Se hizo el delete de la clase: "+clase);
    }

}