package com.aguacate.aguacate.model;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;
import com.aguacate.aguacate.interfaces.IEquipo;


@Component
public class Jugador{
	private int numero;
	private String nombre;

	@Value("450")
	private int goles;
	
	//Con la anotacion @Autowired estamos inyectando la dependencia
	//Con la anotacion @Qualifier estamos especificando el bean a usar
	@Autowired
	@Qualifier("napolesQualifier")
	private IEquipo equipo;


	public Jugador(){}

	public Jugador(int numero, String nombre, IEquipo equipo){
		super();
		this.numero = numero;
		this.nombre = nombre;
		this.equipo = equipo;
	}

	public Jugador(int numero, String nombre,int goles, IEquipo equipo){
		super();
		this.numero = numero;
		this.nombre = nombre;
		this.equipo = equipo;
		this.goles = goles;
	}

	public Jugador(int numero, String nombre){
		super();
		this.numero = numero;
		this.nombre = nombre;
	}

	public int getNumero(){
		return numero;
	}

	public void setNumero(int numero){
		this.numero = numero;
	}

	public int getGoles(){
		return goles;
	}

	public void setGoles(int goles){
		this.goles = goles;
	}

	public String getNombre(){
		return nombre;
	}

	public void setNombre(String nombre){
		this.nombre = nombre;
	}

	public IEquipo getEquipo(){
		return equipo;
	}

	//El atributo marcado con la anotacion @Required
	//es obligatorio
	@Required
	public void setEquipo(IEquipo equipo){
		this.equipo = equipo;
	}

	public void mostrar(){
		System.out.println("Equipo: "+this.getEquipo().mostrar());
	}

	@Override
	public String toString(){
		return "Jugador{numero: "+this.numero+", nombre:"+this.nombre+", no. goles: "+this.goles+"}";
	}

}