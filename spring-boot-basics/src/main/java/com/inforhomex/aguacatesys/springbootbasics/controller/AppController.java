package com.inforhomex.aguacatesys.springbootbasics.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.inforhomex.aguacatesys.springbootbasics.model.Libro;


@Controller
@RequestMapping("/app")
public class AppController{

    public static final String INDEX = "index";
    public static final String LIBROS = "libros";

    //http://localhost:8081/app/index
    @GetMapping("/index")
    public ModelAndView index(){
        ModelAndView mav = new ModelAndView(INDEX);
        mav.addObject("bienvenida", new String("Bienvenido al mundo Spring!!"));
        return mav;
    }

    //http://localhost:8081/app/libros
    @GetMapping("/libros")
    public ModelAndView libros(){
    	ModelAndView mav = new ModelAndView(LIBROS);
    	mav.addObject("titulo",new String("Librería de libros"));
    	return mav;
    }

}