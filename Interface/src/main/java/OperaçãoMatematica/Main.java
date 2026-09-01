package OperaçãoMatematica;

public class Main {
    static void main(){
        Soma soma = new Soma();
        Subtracao subtracao = new Subtracao();
        Multiplicacao multiplicacao = new Multiplicacao();
        Divisao divisao = new Divisao();

        System.out.println("Soma: " + soma.calcular(10,20));
        System.out.println("Subtração: " + subtracao.calcular(20,30));
        System.out.println("Multiplicação: " + multiplicacao.calcular(20,3));
        System.out.println("Divisão: " + divisao.calcular(70,5));

    }
}
