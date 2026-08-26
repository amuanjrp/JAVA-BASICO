package org.example.saideira;

public class Main {
    static void main(){
        Pessoa pessoaUm = new Pessoa(1, "Cauan", 22, "(71) 9 8888-8888"," cauan@gmail.com", Sexo.MASCULINO,
                new Endereco("Uruguai", "166", "Deposito", "40270-580", "Salvador", UnidadeFederativa.BAHIA));

        System.out.println(pessoaUm.toString());
    }
}
