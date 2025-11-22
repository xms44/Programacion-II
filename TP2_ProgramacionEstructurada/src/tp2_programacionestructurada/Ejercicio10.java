
package tp2_programacionestructurada;

import java.util.Scanner;

public class Ejercicio10 {
 public static int actualizarStock(int stockActual, int cantidadVendida, int cantidadRecibida) {
        return stockActual - cantidadVendida + cantidadRecibida;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el stock actual del producto: ");
        int stockActual = scanner.nextInt();

        System.out.print("Ingrese la cantidad vendida: ");
        int cantVendida = scanner.nextInt();

        System.out.print("Ingrese la cantidad recibida: ");
        int cantRecibida = scanner.nextInt();

        int nuevoStock = actualizarStock(stockActual, cantVendida, cantRecibida);

        System.out.println("El nuevo stock del producto es: " + nuevoStock);

        scanner.close();
    }
}
