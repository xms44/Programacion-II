package tp8.ecommerce;

public class PayPal implements Pago {

    private String cuentaEmail;

    public PayPal(String cuentaEmail) {
        this.cuentaEmail = cuentaEmail;
    }

    @Override
    public void procesarPago(double monto) {
        System.out.println("Pago con PayPal desde la cuenta: " + cuentaEmail);
        System.out.println("Monto a pagar: " + monto);
    }
}
