package com.mycompany.mavenproject1;

import java.util.Scanner;

public class Avion extends Vehiculo {

    static void avion() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private int capPasajero;

    public Avion(String marcaC, String colorC, int capPasajero) {
        super(marcaC, colorC);
        this.capPasajero = capPasajero;
    }

    public int getCapPasajero() {
        return capPasajero;
    }

    @Override
    public String getMarcaC() {
        return marcaC;
    }

    @Override
    public String getColorC() {
        return colorC;
    }

    public void ingresarDatosVehiculo() {
        Scanner mdc = new Scanner(System.in);
        System.out.print("¿De que marca es su vehiculo?");
        marcaC = mdc.nextLine();
        System.out.print("¿De que color es su vehiculo?" + getColorC());
        colorC = mdc.nextLine();
        System.out.print("¿Que cantidad de pasajeros son en el avion?" + getCapPasajero());
	capPasajero = mdc.nextInt();
    }
}
