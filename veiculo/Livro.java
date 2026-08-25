package org.example.veiculo;

public class Livro {
    private String titulo;
    private String autor;
    private String isbn;
    private String numeroDePagina;
    private String valorDeCompra;

    public Livro(String titulo, String autor, String isbn, String numeroDePagina, String valorDeCompra) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.numeroDePagina = numeroDePagina;
        this.valorDeCompra = valorDeCompra;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getNumeroDePagina() {
        return numeroDePagina;
    }

    public void setNumeroDePagina(String numeroDePagina) {
        this.numeroDePagina = numeroDePagina;
    }

    public String getValorDeCompra() {
        return valorDeCompra;
    }

    public void setValorDeCompra(String valorDeCompra) {
        this.valorDeCompra = valorDeCompra;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", isbn='" + isbn + '\'' +
                ", numeroDePagina='" + numeroDePagina + '\'' +
                ", valorDeCompra='" + valorDeCompra + '\'' +
                '}';
    }
}