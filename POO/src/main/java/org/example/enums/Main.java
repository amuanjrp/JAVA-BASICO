package org.example.enums;

public class Main {
    static void main(){
       Funcionario funcionarioUm = new Funcionario(1, "Cauan Palmeira", 3580.0, Setor.FINANCEIRO, Sexo.MASCULINO, "22");
       Funcionario funcionarioDos = new Funcionario(2, "Claudia Santos", 3300.0, Setor.VENDAS, Sexo.FEMININO, "21");

        System.out.println(funcionarioUm.toString());
        System.out.println(funcionarioDos.toString());

    }
}
