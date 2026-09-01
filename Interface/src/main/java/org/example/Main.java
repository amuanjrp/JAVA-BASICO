package org.example;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Cachorro cachorro = new Cachorro();
        Gato gato = new Gato();
        Galo galo= new Galo();
        Pato pato = new Pato();


        System.out.println("Cachorro: " + cachorro.emitirSom());
        System.out.println("Cachorro: " + cachorro.comer());
        System.out.println("Gato: " + gato.emitirSom());
        System.out.println("Gato: " + gato.comer());
        System.out.println("Galo: " + galo.emitirSom());
        System.out.println("Galo: " + galo.comer());
        System.out.println("Pato: " + pato.emitirSom());
        System.out.println("Pato: " + pato.comer());

        }
}
