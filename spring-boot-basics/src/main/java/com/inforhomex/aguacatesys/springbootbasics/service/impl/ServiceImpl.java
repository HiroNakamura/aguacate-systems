package com.inforhomex.aguacatesys.springbootbasics.service.impl;

import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import com.inforhomex.aguacatesys.springbootbasics.service.IService;
import com.inforhomex.aguacatesys.springbootbasics.model.Libro;
import com.inforhomex.aguacatesys.springbootbasics.model.LibroMapper;
import java.util.List;


@Service("serviceImpl")
public class ServiceImpl implements IService<Libro>{

    private final String SQL_GET_ALL = "select * from public.libro";
    private JdbcTemplate jdbcTemplate;

    @Autowired
	public ServiceImpl(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

    @Override
    public List<Libro> getAllObjects(){
        return this.jdbcTemplate.query(SQL_GET_ALL, new LibroMapper());
    }

    @Override
    public List<Map<String,Object>> getAllMensajes(){
        return null;
    }
    
}