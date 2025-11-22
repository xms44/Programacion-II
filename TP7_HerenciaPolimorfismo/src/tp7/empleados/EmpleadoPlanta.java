package tp7.empleados;

public class EmpleadoPlanta extends Empleado {

    private double sueldoBase;
    private int aniosAntiguedad;
    private double adicionalPorAnio;

    public EmpleadoPlanta(String nombre, double sueldoBase,
                          int aniosAntiguedad, double adicionalPorAnio) {
        super(nombre);
        this.sueldoBase = sueldoBase;
        this.aniosAntiguedad = aniosAntiguedad;
        this.adicionalPorAnio = adicionalPorAnio;
    }

    @Override
    public double calcularSueldo() {
        return sueldoBase + (aniosAntiguedad * adicionalPorAnio);
    }
}