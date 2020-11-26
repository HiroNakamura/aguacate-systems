package com.aguacate.aguacate.model;

import com.aguacate.aguacate.interfaces.Generador;

public class Contenedor{
    private Generador generador;

    public Contenedor(Generador generador){
        this.generador = generador;
    }

    public void generar(String documento){
        this.generador.generar(documento);
    }
}