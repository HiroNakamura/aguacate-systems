package com.aguacate.aguacate.model;

public class HolaMundo{
    private String saludo;

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