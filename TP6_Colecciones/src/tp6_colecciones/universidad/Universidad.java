package tp6_colecciones.universidad;

import java.util.ArrayList;
import java.util.List;

public class Universidad {
    private String nombre;
    private List<Profesor> profesores;
    private List<Curso> cursos;

    public Universidad(String nombre) {
        this.nombre = nombre;
        this.profesores = new ArrayList<>();
        this.cursos = new ArrayList<>();
    }

    public void agregarProfesor(Profesor p) {
        profesores.add(p);
    }

    public void agregarCurso(Curso c) {
        cursos.add(c);
    }

    public Profesor buscarProfesorPorId(String id) {
        for (Profesor p : profesores) {
            if (p.getId().equalsIgnoreCase(id)) {
                return p;
            }
        }
        return null;
    }

    public Curso buscarCursoPorCodigo(String codigo) {
        for (Curso c : cursos) {
            if (c.getCodigo().equalsIgnoreCase(codigo)) {
                return c;
            }
        }
        return null;
    }

    public void listarProfesores() {
        System.out.println("PROFESORES EN " + nombre + " ");
        for (Profesor p : profesores) {
            p.mostrarInfo();
        }
    }

    public void listarCursos() {
        System.out.println("CURSOS EN " + nombre + " ");
        for (Curso c : cursos) {
            c.mostrarInfo();
        }
    }

    // asignarProfesorACurso
    public void asignarProfesorACurso(String codigoCurso, String idProfesor) {
        Curso curso = buscarCursoPorCodigo(codigoCurso);
        Profesor profesor = buscarProfesorPorId(idProfesor);

        if (curso != null && profesor != null) {
            curso.setProfesor(profesor);
        }
    }

    // eliminarCurso: rompe la relación con su profesor
    public void eliminarCurso(String codigo) {
        Curso curso = buscarCursoPorCodigo(codigo);
        if (curso != null) {
            curso.setProfesor(null); // rompe vínculo
            cursos.remove(curso);
        }
    }

    // eliminarProfesor: deja profesor = null en sus cursos
    public void eliminarProfesor(String id) {
        Profesor profesor = buscarProfesorPorId(id);
        if (profesor != null) {
            // poner en null los cursos
            for (Curso c : new ArrayList<>(profesor.getCursos())) {
                c.setProfesor(null);
            }
            profesores.remove(profesor);
        }
    }
}