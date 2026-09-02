package Organizacao;

public class Motoboy extends Funcionario {

    private String placaDaMoto;

    public Motoboy(String nome, String cpf, String dataNascimento, double salarioBase, String placaDaMoto) {
        super(nome, cpf, dataNascimento, salarioBase);
        this.placaDaMoto = placaDaMoto;
    }

    public String getPlacaDaMoto() {
        return placaDaMoto;
    }

    public void setPlacaDaMoto(String placaDaMoto) {
        this.placaDaMoto = placaDaMoto;
    }

    @Override
    public double obterSalarioFinal() {
        // Motoboy nao possui bonificacao, recebe apenas o salario base
        return salarioBase;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nPlaca da Moto: " + placaDaMoto +
                "\nSalario Final: R$ " + String.format("%.2f", obterSalarioFinal());
    }
}