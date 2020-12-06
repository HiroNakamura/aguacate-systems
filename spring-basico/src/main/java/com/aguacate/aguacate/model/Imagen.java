package com.aguacate.aguacate.model;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Imagen implements InitializingBean, DisposableBean{
	private int id;
	private String nombre;
	private int altura;
	private int anchura;

	public Imagen(){}

	public Imagen(int id, String nombre, int altura, int anchura){
		super();
		this.id = id;
		this.nombre = nombre;
		this.altura = altura;
		this.anchura = anchura;
	}

	public Imagen(int id, String nombre){
		super();
		this.id=id;
		this.nombre=nombre;
	}

	public int getId(){
		return id;
	}

	public void setId(int id){
		this.id = id;
	}

	public String getNombre(){
		return nombre;
	}

	public void setNombre(String nombre){
		this.nombre = nombre;
	}

	public int getAltura(){
		return altura;
	}

	public void setAltura(int altura){
		this.altura = altura;
	}

	public int getAnchura(){
		return anchura;
	}

	public void setAnchura(int anchura){
		this.anchura= anchura;
	}

	@Override
	public void afterPropertiesSet() throws Exception{
		System.out.println("Antes de iniciar el bean Imagen!!");
	}

	@Override
	public void destroy() throws Exception{
		System.out.println("Se destruye el bean Imagen!!");
	}

	@Override
	public String toString(){
		return "Imagen{id: "+this.id+",nombre: "+this.nombre+",altura: "+this.altura+",anchura: "+this.anchura+"}";
	}
}