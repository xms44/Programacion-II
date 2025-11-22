
package tp5_relacionesuml;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class Ejercicio8 {
class Documento {
    private String titulo;
    private String contenido;
    private FirmaDigital firmaDigital; // composicion

    public Documento(String titulo, String contenido, FirmaDigital firmaDigital) {
        this.titulo = titulo;
        this.contenido = contenido;
        this.firmaDigital = firmaDigital;
    }
}

class FirmaDigital {
    private String codigoHash;
    private String fecha;
    private UsuarioFirma usuario; // agregacion

    public FirmaDigital(String codigoHash, String fecha, UsuarioFirma usuario) {
        this.codigoHash = codigoHash;
        this.fecha = fecha;
        this.usuario = usuario;
    }
}

class UsuarioFirma {
    private String nombre;
    private String email;

    public UsuarioFirma(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
    }
}
}
