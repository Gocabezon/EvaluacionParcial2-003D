/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.modelos;

/**
 *
 * @author Cetecom
 */
public class BicicletaElectrica extends Vehiculo {
    private String tipoFreno;
    private float capBateria;

    public BicicletaElectrica() {
    }

    public BicicletaElectrica(String tipoFreno, int capBateria, String idVehiculo, boolean mantenimiento) {
        super(idVehiculo, mantenimiento);
        this.tipoFreno = tipoFreno;
        this.capBateria = capBateria;
    }

    

    public String getTipoFreno() {
        return tipoFreno;
    }

    public void setTipoFreno(String tipoFreno) {
        this.tipoFreno = tipoFreno;
    }

    public float getCapBateria() {
        return capBateria;
    }

    public void setCapBateria(float capBateria) {
        this.capBateria = capBateria;
    }

    @Override
    public String toString() {
        return "BicicletaElectrica{" + "tipoFreno=" + tipoFreno + ", capBateria=" + capBateria + '}';
    }
    
    @Override
    public String toStringFull() {
        return "Vehiculo{" + "idVehiculo=" + getIdVehiculo() + ", mantenimiento=" + isMantenimiento() + '}' +  "BicicletaElectrica{" + "tipoFreno=" + tipoFreno + ", capBateria=" + capBateria + '}';
    }

    @Override
    public void calculoCostoFinal(float horas) {
        float costoFinal;
        if (capBateria < 20){
            costoFinal = (float) (VALOR_HORA_ALQUILER * 0.95*horas);
        }
        else{
            costoFinal = VALOR_HORA_ALQUILER*horas;
        }
        System.out.println("El costo total del arriendo es de " + costoFinal);
    }
}
