package com.aguacate.aguacate.configurator;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.aguacate.aguacate.interfaces.Datos;
import com.aguacate.aguacate.interfaces.Greeter;
import com.aguacate.aguacate.model.DatosImpl;
import com.aguacate.aguacate.model.GreeterImpl;

import com.aguacate.aguacate.model.GeneradorXML;
import com.aguacate.aguacate.model.GeneradorPDF;
import com.aguacate.aguacate.interfaces.Generador;



@Configuration
public class Configurator{

    

    @Bean(name="datosBean")
    public Datos datos() {
        return new DatosImpl();
    }

    @Bean(name="greeterBean")
    public Greeter greeter() {
        return new GreeterImpl();
    }

    @Bean(name="generadorPDFBean")
    public Generador generadorPDF(){
        return new GeneradorPDF();
    }

    @Bean(name="generadorXMLBean")
    public Generador generadorXML(){
        return new GeneradorXML();
    }

}