/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modularidad_ejercicio1;

/**
 *
 * @author Admin
 */

//Se dividen los metodos en interfaces para cada uno

public class CalculoRendimiento implements CalculoPromedio,Rendimiento,Mejora  {
    
    @Override
    public double calcularPromedio(double[] marcas) {
        double suma = 0;
        for (int i = 0; i < marcas.length; i++) {
            suma += marcas[i];
        }
        return suma / marcas.length;
    }
    @Override
    public boolean rendimientoAlto(double promedio) {
        return promedio >= 80;
    }
    @Override
    public double aplicarMejora(double promedio) {
        return promedio + 5;
    }
}

