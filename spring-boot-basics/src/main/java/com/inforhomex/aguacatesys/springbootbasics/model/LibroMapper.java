package com.inforhomex.aguacatesys.springbootbasics.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

public class LibroMapper implements RowMapper<Libro>{
    public Libro mapRow(ResultSet resultSet, int i) throws SQLException {
		Libro libro = new Libro();
        libro.setId(resultSet.getInt("id"));
        libro.setTitulo(resultSet.getString("titulo"));
        libro.setIsbn(resultSet.getString("isbn"));
        libro.setAutor(resultSet.getString("autor"));
        libro.setEditorial(resultSet.getString("editorial"));
        libro.setPaginas(resultSet.getInt("paginas"));
		return libro;
	}
}