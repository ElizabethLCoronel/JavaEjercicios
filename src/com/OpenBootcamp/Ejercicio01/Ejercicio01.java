package com.OpenBootcamp.Ejercicio01;

public class Ejercicio01 {
    public static void main(String[] args) {

        //1. numericos

        //1.1 enteros
        byte numEntero1 = 5;
        short numEntero2 = 10;
        int numEntero3 = 30;
        long numEntero4 = 100;
        System.out.println("Numeros enteros: \n" + numEntero1 + " , " + numEntero2 + " , " + numEntero3 + " , " + numEntero4);




        //1.2 decimales
        float numDecimal1 = 5.5f;
        double numDecimal2 = 10.5d;
        System.out.println("Decimales: \n" + numDecimal1 + " , " + numDecimal2);


        //2. booleano
        boolean falso = false;
        boolean verdadero = true;


        //3. texto
        char unCaracter = 'a';
        String cadenaTexto = "Lorem ipsum dolor sit amet...";

        System.out.println("Textos: " + "\nTipo Char: "+ unCaracter + "" + "\nCadena de Texto: " +cadenaTexto );
    }
}
