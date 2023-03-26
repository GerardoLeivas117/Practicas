package ejercicio1.entidades;

public class Libro {

    private String isbn;
    private String titulo;
    private String autor;
    private int cantPaginas;

    public void Libro() {

    }

    public void Libro(String isbn, String titulo, String autor, int cantPaginas) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.cantPaginas = cantPaginas;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getCantPaginas() {
        return cantPaginas;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setCantPaginas(int cantPaginas) {
        this.cantPaginas = cantPaginas;
    }

    @Override
    public String toString() {
        return "----------------------------------------\n"
                + "Información:"
                + "\nTítulo:" + titulo
                + "\nAutor:" + autor
                + "\nCantidad de páginas:" + cantPaginas
                + "\nISBN:" + isbn
                + "\n----------------------------------------";
    }

}
