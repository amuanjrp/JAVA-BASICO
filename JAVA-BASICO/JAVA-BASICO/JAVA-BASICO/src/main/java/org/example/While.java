package org.example;

import java.util.Scanner;

public class While {
    static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        int idade = ler.nextInt();

        while(idade<18){
            System.out.println("Acesso Negado");
            System.out.println("Digite sua Idade: ");
            idade = ler.nextInt();
        }

        System.out.println("Acesso Permitido.");
        System.out.println("Carregando...");
    }
}
