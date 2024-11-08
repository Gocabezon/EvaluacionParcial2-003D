/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.modelos;

import java.util.ArrayList;


/**
 *
 * @author Cetecom
 */
public class ClassAux {
    
    private ArrayList <Vehiculo> vehiculosFlota = new ArrayList <>();

    public ClassAux() {
    }

    public ClassAux(ArrayList<Vehiculo> vehiculosFlota) {
        this.vehiculosFlota = vehiculosFlota;
    }

    public ArrayList<Vehiculo> getVehiculosFlota() {
        return vehiculosFlota;
    }

    public void setVehiculosFlota(ArrayList<Vehiculo> vehiculosFlota) {
        this.vehiculosFlota = vehiculosFlota;
    }

    public void addVehiculos(Vehiculo parVehiculo){
        vehiculosFlota.add(parVehiculo);
    }
    
    public void buscarVehiculo (Vehiculo parVehiculo){
         if (vehiculosFlota.contains(parVehiculo)){
             System.out.println("El vehiculo se encuentra en el indice " + vehiculosFlota.indexOf(parVehiculo));
            
         }else{
             System.out.println(" El vehiculo no se encuentra en el sistema");
         }
    }
    public boolean buscarVehiculoID (String ID){
        if (!vehiculosFlota.isEmpty()){
            for (Vehiculo vehiculosFlota1 : vehiculosFlota) {
                if (vehiculosFlota1.getIdVehiculo() == ID){
                    System.out.println("El vehiculo ya existe en el sistema");
                    return true;
            }else{
                  System.out.println("ID Vehiculo no encontrado");
                  return false;
                }
            }
            }else{
            System.out.println("Lista vacia");
        }
        return false;
        
        
    }
    
    
    
    
    @Override
    public String toString() {
        return "ClassAux{" + "vehiculosFlota=" + vehiculosFlota + '}';
    }
    
    public void finalPrint(){
        for (Vehiculo vehiculosFlota1 : vehiculosFlota){
            vehiculosFlota1.toStringFull();
        }
    }
     

    
 
    
    
}
