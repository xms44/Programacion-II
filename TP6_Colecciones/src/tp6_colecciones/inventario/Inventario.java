package tp6_colecciones.inventario;

import java.util.ArrayList;
import java.util.List;

public class Inventario {

    private ArrayList<Producto> productos;

    public Inventario() {
        this.productos = new ArrayList<>();
    }

    // 1) Agregar producto
    public void agregarProducto(Producto p) {
        productos.add(p);
    }

    // 2) Listar todos los productos
    public void listarProductos() {
        System.out.println("LISTA DE PRODUCTOS:");
        for (Producto p : productos) {
            p.mostrarInfo();
        }
    }

    // 3) Buscar por ID
    public Producto buscarProductoPorId(String id) {
        for (Producto p : productos) {
            if (p.getId().equalsIgnoreCase(id)) {
                return p;
            }
        }
        return null;
    }

    // 4) Eliminar por ID
    public boolean eliminarProducto(String id) {
        Producto p = buscarProductoPorId(id);
        if (p != null) {
            productos.remove(p);
            return true;
        }
        return false;
    }

    // 5) Actualizar stock
    public boolean actualizarStock(String id, int nuevaCantidad) {
        Producto p = buscarProductoPorId(id);
        if (p != null) {
            p.setCantidad(nuevaCantidad);
            return true;
        }
        return false;
    }

    // 6) Filtrar por categoría
    public List<Producto> filtrarPorCategoria(CategoriaProducto categoria) {
        List<Producto> resultado = new ArrayList<>();
        for (Producto p : productos) {
            if (p.getCategoria() == categoria) {
                resultado.add(p);
            }
        }
        return resultado;
    }

    // 7) Obtener total de stock
    public int obtenerTotalStock() {
        int total = 0;
        for (Producto p : productos) {
            total += p.getCantidad();
        }
        return total;
    }

    // 8) Producto con mayor stock
    public Producto obtenerProductoConMayorStock() {
        if (productos.isEmpty()) return null;
        Producto mayor = productos.get(0);
        for (Producto p : productos) {
            if (p.getCantidad() > mayor.getCantidad()) {
                mayor = p;
            }
        }
        return mayor;
    }

    // 9) Filtrar por rango de precio
    public List<Producto> filtrarProductosPorPrecio(double min, double max) {
        List<Producto> resultado = new ArrayList<>();
        for (Producto p : productos) {
            if (p.getPrecio() >= min && p.getPrecio() <= max) {
                resultado.add(p);
            }
        }
        return resultado;
    }

    // 10) Mostrar categorías
    public void mostrarCategoriasDisponibles() {
        System.out.println("CATEGORIAS DISPONIBLES:");
        for (CategoriaProducto c : CategoriaProducto.values()) {
            System.out.println(c + " -> " + c.getDescripcion());
        }
    }
}