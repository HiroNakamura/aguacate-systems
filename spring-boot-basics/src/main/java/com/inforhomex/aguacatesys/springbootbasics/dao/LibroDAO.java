package com.inforhomex.aguacatesys.springbootbasics.dao;

import java.util.List;
import com.inforhomex.aguacatesys.springbootbasics.model.Libro;

public interface LibroDAO {
	Libro getLibroById(int id);
	List<Libro> getAllLibros();
	boolean deleteLibro(Libro libro);
	boolean updateLibro(Libro libro);
	boolean createLibro(Libro libro);
}