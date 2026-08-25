package org.example.funcionario;

import org.example.Livros;

public class Main {
    static void main(){

        Livros livroUm = new Livros("Sense life Vol.1", "Glitch Tellend", 56, 40.00);
        Funcionario funcionario = new Funcionario("Cauan", "863.152.785-82", "26-04-2004", "cauanjpr@gmail.com");

        System.out.println("\n- Dados do Funcionario -");
        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("CPF: " + funcionario.getCpf());
        System.out.println("Data de Nacimento: " + funcionario.getDataDeNacimento());
        System.out.println("Email: " + funcionario.getEmail());
        System.out.println("\n- Livros em Posse - ");
        System.out.println("Titulo: " + livroUm.getTitulo());
        System.out.println("Autor: " + livroUm.getAutor());
        System.out.println("Número de Pagina: " + livroUm.getPagina() + " Pag");
        System.out.println("Preço: R$ " + livroUm.getPreco());
        System.out.println("--------------------------------");


    }

}
