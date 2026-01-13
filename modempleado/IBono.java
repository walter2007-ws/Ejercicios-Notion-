package modempleado;

public interface IBono {
/* PRINCIPIOS APLICADOS:
    - ISP (Interface Segregation Principle): Define exclusivamente el comportamiento para aplicar bonos, sin obligar a las clases a implementar métodos innecesarios.

    - OCP (Open/Closed Principle): Permite agregar nuevos tipos de bonos creando nuevas implementaciones sin modificar el sistema existente.

    - DIP (Dependency Inversion Principle): El sistema depende de esta abstraccióny no de una clase concreta.
    */
    double aplicarBono(double promedio);
}
