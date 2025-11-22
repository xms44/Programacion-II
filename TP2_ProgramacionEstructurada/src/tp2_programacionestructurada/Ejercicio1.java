
package tp2_programacionestructurada;
import java.util.Scanner;
public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un anio: ");
        int anio = scanner.nextInt();

        boolean esBisiesto = (anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0);

        if (esBisiesto) {
            System.out.println("El anio " + anio + " es bisiesto.");
        } else {
            System.out.println("El anio " + anio + " no es bisiesto.");
        }

        scanner.close();
    }
  }

