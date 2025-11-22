
package tp5_relacionesuml;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class Ejercicio13 {
class CodigoQR {
    private String valor;
    private UsuarioQR usuario;

    public CodigoQR(String valor, UsuarioQR usuario) {
        this.valor = valor;
        this.usuario = usuario;
    }
}

class UsuarioQR {
    private String nombre;
    private String email;

    public UsuarioQR(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
    }
}

class GeneradorQR {

    // dependencia de creacion: crea CodigoQR dentro del metodo
    public void generar(String valor, UsuarioQR usuario) {
        CodigoQR codigoQR = new CodigoQR(valor, usuario);
        System.out.println("Codigo QR generado.");
    }
}
}
