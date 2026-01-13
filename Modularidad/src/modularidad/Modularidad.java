/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modularidad;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Modularidad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        CalculoAcademico academico= new CalculoAcademico();
        Reporte reporte=new Reporte();
        System.out.println("Ingrese el nombre del estudiante:");
        String nombre=sc.nextLine();
        System.out.println("Ingrese la cantidad de notas a registrar: ");
        int n= sc.nextInt();
        double [] notas= new double[n];  
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese la nota "+(i+1)+": ");
            notas[i]=sc.nextDouble();
        }
        Estudiante estudiante=new Estudiante(nombre,notas);
        double promedio= academico.promedio(estudiante.notas);
        boolean aprobado= academico.aprueba(promedio);
        double extra=academico.puntoExtra(promedio);
        System.out.println("Desea aplicar el punto extra?");
        int op=sc.nextInt();
        if(op==1){
            double promedio2=academico.puntoExtra(promedio);
            reporte.mostrar(estudiante, promedio2, aprobado);
        }
        else{
            reporte.mostrar(estudiante, promedio, aprobado);
        }
    }
    
}
