package tp8.ecommerce;

public interface PagoConDescuento extends Pago {
    double aplicarDescuento(double monto);
}