
package tp2_programacionestructurada;

import java.util.Scanner;

public class Ejercicio9 {

    public static double calcularCostoEnvio(double peso, String zona) {
        if (zona.equalsIgnoreCase("Nacional")) {
            return 5.0 * peso;
        } else if (zona.equalsIgnoreCase("Internacional")) {
            return 10.0 * peso;
        } else {
            return 0.0; // zona invalida
        }
    }

    public static double calcularTotalCompra(double precioProducto, double costoEnvio) {
        return precioProducto + costoEnvio;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el precio del producto: ");
        double precioProducto = scanner.nextDouble();

        System.out.print("Ingrese el peso del paquete en kg: ");
        double peso = scanner.nextDouble();
        scanner.nextLine(); // limpiar salto de linea

        System.out.print("Ingrese la zona de envio (Nacional/Internacional): ");
        String zona = scanner.nextLine();

        double costoEnvio = calcularCostoEnvio(peso, zona);

        if (costoEnvio == 0.0 && 
            !(zona.equalsIgnoreCase("Nacional") || zona.equalsIgnoreCase("Internacional"))) {
            System.out.println("Zona de envio invalida.");
        } else {
            double total = calcularTotalCompra(precioProducto, costoEnvio);
            System.out.println("El costo de envio es: " + costoEnvio);
            System.out.println("El total a pagar es: " + total);
        }

        scanner.close();
    }
}
