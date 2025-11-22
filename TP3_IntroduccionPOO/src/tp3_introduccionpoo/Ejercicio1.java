
package tp3_introduccionpoo;

public class Ejercicio1 {
  public static void main(String[] args) {
        // Instanciar un estudiante
        Estudiante estudiante = new Estudiante(
                "Ximena",
                "Sosa",
                "Programacion II",
                7.5
        );

        // Mostrar información inicial
        System.out.println("Informacion inicial del estudiante:");
        estudiante.mostrarInfo();

        // Subir calificacion
        System.out.println("\nSubiendo 1.0 punto a la calificacion:");
        estudiante.subirCalificacion(1.0);
        estudiante.mostrarInfo();

        // Bajar calificacion
        System.out.println("\nBajando 2.0 puntos a la calificacion:");
        estudiante.bajarCalificacion(2.0);
        estudiante.mostrarInfo();
    }
}

// Clase modelo Estudiante
class Estudiante {
    String nombre;
    String apellido;
    String curso;
    double calificacion;

    public Estudiante(String nombre, String apellido, String curso, double calificacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.curso = curso;
        this.calificacion = calificacion;
    }

    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre + " " + apellido);
        System.out.println("Curso: " + curso);
        System.out.println("Calificacion: " + calificacion);
    }

    public void subirCalificacion(double puntos) {
        calificacion += puntos;
        if (calificacion > 10) {
            calificacion = 10; // limite superior
        }
    }

    public void bajarCalificacion(double puntos) {
        calificacion -= puntos;
        if (calificacion < 0) {
            calificacion = 0; // limite inferior
        }
    }
}
