
package tp5_relacionesuml;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class Ejercicio11 {
class Cancion {
    private String titulo;
    private Artista artista;

    public Cancion(String titulo, Artista artista) {
        this.titulo = titulo;
        this.artista = artista;
    }
}

class Artista {
    private String nombre;
    private String genero;

    public Artista(String nombre, String genero) {
        this.nombre = nombre;
        this.genero = genero;
    }
}

class Reproductor {

    // dependencia de uso: usa Cancion como parametro, no la guarda
    public void reproducir(Cancion cancion) {
        System.out.println("Reproduciendo cancion...");
    }
}
}
