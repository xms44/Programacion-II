package tp7.animales;

public class AppAnimales {

    public static void main(String[] args) {

        Animal[] animales = new Animal[3];
        animales[0] = new Perro("Firulais");
        animales[1] = new Gato("Mishi");
        animales[2] = new Vaca("Lola");

        System.out.println("Sonidos de animales:");
        for (Animal a : animales) {
            a.describirAnimal();
            a.hacerSonido();   // se ejecuta la versión sobrescrita
            System.out.println();
        }
    }
}
