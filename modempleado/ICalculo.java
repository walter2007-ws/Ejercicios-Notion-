package modempleado;

public interface ICalculo {
/* PRINCIPIOS APLICADOS:
    - ISP (Interface Segregation Principle): Define únicamente el comportamiento relacionado con cálculos, evitando que las clases implementen métodos que no necesitan.
    
    - DIP (Dependency Inversion Principle): Las clases de alto nivel dependen de esta abstracción y no de implementaciones concretas.
    */
    double calcularPromedio(double[] sueldos);
}
