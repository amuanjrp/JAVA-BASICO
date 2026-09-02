package Organizacao;

public class Main {

    public static void main(String[] args) {

        Motoboy motoboy = new Motoboy("Carlos Silva", "111.111.111-11", "10/05/1998", 1800.0, "ABC-1234");

        Gerente gerente = new Gerente("Ana Souza", "222.222.222-22", "22/03/1985", 5000.0, Bonificacao.GERENTE);

        System.out.println("===== MOTOBOY =====");
        System.out.println(motoboy);

        System.out.println("\n===== GERENTE =====");
        System.out.println(gerente);


        System.out.println("\n===== TESTANDO CONTRATACAO =====");
        gerente.admitir(motoboy);
        gerente.demitir(motoboy);
    }
}

