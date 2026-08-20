package org.example;

import java.util.Scanner;

public class Main {
    static void main() {
//        String nome = "Marta";
//        int idade = 25;

//        Clientes clientes1 = new Clientes();
//        clientes1.nome = "Marta";
//        clientes1.idade = 25;

//      COM ENCAPSULAMENTO (PRIVATE)
//        Clientes clientes1 = new Clientes();
//        clientes1.setNome("Cauan");
//        clientes1.setIdade(22);

//        System.out.println("Nome: " + clientes1.getNome());
//        System.out.println("Idade: " + clientes1.getIdade());

        //FUNCIONARIOS
//        Funcionarios funcionario1 = new Funcionarios("Cauan", 22, "cauan@gmail.com");
//        funcionario1.setNome("Cauan");
//        funcionario1.setIdade(22);
//        funcionario1.setEmail("Cauan@gmail.com");
//
//        System.out.println("\n= FUNCIONARIOS =");
//        System.out.println("Nome: " + funcionario1.getNome());
//        System.out.println("Idade: " + funcionario1.getIdade());
//        System.out.println("E-mail: " + funcionario1.getEmail());

        //Produtos
          Produtos produto1 = new Produtos("Maça", 1, 2.0);
//        produto1.setNome("Maça");
//        produto1.setPreco(2.0);
//        produto1.setQuantidade(1);

          System.out.println("= Produtos =");
          System.out.println("Nome: " + produto1.getNome());
          System.out.println("Preço: " + produto1.getPreco());
          System.out.println("Quantidade: " + produto1.getQuantidade());

    }
}
