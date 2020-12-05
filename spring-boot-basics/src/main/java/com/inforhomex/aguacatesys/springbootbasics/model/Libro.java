package com.inforhomex.aguacatesys.springbootbasics.model;


public class Libro {
    private int id;
    private String titulo;
    private String isbn;
    private String autor;
    private String editorial;
    private int paginas;

    public Libro(){}

    public Libro(int id,String titulo,String isbn,String autor,String editorial,int paginas){
        super();
        this.id = id;
        this.titulo = titulo;
        this.isbn = isbn;
        this.autor = autor;
        this.editorial = editorial;
        this.paginas = paginas;
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getTitulo(){
        return titulo;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public String getIsbn(){
        return isbn;
    }

    public void setIsbn(String isbn){
        this.isbn = isbn;
    }

    public String getAutor(){
        return autor;
    }

    public void setAutor(String autor){
        this.autor = autor;
    }

    public String getEditorial(){
        return editorial;
    }

    public void setEditorial(String editorial){
        this.editorial = editorial;
    }

    public int getPaginas(){
        return paginas;
    }

    public void setPaginas(int paginas){
        this.paginas = paginas;
    }
    
    @Override
    public String toString(){
        return "Libro{id: "+this.id+", titulo: "
        +this.titulo+", isbn: "+this.isbn
        +", autor: "+this.autor
        +", editorial: "
        +this.editorial
        +", paginas: "
        +this.paginas
        +"}";
    }

}