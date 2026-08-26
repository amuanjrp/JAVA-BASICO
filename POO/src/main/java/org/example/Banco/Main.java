package org.example.Banco;

public class Main {
    static void main() {
        Funcionario funcionarioUm = new Funcionario("3214", "Cauan Palmeira", "Rua Direta - 182", "(71)88888-8888", "cauanjrp@hotmail.com",
                new ContaBancaria("SantoAndre", "0001-9", "485785-1", "Corrente", 5.540, 10.000));

        System.out.println("== Dados ==");
        System.out.println(funcionarioUm.toString());
    }
}
