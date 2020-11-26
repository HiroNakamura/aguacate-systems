package com.aguacate.aguacate.model;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;


public class Modelo{
    private int valor;
    private String nombre;
    private List<String> numeros;
    private HashMap<Integer, String> claves;

    public Modelo(){
        numeros = new ArrayList<>();
        claves = new HashMap<>();
    }

    public int getValor(){
        return valor;
    }

    public void setValor(int valor){
        this.valor = valor;
    }
    
    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public List<String> getNumeros(){
        return numeros;
    }

    public void setNumeros(List<String> numeros){
        this.numeros = numeros;
    }

    public HashMap<Integer, String> getClaves(){
        return claves;
    }

    public void setClaves(HashMap<Integer, String> claves){
        this.claves = claves;
    }

    @Override
    public String toString(){
        return "Modelo{valor:"+this.valor+", nombre: "+this.nombre
        +", numeros: "+this.numeros+", claves: "+this.claves+"}";
    }

}