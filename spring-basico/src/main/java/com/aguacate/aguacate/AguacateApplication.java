package com.aguacate.aguacate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.aguacate.aguacate.configurator.Configurator;
import com.aguacate.aguacate.interfaces.Datos;
import com.aguacate.aguacate.interfaces.Greeter;
import com.aguacate.aguacate.interfaces.Generador;
import com.aguacate.aguacate.model.Contenedor;
import com.aguacate.aguacate.model.Alumno;
import com.aguacate.aguacate.model.AlumnoBean;


@SpringBootApplication
public class AguacateApplication {

	public static void main(String[] args) {
		SpringApplication.run(AguacateApplication.class, args);
		//testA();
		//testB();
		//testC();
		testD();
	}

	public static void testD(){
		
	}

	public static void testC(){
		ApplicationContext context = new AnnotationConfigApplicationContext(Configurator.class);
		Generador pdf = (Generador) context.getBean("generadorPDFBean");
		Generador xml = (Generador) context.getBean("generadorXMLBean");
		pdf.generar("InformePelicano.pdf");
		pdf.generar("ReportePeliminario.xml");
	}

	public static void testB(){
		ApplicationContext context = new AnnotationConfigApplicationContext(Configurator.class);
		Greeter obj = (Greeter) context.getBean("greeterBean");
		obj.saludar("");
		obj.saludar("Mariana");
	}

	public static void testA() {
		ApplicationContext context = new AnnotationConfigApplicationContext(Configurator.class);
		Datos obj = (Datos) context.getBean("datosBean");
		obj.listarPropiedades();
	}

}
