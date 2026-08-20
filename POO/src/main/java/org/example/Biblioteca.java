package org.example;

public class Biblioteca {
    static void main(String[] args){
        Livros livroUm = new Livros("Sense life Vol1", "Glitch Tellend", 56, 40.00);


        System.out.println("= Biblioteca =\n");
        System.out.println("Livros Disponives");
        System.out.println("Titulo: " + livroUm.getTitulo());
        System.out.println("Autor: " + livroUm.getAutor());
        System.out.println("Pagina: " + livroUm.getPagina() + " Pag");
        System.out.println("Preço: R$ " + livroUm.getPreco());
        System.out.println("--------------------------------");

        Livros livroDois = new Livros("Sense life Vol2", "Glitch Tellend", 60, 50.00);

        System.out.println("Titulo: " + livroDois.getTitulo());
        System.out.println("Autor: " + livroDois.getAutor());
        System.out.println("Pagina: " + livroDois.getPagina() + " Pag");
        System.out.println("Preço: R$ " + livroDois.getPreco());




    }





}
