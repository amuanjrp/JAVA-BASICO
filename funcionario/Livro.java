package org.example.funcionario;

public class Livro {
    private String titulo;
    private String autor;
    private int numeroDePagina;
    private double preco;

    public Livro(String titulo, String autor, int numeroDePaginapagina, double preco) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroDePagina = numeroDePaginapagina;
        this.preco = preco;
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

    public int getNumeroDePagina() {
        return numeroDePagina;
    }

    public void setNumeroDePagina(int pagina) {
        this.numeroDePagina = pagina;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
