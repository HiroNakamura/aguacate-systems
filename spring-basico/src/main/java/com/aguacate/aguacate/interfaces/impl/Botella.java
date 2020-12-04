package com.aguacate.aguacate.interfaces.impl;

import com.aguacate.aguacate.interfaces.IServicio;

public class Botella implements IServicio{

    public void init(){
        System.out.println("Iniciando bean Botella");
    }

    public void destroy(){
        System.out.println("Destruyendo bean Botella");
    }

    @Override
    public void abrir(){
        System.out.println("Abrimos la botella de cerveza");
    }
}