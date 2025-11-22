package tp7.figuras;

public class AppFiguras {

    public static void main(String[] args) {

        Figura[] figuras = new Figura[3];
        figuras[0] = new Circulo(2.5);
        figuras[1] = new Rectangulo(3, 4);
        figuras[2] = new Circulo(1.0);

        System.out.println("Áreas de las figuras:");
        for (Figura f : figuras) {
            System.out.println(f.getNombre() + " -> " + f.calcularArea());
        }
    }
}