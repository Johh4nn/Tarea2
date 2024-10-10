package org.example;

public class libro {

    //titulo (String) autor (String) paginaCount (int)
    public  String titulo;
    public  String autor;
    public  int paginaCount;

    public libro(String titulo, String autor, int paginaCount) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginaCount = paginaCount;
    }

    public void infoLibro(){
        System.out.println("El titulo del libro: "+titulo+" su autor es:"+autor+" tiene este numero de paginas: "+paginaCount);
    }

}

