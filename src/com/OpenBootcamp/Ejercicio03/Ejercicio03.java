package com.OpenBootcamp.Ejercicio03;

/**
 * Crear un bucle que permita concatenar textos e imprima el resultado final por consola.
 * Concatenar nombres
 * Los textos pueden venir de un array String
 * String[] nombres = {"", "", ""}
 * Separados por un espacio
 * Se puede usar el método concat o si no el operador +
 */
public class Ejercicio03 {
    public static void main(String[] args) {

        String[] nombres = {"Elizabeth", "Alejandro", "Daniela", "Araceli", "Ariana"};

        String resulConcatenar = "";

        for (String nombre : nombres) {
            resulConcatenar += nombre + " ";
        }
        System.out.println(resulConcatenar);

    }
}
