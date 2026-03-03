public class Perro extends Animales implements Mascota {

    public Perro(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void hacerSonido(){
        System.out.println("Guau guau");
    }

    @Override
    public void moverse() {
        System.out.println("El perro corre");
    }

    @Override
    public void jugar() {
        System.out.println("El perro juega con la pelota");
    }
}
