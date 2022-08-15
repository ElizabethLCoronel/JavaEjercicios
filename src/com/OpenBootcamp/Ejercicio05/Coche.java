package com.OpenBootcamp.Ejercicio05;

public class Coche {

    String marca;
    int year;
    String modelo;
    String vin;
    String paisOrigen;
    String numMotor;

    public Coche(){

    }

    public Coche(String marca, int year, String modelo, String vin, String paisOrigen, String numMotor) {
        this.marca = marca;
        this.year = year;
        this.modelo = modelo;
        this.vin = vin;
        this.paisOrigen = paisOrigen;
        this.numMotor = numMotor;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "marca='" + marca + '\'' +
                ", year=" + year +
                ", modelo='" + modelo + '\'' +
                ", vin='" + vin + '\'' +
                ", paisOrigen='" + paisOrigen + '\'' +
                ", numMotor='" + numMotor + '\'' +
                '}';
    }
}
