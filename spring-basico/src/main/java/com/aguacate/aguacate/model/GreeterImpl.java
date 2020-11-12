package com.aguacate.aguacate.model;

import com.aguacate.aguacate.interfaces.Greeter;

public class GreeterImpl implements Greeter{
    public static final String PERSONA = "Umberto Eco";
    
    @Override
    public void saludar(String nombre){
        if(nombre.isEmpty()){
            System.out.println("Hola, "+PERSONA);
        }
        System.out.println("Hola, "+nombre);
    }
}