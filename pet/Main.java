package org.example.pet;


public class Main {
    static void main(){
        Pet petUm = new Pet("Zack", 4, "Vira-lata", "Médio", "Ração para Gato");
        Pet petDos = new Pet("Yuno", 4, "Persa", "Pequeno", "Ração para Gato");

        System.out.println("\n= DADOS DO PET =\n");
        System.out.println(petUm.toString());

        System.out.println("\n= DADOS DO PET =\n");
        System.out.println(petDos.toString());



    }


}
