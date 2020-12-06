package com.aguacate.aguacate.model;

import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.BeansException;


public class MyBeanPostProcessor implements BeanPostProcessor{

	@Override
	public Object postProcessAfterInitialization(Object bean, String nombreBean) throws BeansException{
		System.out.println("Se inicia metodo postProcessorAfter... "+nombreBean);
		return bean;
	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String nombreBean) throws BeansException{
		System.out.println("Se inicia metodo postProcessorBefore... "+nombreBean);
		return bean;
	}

}