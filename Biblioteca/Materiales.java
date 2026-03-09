public abstract class Materiales {

    protected String codigo;
    protected String titulo;
    protected int año;
    protected Personas responsable;

    public Materiales(String codigo, String titulo, int año, Personas esponsable) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.año = año;
        this.responsable = responsable;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAño() {
        return año;
    }

    public Personas getResponsable() {
        return responsable;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public void setResponsable(Personas responsable) {
        this.responsable = responsable;
    }

    public abstract void mostrarDetalles();
}

