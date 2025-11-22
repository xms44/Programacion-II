
package tp2_programacionestructurada;

import java.util.Scanner;

public class Ejercicio8 {
public static double calcularPrecioFinal(double precioBase, double impuesto, double descuento) {
        double imp = precioBase * impuesto;
        double desc = precioBase * descuento;
        return precioBase + imp - desc;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el precio base del producto: ");
        double precioBase = scanner.nextDouble();

        System.out.print("Ingrese el impuesto en porcentaje (por ejemplo 10 para 10%): ");
        double impuestoPorc = scanner.nextDouble();

        System.out.print("Ingrese el descuento en porcentaje (por ejemplo 5 para 5%): ");
        double descuentoPorc = scanner.nextDouble();

        double impuesto = impuestoPorc / 100.0;
        double descuento = descuentoPorc / 100.0;

        double precioFinal = calcularPrecioFinal(precioBase, impuesto, descuento);

        System.out.println("El precio final del producto es: " + precioFinal);

        scanner.close();
    }
}
