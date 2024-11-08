/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package cl.duoc.modelos;

/**
 *
 * @author Cetecom
 */
public interface IAlquiler {
    float VALOR_HORA_ALQUILER = 15000;
    
    
    void calculoCostoFinal (float horas);
    
    String toStringFull();
}
