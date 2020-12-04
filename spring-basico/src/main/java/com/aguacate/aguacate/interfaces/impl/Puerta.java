package com.aguacate.aguacate.interfaces.impl;

import com.aguacate.aguacate.interfaces.IServicio;

public class Puerta implements IServicio{

    public void init(){
        System.out.println("Iniciando bean Puerta");
    }

    public void destroy(){
        System.out.println("Destruyendo bean Puerta");
    }

    @Override
    public void abrir(){
        System.out.println("Abrimos la puerta de la casa");
    }
}