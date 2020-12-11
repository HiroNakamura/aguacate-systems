package com.inforhomex.aguacatesys.springbootbasics.restcontroller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import com.inforhomex.aguacatesys.springbootbasics.model.Mensajes;
import com.inforhomex.aguacatesys.springbootbasics.model.Libro;
import com.inforhomex.aguacatesys.springbootbasics.service.impl.MensajesImpl;
import com.inforhomex.aguacatesys.springbootbasics.service.impl.ServiceImpl;
import java.util.List;


@RestController
@RequestMapping("/rest")
public class AppRestController{

    @Autowired
    @Qualifier("serviceImpl")
    private ServiceImpl servicioLibros;

    @Autowired
    @Qualifier("mensajesImpl")
    private MensajesImpl mensajesImpl;

    //http://localhost:8081/rest/saludo
    @GetMapping("/saludo")
    public String saludo(){
        StringBuilder sb = new StringBuilder();
        sb.append("Hola, amigos desde un saludo REST!!");
        return sb.toString();
    }

    //http://localhost:8081/rest/mensajes
    @GetMapping("/mensajes")
    public List<Mensajes> getMensajes(){
        return this.mensajesImpl.getAllObjects();
    }

    //http://localhost:8081/rest/libros
    @GetMapping("/libros")
    public List<Libro> getLibros(){
        return this.servicioLibros.getAllObjects();
    }
}