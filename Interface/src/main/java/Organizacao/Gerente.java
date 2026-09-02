package Organizacao;

import java.util.ArrayList;
import java.util.List;

public class Gerente extends CargoDeConfianca implements Contratacao {

    private List<Funcionario> equipe;

    public Gerente(String nome, String cpf, String dataNascimento, double salarioBase, Bonificacao bonificacao) {
        super(nome, cpf, dataNascimento, salarioBase, bonificacao);
        this.equipe = new ArrayList<>();
    }

    @Override
    public void admitir(Funcionario funcionario) {
        equipe.add(funcionario);
        System.out.println(nome + " admitiu o funcionario " + funcionario.getNome());
    }

    @Override
    public void demitir(Funcionario funcionario) {
        equipe.remove(funcionario);
        System.out.println(nome + " demitiu o funcionario " + funcionario.getNome());
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nCargo: Gerente" +
                "\nBonificacao: " + bonificacao + " (x" + bonificacao.getValor() + ")" +
                "\nSalario Final: R$ " + String.format("%.2f", obterSalarioFinal());
    }
}
