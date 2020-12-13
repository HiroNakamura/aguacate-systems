package org.inforhomex.mqspring.model;


public class Pojo{
	private String field;

	public Pojo(){}

	public String getField(){
		return field;
	}

	public void setField(String field){
		this.field = field;
	}

	@Override
	public String toString(){
		return "Pojo{field="+this.field+"}";
	}

}