package tp8.ecommerce;

public class AppEcommerce {

    public static void main(String[] args) {

        // Crear cliente
        Cliente cliente = new Cliente("Ximena", "ximena@example.com");

        // Crear productos
        Producto p1 = new Producto("Mouse", 8000);
        Producto p2 = new Producto("Teclado", 15000);
        Producto p3 = new Producto("Monitor", 120000);

        // Crear pedido y agregar productos
        Pedido pedido = new Pedido(cliente);
        pedido.agregarProducto(p1);
        pedido.agregarProducto(p2);
        pedido.agregarProducto(p3);

        // Mostrar detalle y total
        pedido.mostrarDetalle();

        // Procesar pago con tarjeta de crédito (con descuento)
        System.out.println("\nPago con Tarjeta de Crédito:");
        TarjetaCredito tarjeta = new TarjetaCredito("1234-5678-9999-0000", "Ximena");
        tarjeta.procesarPago(pedido.calcularTotal());

        // Procesar pago con PayPal (sin descuento)
        System.out.println("\nPago con PayPal:");
        PayPal paypal = new PayPal("xime@paypal.com");
        paypal.procesarPago(pedido.calcularTotal());

        // Cambiar estado del pedido y notificar al cliente
        System.out.println("\nCambio de estados del pedido:");
        pedido.cambiarEstado(EstadoPedido.PAGADO);
        pedido.cambiarEstado(EstadoPedido.ENVIADO);
        pedido.cambiarEstado(EstadoPedido.ENTREGADO);
    }
}