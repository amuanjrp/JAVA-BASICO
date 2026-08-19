package org.example;

public class Atividade3 {
    static void main(String[] args){
        double notaUm = 4;
        double notaDois = 4;
        double notaTres = 4;
        double notaFinal = notaUm + notaDois + notaTres;
        
        double media = notaFinal / 3;

        if (media >= 7){
            System.out.println("Nota " + media + " - Aprovado");
        } else if (media >= 5) {
            System.out.println("Nota " + media + " - Verificação Suplementar");
        } else {
            System.out.println("Nota " + media + " - Reprovado");
        }
    }
}
