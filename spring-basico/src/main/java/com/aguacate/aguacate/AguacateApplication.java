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
import com.aguacate.aguacate.model.Contenedor;
import com.aguacate.aguacate.model.Modelo;
import com.aguacate.aguacate.model.Individuo;
import com.aguacate.aguacate.contenedor.ContenedorServ;


@SpringBootApplication
public class AguacateApplication {

	public static void main(String[] args) {
		//Esto se comenta cuando se usa XML
		//SpringApplication.run(AguacateApplication.class, args);
		
		//testA();
		//testB();
		//testC();
		//testD();
		testE();
	}

	public static void testE(){
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-beans.xml");
		Individuo individuo = (Individuo) context.getBean("individuoBean");
		System.out.println(individuo);

		individuo = (Individuo) context.getBean("individuoBeanTwo");
		System.out.println(individuo);

		context = new ClassPathXmlApplicationContext("my-beans.xml");
		ContenedorServ contenedor = (ContenedorServ) context.getBean("contenedorServBean");
		contenedor.ejecutar();

		contenedor = (ContenedorServ) context.getBean("contenedorServBeanTwo");
		contenedor.ejecutar();

		((ConfigurableApplicationContext)context).close();

	}


	public static void testD(){
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-beans.xml");
		HolaMundo holaMundo = (HolaMundo) context.getBean("holaMundoBean");
		System.out.println("Hola, "+holaMundo.getSaludo());
		

		context = new ClassPathXmlApplicationContext("spring-beans.xml");
		Alumno alumnoBean = (Alumno) context.getBean("alumnoBeanTwo");
		System.out.println(alumnoBean);

		alumnoBean = (Alumno) context.getBean("alumnoBeanThree");
		System.out.println(alumnoBean);

		String documento = "MiDocumento.pdf";
		context = new ClassPathXmlApplicationContext("spring-beans.xml");
		Contenedor contenedor = (Contenedor) context.getBean("contenedorBean");
		contenedor.generar(documento);

		context = new ClassPathXmlApplicationContext("my-beans.xml");
		Modelo modelo = (Modelo) context.getBean("modeloBean");
		System.out.println(modelo);

		context = new ClassPathXmlApplicationContext("my-beans.xml");
		alumnoBean = (Alumno) context.getBean("alumnoBeanFour");
		System.out.println(alumnoBean);

		context = new ClassPathXmlApplicationContext("my-beans.xml");
		alumnoBean = (Alumno) context.getBean("alumnoBeanFive");
		System.out.println(alumnoBean);

		context = new ClassPathXmlApplicationContext("my-beans.xml");
		alumnoBean = (Alumno) context.getBean("alumnoBeanSix");
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

		AnnotationConfigApplicationContext contextConfig = new AnnotationConfigApplicationContext();
		contextConfig.register(Configurator.class);
		contextConfig.refresh();

		HolaMundo holaMundoTwo = (HolaMundo) context.getBean("holaMundoBean");
		holaMundoTwo.setSaludo("General Dominguez");
		System.out.println("Hola, "+holaMundoTwo.getSaludo());

		((ConfigurableApplicationContext)context).close();
	}

}
