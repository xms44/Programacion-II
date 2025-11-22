package tp7.empleados;

public class AppEmpleados {

    public static void main(String[] args) {

        Empleado[] empleados = new Empleado[4];

        empleados[0] = new EmpleadoPlanta("Ana", 400000, 5, 15000);
        empleados[1] = new EmpleadoTemporal("Luis", 120, 2500);
        empleados[2] = new EmpleadoPlanta("Maria", 500000, 2, 20000);
        empleados[3] = new EmpleadoTemporal("Carlos", 80, 2200);

        int cantPlanta = 0;
        int cantTemporales = 0;

        System.out.println("Sueldos de empleados:");
        for (Empleado e : empleados) {
            double sueldo = e.calcularSueldo();   // llamada polimórfica
            System.out.println(e.getNombre() + " -> $" + sueldo);

            if (e instanceof EmpleadoPlanta) {
                cantPlanta++;
            } else if (e instanceof EmpleadoTemporal) {
                cantTemporales++;
            }
        }

        System.out.println("\nCantidad de empleados de planta: " + cantPlanta);
        System.out.println("Cantidad de empleados temporales: " + cantTemporales);
    }
}
