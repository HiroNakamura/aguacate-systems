package com.aguacate.aguacate.model;


import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class DatosImpl implements Datos{

   @Override
   public void listarPropiedades(){
       String[] nombres = {"java.home","java.vendor","java.version","os.arch","os.name","user.dir","user.home","user.name"};
       String[] descripcion= {"Java Home","Vendedor de Java","Version de Java","Sistema Operativo","Directorio","Directorio usuario","Directorio","Usuario"};
       List<String> propiedades = new ArrayList<>();
       int cont = 0;
       Properties pros = System.getProperties();
       for(String nombre: nombres){
           String propiedad = descripcion[cont]+" : "+String.valueOf(System.getProperty(nombre));
           propiedades.add(propiedad);
           cont++;
       }
       if(!propiedades.isEmpty()){
           System.out.println("**** Propiedades del sistema ****");
           for(String pro : propiedades){
               System.out.println(pro.toString());
           }
           System.out.println("**********************************");
       }
   }
}