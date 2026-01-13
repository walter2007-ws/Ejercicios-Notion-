/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modularidad;

/**
 *
 * @author Admin
 */
public class CalculoAcademico implements Promedio,Aprobar,PuntoExtra {
    @Override
    public double promedio(double[] notas){
        double suma=0;
        for (int i = 0; i < notas.length; i++) {
            suma=suma+notas[i];
        }
        return suma/notas.length;
    }
    @Override
    public boolean aprueba(double promedio){
        return promedio>=14;
    }
    @Override 
    public double puntoExtra(double promedio){
        return promedio+1;
    }
}
