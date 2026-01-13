/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modularidad_ejercicio1;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Modularidad_Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //En lugar de utilizar los metodos de las clases directamente, se las intancia como objetos
        
        Scanner sc = new Scanner(System.in);
        CalculoRendimiento rendimiento= new CalculoRendimiento();
        ReporteRendimiento reporte= new ReporteRendimiento();
        System.out.print("Ingrese el nombre del deportista: ");
        String nombre = sc.nextLine();

        System.out.print("Ingrese la cantidad de marcas: ");
        int n = sc.nextInt();

        double[] marcas = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese la marca " + (i + 1) + ": ");
            marcas[i] = sc.nextDouble();
        }

        Deportista dep = new Deportista(nombre, marcas);

        double promedio = rendimiento.calcularPromedio(dep.marcas);
        boolean alto = rendimiento.rendimientoAlto(promedio);

        System.out.print("¿Desea aplicar mejora? (1=Sí / 0=No): ");
        int op = sc.nextInt();

        if (op == 1) {
            promedio = rendimiento.aplicarMejora(promedio);
        }

        reporte.mostrar(dep, promedio, alto);

        sc.close();
    }
    
}
