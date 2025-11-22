
package tp2_programacionestructurada;

public class Ejercicio13 {
public static void imprimirPreciosRecursivo(double[] precios, int indice) {
        if (indice >= precios.length) {
            return; // caso base
        }
        System.out.println("Precio: $" + precios[indice]);
        imprimirPreciosRecursivo(precios, indice + 1); // llamada recursiva
    }

    public static void main(String[] args) {
        double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};

        System.out.println("Precios originales:");
        imprimirPreciosRecursivo(precios, 0);

        // Modificar un elemento
        precios[2] = 129.99;

        System.out.println("Precios modificados:");
        imprimirPreciosRecursivo(precios, 0);
    }
}
