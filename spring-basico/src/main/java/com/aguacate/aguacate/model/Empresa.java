package com.aguacate.aguacate.model;

public class Empresa{
    private String nombre;
    private MySite mySite;

    public Empresa(){}

    public Empresa(String nombre, MySite mySite){
        super();
        this.mySite = mySite;
        this.nombre = nombre;
    }

    public void init(){
        System.out.println("Se inicia bean Empresa");
    }

    public void destroy(){
        System.out.println("Se destruye bean Empresa");
    }

    public MySite getMySite(){
        return mySite;
    }

    public void setMySite(MySite mySite){
        this.mySite = mySite;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    @Override
    public String toString(){
        return this.nombre +", "+this.mySite;
    }

}