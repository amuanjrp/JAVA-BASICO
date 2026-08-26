package org.example.enums;

public class Funcionario {
    private int id;
    private String nome;
    private Double salario;
    private Setor setor;
    private Sexo sexo;
    private String idade;

    public Funcionario(int id, String nome, Double salario, Setor setor, Sexo sexo, String idade) {
        this.id = id;
        this.nome = nome;
        this.salario = salario;
        this.setor = setor;
        this.sexo = sexo;
        this.idade = idade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public Setor getSetor() {
        return setor;
    }

    public void setSetor(Setor setor) {
        this.setor = setor;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "\nId= " + id +
                "\nNome= " + nome +
                "\nSalario= R$ " + salario +
                "\nSetor= " + setor +
                "\nSexo= " + sexo +
                "\nIdade= " + idade;
    }
}
