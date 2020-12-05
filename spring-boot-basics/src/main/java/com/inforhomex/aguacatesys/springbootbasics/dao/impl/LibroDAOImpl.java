package com.inforhomex.aguacatesys.springbootbasics.dao.impl;

import com.inforhomex.aguacatesys.springbootbasics.dao.LibroDAO;
import java.util.List;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import com.inforhomex.aguacatesys.springbootbasics.model.Libro;
import com.inforhomex.aguacatesys.springbootbasics.model.LibroMapper;


@Component
public class LibroDAOImpl implements LibroDAO{

    private JdbcTemplate jdbcTemplate;

    private final String SQL_FIND_LIBRO = "select * from public.libro where id = ?";
	private final String SQL_DELETE_LIBRO = "delete from public.libro where id = ?";
	private final String SQL_UPDATE_LIBRO = "update public.libro set first_name = ?, last_name = ?, age  = ? where id = ?";
	private final String SQL_GET_ALL = "select * from public.libro";
	private final String SQL_INSERT_LIBRO = "insert into public.libro(id, first_name, last_name, age) values(?,?,?,?)";

	@Autowired
	public LibroDAOImpl(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	public Libro getLibroById(int id) {
		return null;//jdbcTemplate.queryForObject(SQL_FIND_LIBRO, new Object[] { id }, new LibroMapper());
	}

	public List<Libro> getAllLibros() {
		return null;//jdbcTemplate.query(SQL_GET_ALL, new LibroMapper());
	}

	public boolean deleteLibro(Libro libro) {
		return false;//jdbcTemplate.update(SQL_DELETE_LIBRO, libro.getId()) > 0;
	}

	public boolean updateLibro(Libro libro) {
		return false;//jdbcTemplate.update(SQL_UPDATE_LIBRO, libro.getFirstName(), person.getLastName(), person.getAge(),person.getId()) > 0;
	}

	public boolean createLibro(Libro libro) {
		return false;//jdbcTemplate.update(SQL_INSERT_LIBRO, libro.getId(), person.getFirstName(), person.getLastName(),person.getAge()) > 0;
	}

}