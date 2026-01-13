package modempleado;

public interface ISueldoAceptable {
/* PRINCIPIOS APLICADOS:
    - ISP (Interface Segregation Principle): Contiene solo la regla de validación del sueldo, evitando interfaces grandes o genéricas.

    - SRP (Single Responsibility Principle): Tiene una única responsabilidad: validar el sueldo.

    - DIP (Dependency Inversion Principle): El código depende de esta interfaz y no de una implementación específica.
    */
    boolean sueldoAceptable(double promedio);
}
