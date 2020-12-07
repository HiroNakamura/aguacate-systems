package com.inforhomex.aguacatesys.springbootbasics.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.IndexDirection;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import javax.validation.constraints.NotNull;

@Document(collection = "mensajes")
@JsonPropertyOrder({"_id", "idioma","mensaje"})
public class Mensajes implements java.io.Serializable{

    private static final long serialVersionUID = -7788619177798333712L;

    @Id
    @NotNull
    private String id;
    private String idioma;
    private String mensaje;

    public Mensajes(){}

    public Mensajes(String id, String idioma, String mensaje){
        this.id = id;
        this.idioma = idioma;
        this.mensaje = mensaje;
    }

    public String getId(){
        return id;
    }

    public void setId(String id){
        this.id = id;
    }

    public String getIdioma(){
        return idioma;
    }

    public void setIdioma(String idioma){
        this.idioma = idioma;
    }

    public String getMensaje(){
        return mensaje;
    }

    public void setMensaje(String mensaje){
        this.mensaje = mensaje;
    }

    @Override
    public String toString(){
        return "Mensajes{id: "+this.id+", idioma: "+this.idioma+", mensaje: "+this.mensaje+"}";
    }
} 