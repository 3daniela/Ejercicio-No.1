public class MainPrincipal {

    public static void main(String[] args) {

        Animales[] animales = new Animales[3];

        animales[0] = new Perro("asmudeouz", 13);
        animales[1] = new Gato("hadez", 12);
        animales[2] = new Pajaro("franchesco", 3);

        for (Animales animal : animales) {

            animal.mostrarInfo();
            animal.hacerSonido();
            animal.moverse();

            if (animal instanceof Mascota) {
                Mascota mascota = (Mascota) animal;
                mascota.jugar();
            }

            System.out.println("----------------------");
        }
    }
}