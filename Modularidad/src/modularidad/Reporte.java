/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modularidad;

/**
 *
 * @author Admin
 */
public class Reporte implements  MostrarDatos {
    @Override
    public void mostrar(Estudiante estudiante, double promedio, boolean aprobado){
        System.out.println("Estudiante: "+ estudiante.nombre);
        System.out.println("Promedio: "+ promedio);
        System.out.println("Estado: " + (aprobado ? "Aprobado": "Reprobado"));
    }
}
