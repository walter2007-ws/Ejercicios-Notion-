package modempleado;

public abstract class Empleado {
/*  PRINCIPIOS APLICADOS:
    - SRP (Single Responsibility Principle): Define únicamente los atributos y comportamientos comunes de un empleado.

    - OCP (Open/Closed Principle): Está abierta a extensión mediante herencia, pero cerrada a modificación.

    - LSP (Liskov Substitution Principle): Cualquier clase hija puede sustituir a Empleado sin alterar el comportamiento del sistema.

    - DIP (Dependency Inversion Principle): Los módulos de alto nivel dependen de esta abstracción y no de clases concretas.
    */
    protected String nombre;
    protected double[] sueldos;

    public Empleado(String nombre, double[] sueldos) {
        this.nombre = nombre;
        this.sueldos = sueldos;
    }    
    
    public abstract void ingresarDatos();
}
