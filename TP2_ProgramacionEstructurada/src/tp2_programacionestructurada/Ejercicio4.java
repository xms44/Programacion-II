
package tp2_programacionestructurada;

import java.util.Scanner;

public class Ejercicio4 {
 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el precio del producto: ");
        double precio = scanner.nextDouble();

        System.out.print("Ingrese la categoria del producto (A, B o C): ");
        String categoria = scanner.next().toUpperCase();

        double porcentajeDescuento;

        switch (categoria) {
            case "A":
                porcentajeDescuento = 10.0;
                break;
            case "B":
                porcentajeDescuento = 15.0;
                break;
            case "C":
                porcentajeDescuento = 20.0;
                break;
            default:
                System.out.println("Categoria invalida.");
                scanner.close();
                return;
        }

        double descuento = precio * (porcentajeDescuento / 100.0);
        double precioFinal = precio - descuento;

        System.out.println("Descuento aplicado: " + porcentajeDescuento + "%");
        System.out.println("Precio final: " + precioFinal);

        scanner.close();
    }
}
