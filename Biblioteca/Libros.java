public class Libros extends Materiales implements Prestamos {

    private int numeroPaginas;
    private boolean prestado = false;

    public Libros(String codigo, String titulo, int año, Personas responsable, int numeroPaginas) {
        super(codigo, titulo, año, responsable);
        this.numeroPaginas = numeroPaginas;
    }

    @Override
    public void prestar() {
        if (!prestado) {
            prestado = true;
            System.out.println("Libro prestado");
        } else {
            System.out.println("El libro ya está prestado");
        }
    }

    @Override
    public void devolver() {
        prestado = false;
        System.out.println("Libro devuelto");
    }

    @Override
    public boolean isPrestado() {
        return prestado;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Libro: " + titulo);
        System.out.println("Código: " + codigo);
        System.out.println("Año: " + año);
        System.out.println("Autor: " + responsable.getNombre());
        System.out.println("Páginas: " + numeroPaginas);
        System.out.println("Prestado: " + prestado);
    }
}