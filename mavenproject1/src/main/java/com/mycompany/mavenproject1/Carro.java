package com.mycompany.mavenproject1;

import java.util.Scanner;

public class Carro extends Vehiculo {

    static void carro() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private String gasolinaC;

    public Carro(String marcaC, String colorC, String gasolinaC) {
        super(marcaC, colorC);  
        this.gasolinaC = gasolinaC;
    }

    public void setgasolinaC(String gasolinaC) {
        this.gasolinaC = gasolinaC;
    }

    public String getgasolinaC() {
        return gasolinaC;
    }

    public void ingresarDatosVehiculo() {
        Scanner mdc = new Scanner(System.in);

        System.out.print("¿De que marca es su vehiculo?");
        marcaC = mdc.nextLine();
        System.out.print("¿De que color es su vehiculo?");
        colorC = mdc.nextLine();
        System.out.print("¿Que tipo de gasolina usa su carro?");
	gasolinaC = mdc.nextLine();
    }
}
