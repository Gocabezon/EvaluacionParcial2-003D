/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package teslafleet;

import cl.duoc.modelos.Auto;
import cl.duoc.modelos.Moto;
import cl.duoc.modelos.BicicletaElectrica;
import cl.duoc.modelos.ClassAux;
import java.util.Scanner;


/**
 *
 * @author Cetecom
 */
public class TeslaFleet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Scanner entrada2 = new Scanner(System.in);
        int opcion = 0, numPasajeros;
        int opcion2 = 0;
        String mantenimiento;
        String ID;
        
        ClassAux listaVehiculos = new ClassAux();
        
        
        while (opcion != 3){
        
        Auto auto = new Auto();
        Moto moto = new Moto();
        BicicletaElectrica biciElectr = new BicicletaElectrica();
        
        
        System.out.println("Bienvenido a TeslaFleet");
        System.out.println("Seleccione una opcion");
        System.out.println("1] Agregar Vehiculo");
        System.out.println("2] Calcular costo Vehiculo");
        System.out.println("3] Listar Vehiculos");
        System.out.println("4] Salir");
        
        opcion = entrada.nextInt();
        
        switch (opcion){
            case 1:
                while (opcion2 !=9){
                System.out.println("Ingrese tipo de vehiculo ( [1] Auto, [2] Moto o [3] Bicicleta) [9] para volver");
                opcion2 = entrada.nextInt();
                
                switch (opcion2){
                    case 1:
                        System.out.println("Ingrese numero de pasajeros");
                        numPasajeros = entrada2.nextInt();
                        auto.setNumPasajeros(numPasajeros);
                        System.out.println("Ingrese si el auto tiene autopilot [y/n]");
                        String autopilotRespuesta = entrada2.nextLine();
                        if (autopilotRespuesta=="y"){
                            auto.setAutoPilot(true);
                        } else{
                            auto.setAutoPilot(false);
                        }
                        System.out.println("¿El vehiculo necesita mantenimiento? [y/n]");
                        mantenimiento = entrada2.nextLine();
                        if (mantenimiento =="y"){
                            auto.setMantenimiento(true);
                        }else{
                            auto.setMantenimiento(false);
                        }
                        System.out.println("Ingrese ID de vehiculo");
                        ID = entrada2.nextLine();
                        if (listaVehiculos.buscarVehiculoID(ID)){
                            listaVehiculos.addVehiculos(auto);
                        }
                        
                        
                        
                        
                        
                        break;
                    case 2:
                        System.out.println("Ingrese capacidad de bateria (MAH)");
                        int capBateria = entrada2.nextInt();
                        moto.setCapBateria(capBateria);
                        System.out.println("¿Tiene asistencia en modo eco?[y/n]");
                        String modoEco = entrada2.nextLine();
                        if (modoEco=="y"){
                            moto.setAsistEco(true);
                        }else{
                            moto.setAsistEco(false);
                        }
                        System.out.println("¿El vehiculo necesita mantenimiento? [y/n]");
                        mantenimiento = entrada2.nextLine();
                        if (mantenimiento =="y"){
                            auto.setMantenimiento(true);
                        }else{
                            auto.setMantenimiento(false);
                        }
                         System.out.println("Ingrese ID de vehiculo");
                        ID = entrada2.nextLine();
                        if (listaVehiculos.buscarVehiculoID(ID)){
                            listaVehiculos.addVehiculos(moto);
                        }
                        
                        
                        break;

                    case 3 :
                        System.out.println("Ingrese el tipo de freno");
                        String tipoFreno = entrada2.nextLine();
                        biciElectr.setTipoFreno(tipoFreno);
                        System.out.println("Ingrese capacidad de bateria (en KM)");
                        float capBateriaBici = entrada2.nextFloat();
                        biciElectr.setCapBateria(capBateriaBici);
                         System.out.println("¿El vehiculo necesita mantenimiento? [y/n]");
                        mantenimiento = entrada2.nextLine();
                        if (mantenimiento =="y"){
                            auto.setMantenimiento(true);
                        }else{
                            auto.setMantenimiento(false);
                        }
                         System.out.println("Ingrese ID de vehiculo");
                        ID = entrada2.nextLine();
                        if (listaVehiculos.buscarVehiculoID(ID)){
                            listaVehiculos.addVehiculos(biciElectr);
                        }
                        
                        
                        break;
                        
                        
                        
                        
                }
                
                
                }
            case 2:
                while (opcion2 !=9){
                System.out.println("Ingrese tipo de vehiculo ( [1] Auto, [2] Moto o [3] Bicicleta) [9] para volver");
                opcion2 = entrada2.nextInt();
                float horasRenta = 0;
                    switch(opcion2){
                        case 1:
                            
                            System.out.println("Ingrese horas rentado");
                            horasRenta = entrada2.nextFloat();
                            
                            auto.calculoCostoFinal(horasRenta);
                            break;
                        case 2:
                            
                            System.out.println("Ingrese horas rentado");
                            horasRenta = entrada2.nextFloat();
                            
                            moto.calculoCostoFinal(horasRenta);
                            break;
                        case 3:
                            System.out.println("Ingrese horas rentado");
                            horasRenta = entrada2.nextFloat();
                            
                            biciElectr.calculoCostoFinal(horasRenta);
                    }
        }
            case 3:
                listaVehiculos.finalPrint();
                break;
                
            case 4:
                System.out.println("Saliendo del programa");
                break;
        }
        
        
        
        
        
        }
        
    }
    
}
