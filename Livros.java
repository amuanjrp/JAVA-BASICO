package org.example;

public class Livros {
    private String titulo;
    private String autor;
    private int numeroDePagina;
    private double preco;

    public Livros(String titulo, String autor, int numeroDePaginapagina, double preco) {
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

    public int getPagina() {
        return numeroDePagina;
    }

    public void setPagina(int pagina) {
        this.numeroDePagina = pagina;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
