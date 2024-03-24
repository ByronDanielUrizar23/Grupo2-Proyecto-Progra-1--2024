package com.mycompany.mavenproject1;

public class Vehiculo {

    protected String marcaC;
    protected String colorC;

    public Vehiculo (String marcaC, String colorC){
        this.colorC = colorC;
        this.marcaC = marcaC;
    }

    public String getMarcaC() {
        return marcaC;
    }

    public String getColorC() {
        return colorC;
    }
    
}
