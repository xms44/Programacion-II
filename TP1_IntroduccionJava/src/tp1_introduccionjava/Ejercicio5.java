
package tp1_introduccionjava;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer numero entero: ");
        int a = scanner.nextInt();

        System.out.print("Ingrese el segundo numero entero: ");
        int b = scanner.nextInt();

        int suma = a + b;
        int resta = a - b;
        int multiplicacion = a * b;

        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicacion: " + multiplicacion);

        if (b != 0) {
            int division = a / b; // división entera
            System.out.println("Division (entera): " + division);
        } else {
            System.out.println("No se puede dividir por cero.");
        }

        scanner.close();
    }
}

