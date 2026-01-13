package modempleado;

public class Nomina implements IMostrarDatos{
/* PRINCIPIOS APLICADOS:
    - SRP (Single Responsibility Principle): Se encarga únicamente de mostrar o gestionar la información relacionada con la nómina.
    
    - DIP (Dependency Inversion Principle): Trabaja con el tipo Empleado y no con una implementación concreta.
    */
    @Override
    public void mostrar(Empleado e, double promedio, boolean aceptable) {
        System.out.println("Empleado: " + e.nombre);
        System.out.println("Sueldo promedio: " + promedio);
        System.out.println("Estado: " + (aceptable ? "ACEPTABLE" : "BAJO"));
    }
    
}
