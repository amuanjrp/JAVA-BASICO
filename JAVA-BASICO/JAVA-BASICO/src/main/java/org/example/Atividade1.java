package org.example;

public class Atividade1 {
    static void main(String[] args) {

        String nome = "Cauan";
        double notaUm = 7;
        double notaDois = 7;
        double notaFinal = notaUm + notaDois;

        double media = notaFinal / 2;

        if (media >= 7){
            System.out.println("Aluno " + nome + " está aprovando com a media " + media);
        } else {
            System.out.println("Aluno " + nome + " está reprovado com a media " + media);
        }

    }
}
