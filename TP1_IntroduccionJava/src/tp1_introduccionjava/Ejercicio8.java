
package tp1_introduccionjava;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        int a = scanner.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int b = scanner.nextInt();

        if (b == 0) {
            System.out.println("No se puede dividir por cero.");
        } else {
            int divisionEntera = a / b;              // usando int
            double divisionDouble = (double) a / b;  // usando double

            System.out.println("Resultado con int: " + divisionEntera);
            System.out.println("Resultado con double: " + divisionDouble);
        }

        scanner.close();
    }
}

