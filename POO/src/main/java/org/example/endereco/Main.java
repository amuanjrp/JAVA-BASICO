package org.example.endereco;

public class Main {
    static void main(){
        Pet petUm = new Pet("Zack", "6", "Gato");
        Cliente clienteUm = new Cliente("Cauan", 22, petUm);

        Cliente clienteDos = new Cliente("Davi", 19,
          new Pet("Zeus", "4", "Gato"));

        System.out.println(clienteUm.toString());
        System.out.println(clienteDos.toString());


    }
}
