package com.aguacate.aguacate.contenedor;

import com.aguacate.aguacate.interfaces.IServicio;

public class ContenedorServ{
    private IServicio servicio;

    public ContenedorServ(){}

    public ContenedorServ(IServicio servicio){
        this.servicio = servicio;
    }

    public IServicio getServicio(){
        return servicio;
    }

    public void setServicio(IServicio servicio){
        this.servicio = servicio;
    }

    public void ejecutar(){
        this.getServicio().abrir();
    }

}