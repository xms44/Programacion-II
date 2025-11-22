
package tp4_poo_empleados;

public class PruebaEmpleado {
 public static void main(String[] args) {

        // 1) Empleado creado con todos los atributos
        Empleado e1 = new Empleado(100, "Ana Perez", "Desarrolladora", 800000.0);

        // 2) Empleados creados con constructor de nombre + puesto
        Empleado e2 = new Empleado("Juan Lopez", "Tester");
        Empleado e3 = new Empleado("Carla Diaz", "DevOps");

        System.out.println("Empleados recien creados:");
        System.out.println(e1.toString());
        System.out.println(e2.toString());
        System.out.println(e3.toString());

        // 3) Aplicar aumentos usando metodos sobrecargados

        // e1: aumento del 10% (usa actualizarSalario(double porcentaje))
        e1.actualizarSalario(10.0);

        // e2: aumento de 50000 fijos
        e2.actualizarSalario(50000.0, true);

        // e3: aumento del 5% y luego 30000 fijos
        e3.actualizarSalario(5.0);
        e3.actualizarSalario(30000.0, true);

        System.out.println("\nEmpleados despues de los aumentos:");
        System.out.println(e1.toString());
        System.out.println(e2.toString());
        System.out.println(e3.toString());

        // 4) Mostrar total de empleados creados
        System.out.println("\nTotal de empleados creados: " +
                Empleado.mostrarTotalEmpleados());
    }
}
