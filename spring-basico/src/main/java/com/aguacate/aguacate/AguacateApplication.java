package com.aguacate.aguacate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.aguacate.aguacate.configurator.Configurator;
import com.aguacate.aguacate.model.Datos;

@SpringBootApplication
public class AguacateApplication {

	public static void main(String[] args) {
		//SpringApplication.run(AguacateApplication.class, args);
		testA();
	}

	public static void testA() {
		ApplicationContext context = new AnnotationConfigApplicationContext(Configurator.class);
		Datos obj = (Datos) context.getBean("datosBean");
		obj.listarPropiedades();
	}

}
