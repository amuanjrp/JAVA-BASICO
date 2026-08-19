package org.example;

import java.util.Scanner;

public class Atividade6 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double[] notas = new double[2];

        for (int i = 0; i < notas.length; i++) {
            double entrada;

            do {
                System.out.println("Digite a " + (i + 1) + "ª nota (entre 0 e 10):");
                entrada = ler.nextDouble();

                if (entrada < 0 || entrada > 10) {
                    System.out.println("Nota inválida! Tente novamente.");
                }
            } while (entrada < 0 || entrada > 10);

            notas[i] = entrada;
        }

        System.out.println("\nExibindo as notas:");
        for (double nota : notas) {
            System.out.println("Nota: " + nota);
        }

        ler.close();
    }
}