public class Gato extends Animales implements Mascota {

    public Gato(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void hacerSonido() {
        System.out.println("Miau");
    }

    @Override
    public void moverse() {
        System.out.println("El gato salta sigilosamente");
    }

    @Override
    public void jugar() {
        System.out.println("El gato juega con un hilo");
    }
}