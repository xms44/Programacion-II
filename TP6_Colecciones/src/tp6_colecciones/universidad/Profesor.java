package tp6_colecciones.universidad;

import java.util.ArrayList;
import java.util.List;

public class Profesor {
    private String id;
    private String nombre;
    private String especialidad;
    private List<Curso> cursos;

    public Profesor(String id, String nombre, String especialidad) {
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.cursos = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public List<Curso> getCursos() {
        return cursos;
    }

    // Métodos internos para que Curso pueda sincronizar listas
    void agregarCursoInterno(Curso c) {
        if (!cursos.contains(c)) {
            cursos.add(c);
        }
    }

    void removerCursoInterno(Curso c) {
        cursos.remove(c);
    }

    // Métodos pedidos por el enunciado
    public void agregarCurso(Curso c) {
        if (!cursos.contains(c)) {
            cursos.add(c);
            c.setProfesor(this); // sincroniza lado del curso
        }
    }

    public void eliminarCurso(Curso c) {
        if (cursos.contains(c)) {
            cursos.remove(c);
            c.setProfesor(null); // deja profesor en null
        }
    }

    public void listarCursos() {
        System.out.println("Cursos del profesor " + nombre + ":");
        for (Curso c : cursos) {
            System.out.println("- " + c.getCodigo() + " " + c.getNombre());
        }
    }

    public void mostrarInfo() {
        System.out.println("Profesor: " + nombre +
                " | ID: " + id +
                " | Especialidad: " + especialidad +
                " | Cantidad de cursos: " + cursos.size());
    }
}
