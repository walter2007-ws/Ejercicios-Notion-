package modempleado;
import java.util.*;

public class CalculoAdministrativo extends Empleado implements ICalculo, IBono, ISueldoAceptable{
/* PRINCIPIOS APLICADOS:
    - SRP (Responsabilidad Única): Se encarga únicamente del cálculo administrativo del empleado.

    - OCP (Abierto/Cerrado): Se pueden crear nuevos tipos de empleados sin modificar esta clase.

    - LSP (Sustitución de Liskov): Puede ser utilizada donde se espere un Empleado.
    
    - ISP (Segregación de Interfaces): Implementa interfaces específicas (ICalculo, IBono, ISueldoAceptable), evitando depender de métodos que no necesita.
    */
    Scanner sc = new Scanner(System.in);

    public CalculoAdministrativo() {
        super("", new double[0]);
    }

    @Override
    public double calcularPromedio(double[] sueldos) {
        double suma = 0;
        for (int i = 0; i < sueldos.length; i++) {
            suma = suma + sueldos[i];
        }
        return suma / sueldos.length;
    }

    @Override
    public double aplicarBono(double promedio) {
        return promedio + 50;
    }

    @Override
    public boolean sueldoAceptable(double promedio) {
         return promedio >= 500;
    }

    @Override
    public void ingresarDatos() {
        System.out.print("Ingrese el nombre del empleado: ");
        nombre = sc.nextLine();

        System.out.print("Ingrese la cantidad de sueldos: ");
        int n = sc.nextInt();

        sueldos = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el sueldo " + (i + 1) + ": ");
            sueldos[i] = sc.nextDouble();
        }
    }
}
