public class Main {

    public static void main(String[] args) {

        Personas autor1 = new Personas("Gabriel García Márquez", "Colombiano");
        Personas director1 = new Personas("Christopher Nolan", "Británico");

        Materiales[] materiales = new Materiales[][3];

        materiales[0] = new Libros("L01", "Cien años de soledad", 1967, autor1, 417);
        materiales[1] = new Dvd("D01", "Inception", 2010, director1, 148);
        materiales[2] = new Libros("L02", "El amor en los tiempos del cólera", 1985, autor1, 368);

        ((Prestamos) materiales[0]).prestar();
        ((Prestamos) materiales[1]).prestar();
        ((Prestamos) materiales[1]).devolver();

        System.out.println("\n--- Materiales en la biblioteca ---");

        for (Materiales m : materiales) {
            m.mostrarDetalles();
            System.out.println("-----------------------");
        }
    }
}