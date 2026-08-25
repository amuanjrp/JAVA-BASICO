package org.example.veiculo;

public class Veiculo {
    private String placa;
    private String cor;
    private String numeroDePassageiros;
    private String capacidedaDeTanque;
    private String velocidadeMaxima;
    private String consumoMedia;

    public Veiculo(String placa, String cor, String numeroDePassageiros, String capacidedaDeTanque, String velocidadeMaxima, String consumoMedia) {
        this.placa = placa;
        this.cor = cor;
        this.numeroDePassageiros = numeroDePassageiros;
        this.capacidedaDeTanque = capacidedaDeTanque;
        this.velocidadeMaxima = velocidadeMaxima;
        this.consumoMedia = consumoMedia;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getNumeroDePassageiros() {
        return numeroDePassageiros;
    }

    public void setNumeroDePassageiros(String numeroDePassageiros) {
        this.numeroDePassageiros = numeroDePassageiros;
    }

    public String getCapacidedaDeTanque() {
        return capacidedaDeTanque;
    }

    public void setCapacidedaDeTanque(String capacidedaDeTanque) {
        this.capacidedaDeTanque = capacidedaDeTanque;
    }

    public String getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(String velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public String getConsumoMedia() {
        return consumoMedia;
    }

    public void setConsumoMedia(String consumoMedia) {
        this.consumoMedia = consumoMedia;
    }

    @Override
    public String toString() {
        return "Veiculo{" +
                "placa='" + placa + '\'' +
                ", cor='" + cor + '\'' +
                ", numeroDePassageiros='" + numeroDePassageiros + '\'' +
                ", capacidedaDeTanque='" + capacidedaDeTanque + '\'' +
                ", velocidadeMaxima='" + velocidadeMaxima + '\'' +
                ", consumoMedia='" + consumoMedia + '\'' +
                '}';
    }
}
