package com.aguacate.aguacate.model;

import org.springframework.stereotype.Component;
import com.aguacate.aguacate.interfaces.IEquipo;


@Component
public class Napoles implements IEquipo{
	
	@Override
	public String mostrar(){
		return "Napoles FC";
	}

}