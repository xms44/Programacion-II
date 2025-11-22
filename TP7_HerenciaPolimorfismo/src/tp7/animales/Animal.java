package tp7.animales;

public class Animal {

    protected String nombre;

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    public void hacerSonido() {
        System.out.println("Sonido generico de animal.");
    }

    public void describirAnimal() {
        System.out.println("Soy un animal llamado " + nombre + ".");
    }
}