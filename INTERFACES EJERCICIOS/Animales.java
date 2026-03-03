public  abstract class Animales {
    private String  nombre;
    private int edad;

    public Animales(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;

    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public abstract void hacerSonido();
    public abstract void moverse();

    public void mostrarInfo(){
        System.out.println("nombre: " + nombre);
        System.out.println("Edad " + edad +" años");



    }
}