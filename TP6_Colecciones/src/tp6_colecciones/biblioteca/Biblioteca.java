package tp6_colecciones.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

    private String nombre;
    private List<Libro> libros;

    public Biblioteca(String nombre) {
        this.nombre = nombre;
        this.libros = new ArrayList<>();
    }

    public void agregarLibro(String isbn, String titulo, int anioPublicacion, Autor autor) {
        Libro libro = new Libro(isbn, titulo, anioPublicacion, autor);
        libros.add(libro);
    }

    public void listarLibros() {
        System.out.println("LIBROS EN LA BIBLIOTECA: " + nombre + " ");
        for (Libro l : libros) {
            l.mostrarInfo();
        }
    }

    public Libro buscarLibroPorIsbn(String isbn) {
        for (Libro l : libros) {
            if (l.getIsbn().equalsIgnoreCase(isbn)) {
                return l;
            }
        }
        return null;
    }

    public boolean eliminarLibro(String isbn) {
        Libro l = buscarLibroPorIsbn(isbn);
        if (l != null) {
            libros.remove(l);
            return true;
        }
        return false;
    }

    public int obtenerCantidadLibros() {
        return libros.size();
    }

    public List<Libro> filtrarLibrosPorAnio(int anio) {
        List<Libro> resultado = new ArrayList<>();
        for (Libro l : libros) {
            if (l.getAnioPublicacion() == anio) {
                resultado.add(l);
            }
        }
        return resultado;
    }

    public void mostrarAutoresDisponibles() {
        System.out.println("AUTORES DISPONIBLES:");
        ArrayList<String> nombres = new ArrayList<>();
        for (Libro l : libros) {
            String nombreAutor = l.getAutor().getNombre();
            if (!nombres.contains(nombreAutor)) {
                nombres.add(nombreAutor);
                l.getAutor().mostrarInfo();
            }
        }
    }
}