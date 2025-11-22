
package tp4_poo_empleados;

public class Empleado {
 // Atributos privados (encapsulamiento)
    private int id;
    private String nombre;
    private String puesto;
    private double salario;

    // Atributo estatico: contador global de empleados
    private static int totalEmpleados = 0;

    // Atributo estatico auxiliar para generar ids automaticos
    private static int proximoId = 1;

    // ---- 1) Constructor que recibe todos los atributos ----
    public Empleado(int id, String nombre, String puesto, double salario) {
        // Uso de this para diferenciar atributos de parametros
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;

        totalEmpleados++;
    }

    // ---- 2) Constructor sobrecargado: solo nombre y puesto ----
    // Asigna id automatico y salario por defecto
    public Empleado(String nombre, String puesto) {
        this.id = proximoId++;      // id automatico
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = 100000.0;    // salario por defecto de ejemplo

        totalEmpleados++;
    }

    // ---- 3) Metodos sobrecargados actualizarSalario ----

    // Aumentar por porcentaje (por ejemplo 10 = 10%)
    public void actualizarSalario(double porcentajeAumento) {
        double aumento = salario * (porcentajeAumento / 100.0);
        this.salario += aumento;
    }

    // Aumentar por monto fijo
    // Se sobrecarga cambiando la cantidad de parametros
    public void actualizarSalario(double montoFijo, boolean esMontoFijo) {
        this.salario += montoFijo;
    }

    // ---- 4) Metodo toString() ----
    @Override
    public String toString() {
        return "Empleado { " +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", puesto='" + puesto + '\'' +
                ", salario=" + salario +
                " }";
    }

    // ---- 5) Metodo estatico mostrarTotalEmpleados() ----
    public static int mostrarTotalEmpleados() {
        return totalEmpleados;
    }

    // ---- 6) Getters y Setters (encapsulamiento) ----

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
