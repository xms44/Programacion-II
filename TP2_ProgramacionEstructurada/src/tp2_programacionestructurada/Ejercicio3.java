
package tp2_programacionestructurada;

import java.util.Scanner;

public class Ejercicio3 {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese su edad: ");
        int edad = scanner.nextInt();

        String etapa;

        if (edad < 12) {
            etapa = "Nino";
        } else if (edad <= 17) {
            etapa = "Adolescente";
        } else if (edad <= 59) {
            etapa = "Adulto";
        } else {
            etapa = "Adulto mayor";
        }

        System.out.println("Eres un " + etapa + ".");

        scanner.close();
    }
}
