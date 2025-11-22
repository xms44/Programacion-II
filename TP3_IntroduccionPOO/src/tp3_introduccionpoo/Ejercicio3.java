
package tp3_introduccionpoo;

public class Ejercicio3 {
public static void main(String[] args) {
        // Crear libro
        Libro libro = new Libro("El nombre del viento", "Patrick Rothfuss", 2007);

        System.out.println("Informacion inicial del libro:");
        mostrarInfoLibro(libro);

        // Intentar modificar con un anio invalido
        System.out.println("\nIntentando cambiar el anio a 1400 (invalido)...");
        libro.setAnioPublicacion(1400);
        mostrarInfoLibro(libro);

        // Intentar modificar con un anio valido
        System.out.println("\nCambiando el anio a 2010 (valido)...");
        libro.setAnioPublicacion(2010);
        mostrarInfoLibro(libro);
    }

    // Metodo auxiliar solo para imprimir usando getters
    private static void mostrarInfoLibro(Libro libro) {
        System.out.println("Titulo: " + libro.getTitulo());
        System.out.println("Autor: " + libro.getAutor());
        System.out.println("Anio de publicacion: " + libro.getAnioPublicacion());
    }
}

// Clase modelo Libro con encapsulamiento
class Libro {
    private String titulo;
    private String autor;
    private int anioPublicacion;

    public Libro(String titulo, String autor, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
    }

    // Getters
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    // Setter con validacion
    public void setAnioPublicacion(int anioPublicacion) {
        // ejemplo de validacion sencilla
        if (anioPublicacion >= 1450 && anioPublicacion <= 2100) {
            this.anioPublicacion = anioPublicacion;
        } else {
            System.out.println("Anio de publicacion invalido: " + anioPublicacion);
        }
    }
}
