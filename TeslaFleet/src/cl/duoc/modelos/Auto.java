/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.modelos;

/**
 *
 * @author Cetecom
 */
public class Auto extends Vehiculo {
    private int numPasajeros;
    private boolean autoPilot;

    public Auto() {
    }

    public Auto(int numPasajeros, boolean autoPilot, String idVehiculo, boolean mantenimiento) {
        super(idVehiculo, mantenimiento);
        this.numPasajeros = numPasajeros;
        this.autoPilot = autoPilot;
    }

    

    public int getNumPasajeros() {
        return numPasajeros;
    }

    public void setNumPasajeros(int numPasajeros) {
        this.numPasajeros = numPasajeros;
    }

    public boolean isAutoPilot() {
        return autoPilot;
    }

    public void setAutoPilot(boolean autoPilot) {
        this.autoPilot = autoPilot;
    }

    @Override
    public String toString() {
        return "Auto{" + "numPasajeros=" + numPasajeros + ", autoPilot=" + autoPilot + '}';
    }
    
    @Override
     public String toStringFull() {
        return "Vehiculo{" + "idVehiculo=" + getIdVehiculo() + ", mantenimiento=" + isMantenimiento() + '}' + "Auto{" + "numPasajeros=" + numPasajeros + ", autoPilot=" + autoPilot + '}';
    }
     
   
    @Override
    public void calculoCostoFinal(float horas) {
        float costoFinal;
        if (autoPilot == true){
            costoFinal = (float) (VALOR_HORA_ALQUILER * 1.1*horas);
        }
        else{
            costoFinal = VALOR_HORA_ALQUILER*horas;
        }
        System.out.println("El costo total del arriendo es de " + costoFinal);
        
    }
}
