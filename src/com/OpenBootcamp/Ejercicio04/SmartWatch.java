package com.OpenBootcamp.Ejercicio04;

public class SmartWatch extends SmartDevice {

    String colorCorrea;
    String modeloSmartWatch;
    Boolean coronaDigita;

    public SmartWatch(){

    }


    public SmartWatch(String comunicaciones, Boolean pantalla, Boolean speakers, Boolean microfono,int volumen,String colorCorrea, String modeloSmartWatch, Boolean coronaDigita) {
        super(comunicaciones, pantalla, speakers, microfono, volumen);
        this.colorCorrea = colorCorrea;
        this.modeloSmartWatch = modeloSmartWatch;
        this.coronaDigita = coronaDigita;
    }

    @Override
    public String toString() {
        return "SmartWatch{" +
                "colorCorrea='" + colorCorrea + '\'' +
                ", modeloSmartWatch='" + modeloSmartWatch + '\'' +
                ", coronaDigita=" + coronaDigita +
                ", comunicaciones='" + comunicaciones + '\'' +
                ", pantalla=" + pantalla +
                ", speakers=" + speakers +
                ", microfono=" + microfono +
                ", volumen=" + volumen +
                '}';
    }
}
