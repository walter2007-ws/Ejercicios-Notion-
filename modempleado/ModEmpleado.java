package modempleado;
import java.util.*;

public class ModEmpleado {
/* 
    PRINCIPIOS APLICADOS:
    - SRP (Single Responsibility Principle):
    Esta clase solo se encarga de coordinar la ejecución del programa (flujo principal), sin realizar cálculos ni lógica de negocio.
    
    - DIP (Dependency Inversion Principle):
    Depende de abstracciones (métodos públicos de las clases) y no de implementaciones internas.
 */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 

        CalculoAdministrativo ca = new CalculoAdministrativo();
        Nomina nomina = new Nomina();
        
        ca.ingresarDatos();
        double promedio = ca.calcularPromedio(ca.sueldos);     
        boolean aceptable = ca.sueldoAceptable(promedio);

        System.out.print("¿Desea aplicar bono? (1=Sí / 0=No): ");
        int op = sc.nextInt();

        if (op == 1) {
            promedio = ca.aplicarBono(promedio);
        }
        nomina.mostrar(ca, promedio, aceptable);
        sc.close();
        }
    }
    

