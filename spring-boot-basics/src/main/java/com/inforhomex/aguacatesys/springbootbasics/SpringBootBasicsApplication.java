package com.inforhomex.aguacatesys.springbootbasics;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.inforhomex.aguacatesys.springbootbasics.model.Libro;
import com.inforhomex.aguacatesys.springbootbasics.config.AppConfig;
import com.inforhomex.aguacatesys.springbootbasics.dao.LibroDAO;


@SpringBootApplication
public class SpringBootBasicsApplication {

	public static void main(String[] args) {
		//Se comenta para ejecutar operaciones JDBC en la clase main
		SpringApplication.run(SpringBootBasicsApplication.class, args);
		//testA();
	}

	public static void testA(){
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		LibroDAO libroDAO = context.getBean(LibroDAO.class);
		System.out.println("\tLista de libros:");
		for (Libro libro : libroDAO.getAllLibros()) {
			System.out.println(libro);
		}

		System.out.println("\n\tObtener libro con id 2:");
		Libro libroById = libroDAO.getLibroById(2);
		System.out.println(libroById);

		System.out.println("\n\tBorrando libro con id 2");
		libroDAO.deleteLibro(libroById);

		System.out.println("\n\tActualizando libro con id 4");

		Libro myLibro = libroDAO.getLibroById(4);
		myLibro.setEditorial("EDITORIAL GARCIA");
		libroDAO.updateLibro(myLibro);

		System.out.println("\n\tLista de libros:");
		for (Libro lib : libroDAO.getAllLibros()) {
			System.out.println(lib);
		}
		
		/*System.out.println("\n\tCreando libro: ");
		Libro libro = new Libro();
		libro.setId(5);
		libro.setTitulo("El libro de las verdades y... las mentiras");
		libro.setIsbn("1234-GHJ-322");
		libro.setAutor("Joaquin Perdave");
		libro.setEditorial("EDITORIAL AZTECA");
		libro.setPaginas(333);
		System.out.println(libro);
		libroDAO.createLibro(libro);
		System.out.println("\n\tLista de libros:");
		for (Libro lib : libroDAO.getAllLibros()) {
			System.out.println(lib);
		}*/

		context.close();
	}

}
