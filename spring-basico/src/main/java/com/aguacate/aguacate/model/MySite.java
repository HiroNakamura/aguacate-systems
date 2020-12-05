package com.aguacate.aguacate.model;

public class MySite{
    private String url;
    private String nombre;

    public MySite(){}

    public MySite(String url, String nombre){
        super();
        this.url = url;
        this.nombre = nombre;
    }

    public void init(){
        System.out.println("Se inicia bean MySite");
    }

    public void destroy(){
        System.out.println("Se destruye bean MySite");
    }

    public String getUrl(){
        return url;
    }

    public void setUrl(String url){
        this.url = url;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    @Override
    public String toString(){
        return this.url +" , "+this.nombre;
    }

}