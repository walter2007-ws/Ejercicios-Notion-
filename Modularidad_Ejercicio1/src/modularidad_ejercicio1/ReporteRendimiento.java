/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modularidad_ejercicio1;

/**
 *
 * @author Admin
 */

//Al igual que en la clase CalculoRendimiento
public class ReporteRendimiento implements MostrarRendimiento {
    @Override
    public void mostrar(Deportista d, double promedio, boolean alto) {
        System.out.println("Deportista: " + d.nombre);
        System.out.println("Rendimiento promedio: " + promedio);
        System.out.println("Nivel: " + (alto ? "ALTO" : "BAJO"));
    }
}

