public class Dvd extends Materiales implements Prestamos {


    private double duracion;
    private boolean prestado = false;

    public Dvd(String codigo, String titulo, int año, Personas responsable, double duracion) {
        super(codigo, titulo, año, responsable);
        this.duracion = duracion;
    }

    @Override
    public void prestar() {
        if (!prestado) {
            prestado = true;
            System.out.println("DVD prestado");
        } else {
            System.out.println("El DVD ya está prestado");
        }
    }

    @Override
    public void devolver() {
        prestado = false;
        System.out.println("DVD devuelto");
    }

    @Override
    public boolean isPrestado() {
        return prestado;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("DVD: " + titulo);
        System.out.println("Código: " + codigo);
        System.out.println("Año: " + año);
        System.out.println("Director: " + responsable.getNombre());
        System.out.println("Duración: " + duracion + " minutos");
        System.out.println("Prestado: " + prestado);
    }
}