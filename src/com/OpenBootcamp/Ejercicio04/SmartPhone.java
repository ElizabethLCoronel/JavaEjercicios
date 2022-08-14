package com.OpenBootcamp.Ejercicio04;

public class SmartPhone extends SmartDevice{

    int numCamaras;
    boolean camaraAnterior;
    boolean camaraPosterior;
    boolean botonBiometrico;

    public SmartPhone (){

    }

    public SmartPhone(String comunicaciones, Boolean pantalla, Boolean speakers, Boolean microfono, int volumen, int numCamaras, boolean camaraAnterior, boolean camaraPosterior, boolean botonBiometrico) {
        super(comunicaciones, pantalla, speakers, microfono, volumen);
        this.numCamaras = numCamaras;
        this.camaraAnterior = camaraAnterior;
        this.camaraPosterior = camaraPosterior;
        this.botonBiometrico = botonBiometrico;
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "numCamaras=" + numCamaras +
                ", camaraAnterior=" + camaraAnterior +
                ", camaraPosterior=" + camaraPosterior +
                ", botonBiometrico=" + botonBiometrico +
                ", comunicaciones='" + comunicaciones + '\'' +
                ", pantalla=" + pantalla +
                ", speakers=" + speakers +
                ", microfono=" + microfono +
                ", volumen=" + volumen +
                '}';
    }
}
