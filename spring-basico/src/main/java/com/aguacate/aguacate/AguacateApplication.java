package com.aguacate.aguacate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aguacate.aguacate.configurator.Configurator;
import com.aguacate.aguacate.interfaces.Datos;
import com.aguacate.aguacate.interfaces.Greeter;
import com.aguacate.aguacate.interfaces.Generador;
import com.aguacate.aguacate.model.Contenedor;
import com.aguacate.aguacate.model.Alumno;
import com.aguacate.aguacate.model.AlumnoBean;
import com.aguacate.aguacate.model.HolaMundo;


@SpringBootApplication
public class AguacateApplication {

	public static void main(String[] args) {
		//Esto se comenta cuando se usa XML
		//SpringApplication.run(AguacateApplication.class, args);
		
		testA();
		//testB();
		//testC();
		//testD();
	}

	public static void testD(){
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-beans.xml");
		HolaMundo holaMundo = (HolaMundo) context.getBean("holaMundoBean");
		System.out.println("Hola, "+holaMundo.getSaludo());
		

		context = new ClassPathXmlApplicationContext("spring-beans.xml");
		Alumno alumnoBean = (Alumno) context.getBean("alumnoBeanTwo");
		System.out.println(alumnoBean);
		
		((ConfigurableApplicationContext)context).close();
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

		context = new AnnotationConfigApplicationContext(Configurator.class);
		HolaMundo holaMundo = (HolaMundo) context.getBean("holaMundoBean");
		holaMundo.setSaludo("General Arteaga");
		System.out.println("Hola, "+holaMundo.getSaludo());

		((ConfigurableApplicationContext)context).close();
	}

}
