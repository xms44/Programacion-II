
package tp3_introduccionpoo;

public class Ejercicio4 {
public static void main(String[] args) {
        // Crear dos gallinas
        Gallina g1 = new Gallina("G1", 1, 0);
        Gallina g2 = new Gallina("G2", 2, 3);

        System.out.println("Estado inicial de las gallinas:");
        g1.mostrarEstado();
        g2.mostrarEstado();

        // Simular acciones
        System.out.println("\nSimulando acciones...");
        g1.envejecer();
        g1.ponerHuevo();
        g1.ponerHuevo();

        g2.envejecer();
        g2.ponerHuevo();

        // Estado final
        System.out.println("\nEstado final de las gallinas:");
        g1.mostrarEstado();
        g2.mostrarEstado();
    }
}

// Clase modelo Gallina
class Gallina {
    String idGallina;
    int edad;
    int huevosPuestos;

    public Gallina(String idGallina, int edad, int huevosPuestos) {
        this.idGallina = idGallina;
        this.edad = edad;
        this.huevosPuestos = huevosPuestos;
    }

    public void ponerHuevo() {
        huevosPuestos++;
        System.out.println("Gallina " + idGallina + " ha puesto un huevo.");
    }

    public void envejecer() {
        edad++;
        System.out.println("Gallina " + idGallina + " ha cumplido un anio mas.");
    }

    public void mostrarEstado() {
        System.out.println("Gallina " + idGallina +
                " | Edad: " + edad +
                " anios | Huevos puestos: " + huevosPuestos);
    }
}
