package tp6_colecciones.universidad;

public class AppUniversidad {

    public static void main(String[] args) {

        Universidad uni = new Universidad("Universidad Tecnologica");

        // 1) Crear profesores
        Profesor p1 = new Profesor("P1", "Ana Lopez", "Programacion");
        Profesor p2 = new Profesor("P2", "Carlos Diaz", "Bases de Datos");
        Profesor p3 = new Profesor("P3", "Maria Perez", "Redes");

        // 1) Crear cursos
        Curso c1 = new Curso("C1", "Programacion I");
        Curso c2 = new Curso("C2", "Programacion II");
        Curso c3 = new Curso("C3", "Base de Datos");
        Curso c4 = new Curso("C4", "Redes I");
        Curso c5 = new Curso("C5", "Seguridad Informatica");

        // 2) Agregar a la universidad
        uni.agregarProfesor(p1);
        uni.agregarProfesor(p2);
        uni.agregarProfesor(p3);

        uni.agregarCurso(c1);
        uni.agregarCurso(c2);
        uni.agregarCurso(c3);
        uni.agregarCurso(c4);
        uni.agregarCurso(c5);

        // 3) Asignar profesores a cursos
        uni.asignarProfesorACurso("C1", "P1");
        uni.asignarProfesorACurso("C2", "P1");
        uni.asignarProfesorACurso("C3", "P2");
        uni.asignarProfesorACurso("C4", "P3");

        // 4) Listar cursos y profesores
        System.out.println("CURSOS Y PROFESORES:");
        uni.listarCursos();

        System.out.println();
        uni.listarProfesores();
        System.out.println();
        p1.listarCursos();
        p2.listarCursos();
        p3.listarCursos();

        // 5) Cambiar profesor de un curso
        System.out.println("\n=CAMBIAR PROFESOR DEL CURSO C2 A P2:");
        uni.asignarProfesorACurso("C2", "P2");
        uni.listarCursos();
        System.out.println();
        p1.listarCursos();
        p2.listarCursos();

        // 6) Remover un curso
        System.out.println("\nELIMINAR CURSO C3:");
        uni.eliminarCurso("C3");
        uni.listarCursos();
        System.out.println();
        p2.listarCursos();

        // 7) Remover un profesor (P3) y dejar cursos con profesor = null
        System.out.println("\nELIMINAR PROFESOR P3");
        uni.eliminarProfesor("P3");
        uni.listarCursos(); // el curso C4 queda sin profesor
    }
}