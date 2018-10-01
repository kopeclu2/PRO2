package knihovna;

public class Kniha {
    private final String nazev;
    private final Autor autor;
    private final String isbn;

    public  Kniha(String nazev, Autor autor, String isbn) {
        this.nazev = nazev;
        this.autor = autor;
        this.isbn = isbn;
    }


    public String getIsbn() {
        return isbn;
    }
    public String getNazev() {
        return nazev;
    }

    public Autor getAutor() {
        return autor;
    }
}
