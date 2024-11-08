/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.modelos;

import java.util.Scanner;

/**
 *
 * @author Cetecom
 */
public class Moto extends Vehiculo {
    private int capBateria;
    private boolean asistEco;

    public Moto() {
    }


    public Moto(int capBateria, boolean asistEco, String idVehiculo, boolean mantenimiento) {
        super(idVehiculo, mantenimiento);
        this.capBateria = capBateria;
        this.asistEco = asistEco;
    }

    public int getCapBateria() {
        return capBateria;
    }

    public void setCapBateria(int capBateria) {
        this.capBateria = capBateria;
    }

    public boolean isAsistEco() {
        return asistEco;
    }

    public void setAsistEco(boolean asistEco) {
        this.asistEco = asistEco;
    }

    @Override
    public String toString() {
        return "Moto{" + "capBateria=" + capBateria + ", asistEco=" + asistEco + '}';
    }
    
    
    @Override
    public String toStringFull () {
        return "Vehiculo{" + "idVehiculo=" + getIdVehiculo() + ", mantenimiento=" + isMantenimiento() + '}' + "Moto{" + "capBateria=" + capBateria + ", asistEco=" + asistEco + '}';
    }
    
    @Override
    public void calculoCostoFinal(float horas) {
        Scanner entrada = new Scanner(System.in);
        float horasEco;
        float costoFinal;
        System.out.println("Ingrese numero de horas en modo Eco");
        horasEco = entrada.nextFloat();
        
        if (horasEco > horas/2){
            costoFinal = (float) (VALOR_HORA_ALQUILER * 1.08*horas);
        }
        else{
            costoFinal = VALOR_HORA_ALQUILER*horas;
        }
        System.out.println("El costo total del arriendo es de " + costoFinal);
            
}
    }

