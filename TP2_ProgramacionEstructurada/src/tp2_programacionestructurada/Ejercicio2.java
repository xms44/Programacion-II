
package tp2_programacionestructurada;
import java.util.Scanner;

public class Ejercicio2 {
 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer numero: ");
        int n1 = scanner.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        int n2 = scanner.nextInt();
        System.out.print("Ingrese el tercer numero: ");
        int n3 = scanner.nextInt();

        int mayor = n1;

        if (n2 > mayor) {
            mayor = n2;
        }
        if (n3 > mayor) {
            mayor = n3;
        }

        System.out.println("El mayor es: " + mayor);

        scanner.close();
    }
}
