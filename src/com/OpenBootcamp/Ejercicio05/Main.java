package com.OpenBootcamp.Ejercicio05;

public class Main {


    public static void main(String[] args) {

        CocheCRUD cocheCRUD = new CocheCRUDImpl();
        cocheCRUD.findAll();
        cocheCRUD.save(new Coche());
        cocheCRUD.delete();
    }
}
