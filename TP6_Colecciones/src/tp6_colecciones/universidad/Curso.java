package tp6_colecciones.universidad;

public class Curso {
    private String codigo;
    private String nombre;
    private Profesor profesor; // profesor responsable

    public Curso(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    // Set profesor sincronizando ambos lados
    public void setProfesor(Profesor nuevoProfesor) {
        if (this.profesor == nuevoProfesor) {
            return; // nada que hacer
        }

        // quitarse del profesor anterior
        if (this.profesor != null) {
            this.profesor.removerCursoInterno(this);
        }

        this.profesor = nuevoProfesor;

        // agregarse al nuevo profesor
        if (nuevoProfesor != null) {
            nuevoProfesor.agregarCursoInterno(this);
        }
    }

    public void mostrarInfo() {
        String nombreProfesor = (profesor != null) ? profesor.getNombre() : "Sin profesor";
        System.out.println("Curso: " + codigo + " - " + nombre +
                " | Profesor: " + nombreProfesor);
    }
}