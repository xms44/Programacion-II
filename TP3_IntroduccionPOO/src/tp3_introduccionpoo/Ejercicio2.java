
package tp3_introduccionpoo;

public class Ejercicio2 {
 public static void main(String[] args) {
        // Crear una mascota
        Mascota mascota = new Mascota("Luna", "Perro", 3);

        System.out.println("Informacion inicial de la mascota:");
        mascota.mostrarInfo();

        System.out.println("\nLa mascota cumple un anio:");
        mascota.cumplirAnios();
        mascota.mostrarInfo();

        System.out.println("\nLa mascota cumple otro anio:");
        mascota.cumplirAnios();
        mascota.mostrarInfo();
    }
}

// Clase modelo Mascota
class Mascota {
    String nombre;
    String especie;
    int edad;

    public Mascota(String nombre, String especie, int edad) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
    }

    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Especie: " + especie);
        System.out.println("Edad: " + edad + " anios");
    }

    public void cumplirAnios() {
        edad++;
    }
}
