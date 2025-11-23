package tp8.ecommerce;

public class TarjetaCredito implements PagoConDescuento {

    private String numeroTarjeta;
    private String titular;

    public TarjetaCredito(String numeroTarjeta, String titular) {
        this.numeroTarjeta = numeroTarjeta;
        this.titular = titular;
    }

    @Override
    public double aplicarDescuento(double monto) {
        // Ejemplo: 10% de descuento
        double descuento = monto * 0.10;
        return monto - descuento;
    }

    @Override
    public void procesarPago(double monto) {
        double totalConDescuento = aplicarDescuento(monto);
        System.out.println("Pago con tarjeta de crédito (" + titular + ")");
        System.out.println("Monto original: " + monto);
        System.out.println("Monto con descuento (10%): " + totalConDescuento);
    }
}