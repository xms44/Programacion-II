
package tp3_introduccionpoo;

public class Ejercicio5 {
 public static void main(String[] args) {
        // Crear nave con 50 unidades de combustible y capacidad maxima 100
        NaveEspacial nave = new NaveEspacial("Explorer", 50, 100);

        System.out.println("Estado inicial de la nave:");
        nave.mostrarEstado();

        System.out.println("\nIntentando despegar...");
        nave.despegar();

        System.out.println("\nIntentando avanzar 60 unidades SIN recargar...");
        nave.avanzar(60); // Deberia fallar o no alcanzar

        System.out.println("\nRecargando 40 unidades de combustible...");
        nave.recargarCombustible(40);

        System.out.println("\nIntentando avanzar 40 unidades ahora...");
        nave.avanzar(40); // Esta vez deberia poder

        System.out.println("\nEstado final de la nave:");
        nave.mostrarEstado();
    }
}

// Clase modelo NaveEspacial
class NaveEspacial {

    private String nombre;
    private double combustible;      // combustible actual
    private double capacidadMaxima;  // capacidad máxima del tanque

    public NaveEspacial(String nombre, double combustibleInicial, double capacidadMaxima) {
        this.nombre = nombre;
        this.capacidadMaxima = capacidadMaxima;

        if (combustibleInicial > capacidadMaxima) {
            this.combustible = capacidadMaxima;
        } else if (combustibleInicial < 0) {
            this.combustible = 0;
        } else {
            this.combustible = combustibleInicial;
        }
    }

    // Despegar consume 10 unidades de combustible
    public void despegar() {
        double consumoDespegue = 10;

        if (combustible >= consumoDespegue) {
            combustible -= consumoDespegue;
            System.out.println(nombre + " ha despegado correctamente.");
        } else {
            System.out.println("Combustible insuficiente para despegar.");
        }
        mostrarEstado();
    }

    // Avanzar consume 1 unidad de combustible por unidad de distancia
    public void avanzar(double distancia) {
        double consumo = distancia;

        if (distancia <= 0) {
            System.out.println("La distancia debe ser positiva.");
            return;
        }

        if (combustible >= consumo) {
            combustible -= consumo;
            System.out.println(nombre + " ha avanzado " + distancia + " unidades.");
        } else {
            System.out.println("No hay combustible suficiente para avanzar " + distancia +
                    " unidades. Combustible disponible: " + combustible);
        }
        mostrarEstado();
    }

    public void recargarCombustible(double cantidad) {
        if (cantidad <= 0) {
            System.out.println("La cantidad a recargar debe ser positiva.");
            return;
        }

        double nuevoNivel = combustible + cantidad;

        if (nuevoNivel > capacidadMaxima) {
            combustible = capacidadMaxima;
            System.out.println("Se recargo hasta la capacidad maxima (" +
                    capacidadMaxima + "). El excedente no se almacena.");
        } else {
            combustible = nuevoNivel;
            System.out.println("Se recargaron " + cantidad + " unidades de combustible.");
        }
        mostrarEstado();
    }

    public void mostrarEstado() {
        System.out.println("Nave: " + nombre +
                " | Combustible actual: " + combustible +
                " / " + capacidadMaxima);
    }
}
