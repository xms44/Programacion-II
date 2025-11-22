package tp6_colecciones.inventario;

import java.util.List;

public class AppInventario {

    public static void main(String[] args) {

        Inventario inventario = new Inventario();

        // 1) Crear 5 productos y agregarlos
        Producto p1 = new Producto("P001", "Arroz", 1200, 50, CategoriaProducto.ALIMENTOS);
        Producto p2 = new Producto("P002", "Televisor", 250000, 10, CategoriaProducto.ELECTRONICA);
        Producto p3 = new Producto("P003", "Remera", 8000, 30, CategoriaProducto.ROPA);
        Producto p4 = new Producto("P004", "Silla", 15000, 20, CategoriaProducto.HOGAR);
        Producto p5 = new Producto("P005", "Notebook", 600000, 5, CategoriaProducto.ELECTRONICA);

        inventario.agregarProducto(p1);
        inventario.agregarProducto(p2);
        inventario.agregarProducto(p3);
        inventario.agregarProducto(p4);
        inventario.agregarProducto(p5);

        // 2) Listar todos
        inventario.listarProductos();

        // 3) Buscar producto por ID
        System.out.println("\nBUSCAR POR ID P003:");
        Producto buscado = inventario.buscarProductoPorId("P003");
        if (buscado != null) {
            buscado.mostrarInfo();
        }

        // 4) Filtrar por categoría
        System.out.println("\nPRODUCTOS ELECTRONICA:");
        List<Producto> electronica = inventario.filtrarPorCategoria(CategoriaProducto.ELECTRONICA);
        for (Producto p : electronica) {
            p.mostrarInfo();
        }

        // 5) Eliminar producto por ID
        System.out.println("\nELIMINAR P004");
        inventario.eliminarProducto("P004");
        inventario.listarProductos();

        // 6) Actualizar stock
        System.out.println("\nACTUALIZAR STOCK P001 A 80");
        inventario.actualizarStock("P001", 80);
        inventario.listarProductos();

        // 7) Total de stock
        System.out.println("\nTotal de stock disponible: " + inventario.obtenerTotalStock());

        // 8) Producto con mayor stock
        Producto mayor = inventario.obtenerProductoConMayorStock();
        System.out.println("\nProducto con mayor stock:");
        if (mayor != null) {
            mayor.mostrarInfo();
        }

        // 9) Filtrar productos precio entre 1000 y 3000
        System.out.println("\nPRODUCTOS ENTRE 1000 Y 3000");
        List<Producto> rangoPrecio = inventario.filtrarProductosPorPrecio(1000, 3000);
        for (Producto p : rangoPrecio) {
            p.mostrarInfo();
        }

        // 10) Mostrar categorías disponibles
        System.out.println();
        inventario.mostrarCategoriasDisponibles();
    }
}
