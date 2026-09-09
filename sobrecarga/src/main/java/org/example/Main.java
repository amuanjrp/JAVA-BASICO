package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Calculadora calculadora = new Calculadora();

        System.out.println(calculadora.calcular(2,3));
        System.out.println(calculadora.calcular(2.5,3.5));
        System.out.println(calculadora.calcular("Se","NAI"));

    }
}