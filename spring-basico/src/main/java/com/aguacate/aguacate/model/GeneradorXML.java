package com.aguacate.aguacate.model;

import com.aguacate.aguacate.interfaces.Generador;

public class GeneradorXML implements Generador{
    @Override
    public void generar(String documento){
        System.out.println("Generando documento XML: "+documento);
    }
}