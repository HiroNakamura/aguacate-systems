package com.aguacate.aguacate.model;

public abstract class GenericaBean<T> implements Generica<T>{
    
    private Class<T> clase;

    public GenericaBean<T>(Class<T> clase){
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