package com.inforhomex.aguacatesys.springbootbasics.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.inforhomex.aguacatesys.springbootbasics.model.Libro;
import com.inforhomex.aguacatesys.springbootbasics.util.Constantes;
import com.inforhomex.aguacatesys.springbootbasics.service.impl.MensajesImpl;
import com.inforhomex.aguacatesys.springbootbasics.service.impl.ServiceImpl;


@Controller
@RequestMapping("/app")
public class AppController{

    @Autowired
    @Qualifier("serviceImpl")
    private ServiceImpl servicioLibros;

    @Autowired
    @Qualifier("mensajesImpl")
    private MensajesImpl mensajesImpl;

    //http://localhost:8081/app/index
    @GetMapping("/index")
    public ModelAndView index(){
        ModelAndView mav = new ModelAndView(Constantes.INDEX);
        mav.addObject("bienvenida", new String("Bienvenido al mundo Spring!!"));
        return mav;
    }

    //http://localhost:8081/app/libros
    @GetMapping("libros")
    public ModelAndView libros(){
    	ModelAndView mav = new ModelAndView(Constantes.LIBROS);
        mav.addObject("titulo",new String("Librería de libros"));
        mav.addObject("libros", this.servicioLibros.getAllObjects());
    	return mav;
    }

    //http://localhost:8081/app/mensajes
    @GetMapping("mensajes")
    public ModelAndView mensajes(){
    	ModelAndView mav = new ModelAndView(Constantes.MENSAJES);
        mav.addObject("titulo",new String("Mensajes desde MongoDb"));
        mav.addObject("mensajes", this.mensajesImpl.getAllObjects());
    	return mav;
    }

}