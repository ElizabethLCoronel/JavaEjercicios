package com.OpenBootcamp;

import java.util.Scanner;

/**
 * En este ejercicio se crea una función que recibe un precio y devuelva el precio con el IVA incluido
 */
public class Ejercicio02 {
    public static void main(String[] args) {


        System.out.println("El precio mas iva es de: " + getPrecio(52.15f));

    }

    static float getPrecio(float precio) {

        float precioIva = precio * 1.16f;
        return precioIva;
    }

}
