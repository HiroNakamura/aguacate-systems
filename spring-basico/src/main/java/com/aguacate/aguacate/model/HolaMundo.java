package com.aguacate.aguacate.model;

public class HolaMundo{
    private String saludo;

    public void init(){
        System.out.println("Se inicio bean HolaMundo");
    }

    public void destroy(){
        System.out.println("Se destruye bean HolaMundo");
    }

    public String getSaludo(){
        return saludo;
    }

    public void setSaludo(String saludo){
        this.saludo = saludo;
    }

    @Override
    public String toString(){
        return "HolaMundo{ saludo: "+this.saludo+"}";
    }
}