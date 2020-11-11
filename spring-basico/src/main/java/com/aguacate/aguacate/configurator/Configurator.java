package com.aguacate.aguacate.configurator;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.aguacate.aguacate.model.Datos;
import com.aguacate.aguacate.model.DatosImpl;


@Configuration
public class Configurator{

    @Bean(name="datosBean")
    public Datos datos() {
        return new DatosImpl();
    }

}