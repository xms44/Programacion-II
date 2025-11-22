package tp6_colecciones.biblioteca;

import java.util.List;

public class AppBiblioteca {

    public static void main(String[] args) {

        Biblioteca biblioteca = new Biblioteca("Biblioteca Central");

        // 2) Crear autores
        Autor a1 = new Autor("A1", "Julio Verne", "Francia");
        Autor a2 = new Autor("A2", "J. K. Rowling", "Reino Unido");
        Autor a3 = new Autor("A3", "Gabriel García Márquez", "Colombia");

        // 3) Agregar 5 libros
        biblioteca.agregarLibro("ISBN1", "Viaje al centro de la Tierra", 1864, a1);
        biblioteca.agregarLibro("ISBN2", "20.000 leguas de viaje submarino", 1870, a1);
        biblioteca.agregarLibro("ISBN3", "Harry Potter y la Piedra Filosofal", 1997, a2);
        biblioteca.agregarLibro("ISBN4", "Harry Potter y la Cámara Secreta", 1998, a2);
        biblioteca.agregarLibro("ISBN5", "Cien años de soledad", 1967, a3);

        // 4) Listar libros
        biblioteca.listarLibros();

        // 5) Buscar libro por ISBN
        System.out.println("\nBUSCAR ISBN3:");
        Libro buscado = biblioteca.buscarLibroPorIsbn("ISBN3");
        if (buscado != null) {
            buscado.mostrarInfo();
        }

        // 6) Filtrar por año
        System.out.println("\nLIBROS PUBLICADOS EN 1997:");
        List<Libro> anio1997 = biblioteca.filtrarLibrosPorAnio(1997);
        for (Libro l : anio1997) {
            l.mostrarInfo();
        }

        // 7) Eliminar libro y listar resto
        System.out.println("\nELIMINAR ISBN2");
        biblioteca.eliminarLibro("ISBN2");
        biblioteca.listarLibros();

        // 8) Cantidad total de libros
        System.out.println("\nCantidad total de libros: " +
                biblioteca.obtenerCantidadLibros());

        // 9) Mostrar autores disponibles
        System.out.println();
        biblioteca.mostrarAutoresDisponibles();
    }
}