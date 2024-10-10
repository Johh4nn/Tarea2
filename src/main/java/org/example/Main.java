package org.example;

public class Main {
    public static void main(String[] args) {

        libro l1= new libro("La divina comedia","Dante",544);
        libro l2= new libro("Iliada","Homero",320);

        l1.infoLibro();
        l2.infoLibro();
    }
}