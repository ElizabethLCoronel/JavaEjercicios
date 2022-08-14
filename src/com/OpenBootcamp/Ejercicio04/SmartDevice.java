package com.OpenBootcamp.Ejercicio04;

public class SmartDevice {

    protected String comunicaciones; //Bluetooth, NFC, WIFI, USB o red celular
    protected Boolean pantalla;
    protected Boolean speakers;
    protected Boolean microfono;
    protected int volumen;

    public SmartDevice(){

    }

    public SmartDevice(String comunicaciones, Boolean pantalla, Boolean speakers, Boolean microfono, int volumen) {
        this.comunicaciones = comunicaciones;
        this.pantalla = pantalla;
        this.speakers = speakers;
        this.microfono = microfono;
        this.volumen = volumen;
    }

    public void Volumen(int cantidad){
        this.volumen += cantidad;
    }

    @Override
    public String toString() {
        return "SmartDevice{" +
                "comunicaciones='" + comunicaciones + '\'' +
                ", pantalla=" + pantalla +
                ", speakers=" + speakers +
                ", microfono=" + microfono +
                ", volumen=" + volumen +
                '}';
    }
}
