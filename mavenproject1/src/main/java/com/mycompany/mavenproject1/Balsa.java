package com.mycompany.mavenproject1;

public class Balsa extends Vehiculo {

    static void balsa() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private boolean tieneMotor;
    
    public Balsa(String marcaC, String colorC, boolean tieneMotor) {
        super(marcaC, colorC);
        this.tieneMotor = tieneMotor;
    }
        

    // Método para obtener el método de movimiento
    public String obtenerMetodoMovimiento() {
        if (tieneMotor) {
            return "motor";
        } else {
            return "remo";
        }
    }

    // Método para establecer si tiene motor
    public void setTieneMotor(boolean tieneMotor) {
        this.tieneMotor = tieneMotor;
    }
 // Método para verificar si tiene motor
    public boolean tieneMotor() {
        return tieneMotor;
    }
}
