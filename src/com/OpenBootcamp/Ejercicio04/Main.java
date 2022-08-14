package com.OpenBootcamp.Ejercicio04;

public class Main {
    public static void main(String[] args) {

        SmartDevice alexa = new SmartDevice("Bluetooth", false, true, true, 0);
        System.out.println("atributos Alexa: " + alexa);
        alexa.Volumen(10);
        System.out.println(alexa.volumen);

        SmartPhone iphone5 = new SmartPhone("Datos", true, true, true, 0,
                2, true, true, true);
        System.out.println("atributos iphone5: " + iphone5);
        iphone5.Volumen(5);
        System.out.println(iphone5.volumen);

        SmartWatch appleWatch7 = new SmartWatch("Bluetooth", true,true,true,0,
                "negro", "serie7", true);
        System.out.println("atributos appleWatch7: " + appleWatch7);
        appleWatch7.Volumen(7);
        System.out.println(appleWatch7.volumen);

    }
}
