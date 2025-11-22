
package tp1_introduccionjava;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa tu nombre: ");
        String nombre = scanner.nextLine(); // uso nextLine para leer texto

        System.out.println("Hola, " + nombre);

        scanner.close();
    }
}
