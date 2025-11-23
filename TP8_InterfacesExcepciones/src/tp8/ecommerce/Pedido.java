package tp8.ecommerce;

import java.util.ArrayList;
import java.util.List;

public class Pedido implements Pagable {

    private Cliente cliente;
    private List<Producto> productos;
    private EstadoPedido estado;

    public Pedido(Cliente cliente) {
        this.cliente = cliente;
        this.productos = new ArrayList<>();
        this.estado = EstadoPedido.CREADO;
    }

    public void agregarProducto(Producto p) {
        productos.add(p);
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public EstadoPedido getEstado() {
        return estado;
    }

    public void cambiarEstado(EstadoPedido nuevoEstado) {
        this.estado = nuevoEstado;
        // Notificar al cliente cuando cambia el estado
        cliente.notificar("El pedido cambió de estado a: " + nuevoEstado);
    }

    @Override
    public double calcularTotal() {
        double total = 0;
        for (Producto p : productos) {
            total += p.calcularTotal();
        }
        return total;
    }

    public void mostrarDetalle() {
        System.out.println("Detalle del pedido:");
        for (Producto p : productos) {
            p.mostrarInfo();
        }
        System.out.println("Estado actual: " + estado);
        System.out.println("Total: " + calcularTotal());
    }
}
