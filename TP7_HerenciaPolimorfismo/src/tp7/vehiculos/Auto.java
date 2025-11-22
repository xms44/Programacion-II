package tp7.vehiculos;

public class Auto extends Vehiculo {

    private int cantidadPuertas;

    public Auto(String marca, String modelo, int cantidadPuertas) {
        super(marca, modelo);      // llamo al constructor de Vehiculo
        this.cantidadPuertas = cantidadPuertas;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Auto: " + marca + " " + modelo +
                " - Puertas: " + cantidadPuertas);
    }
}