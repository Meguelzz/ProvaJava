package br.edu.etec.model;

public class Carro extends Veiculo {
    int numeroPortas;

    public Carro(String modelo, String cor, int velocidade, int numeroPortas) {
        super(modelo, cor, velocidade);
        this.numeroPortas = numeroPortas;
    }

    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Número de portas: " + numeroPortas);
    }
}
