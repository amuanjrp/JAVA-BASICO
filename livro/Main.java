package org.example.livro;

import org.example.Livro;

public class Main {
    static void main(){
//        Instanciar a classe Livro.
        Livro livroUm = new Livro("Bleach Vol.1", "Tite Kubo", 192, 32 );
        Livro livroDos = new Livro("Bleach Vol.2", "Tite Kubo", 192, 32 );

        System.out.println("= Biblioteca =\n");
        System.out.println("Livros Disponives");
        System.out.println("Titulo: " + livroUm.getTitulo());
        System.out.println("Autor: " + livroUm.getAutor());
        System.out.println("Número de Pagina: " + livroUm.getNumeroDePagina() + " Pag");
        System.out.println("Preço: R$ " + livroUm.getPreco());
        System.out.println("--------------------------------");

        System.out.println("Livros Disponives");
        System.out.println("Titulo: " + livroDos.getTitulo());
        System.out.println("Autor: " + livroDos.getAutor());
        System.out.println("Número de Pagina: " + livroDos.getNumeroDePagina() + " Pag");
        System.out.println("Preço: R$ " + livroDos.getPreco());
        System.out.println("--------------------------------");

    }
}
