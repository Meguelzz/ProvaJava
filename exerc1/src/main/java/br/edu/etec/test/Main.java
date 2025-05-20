package br.edu.etec.test;

import br.edu.etec.model.Carro;
import br.edu.etec.model.Veiculo;

public class Main {
    public static void main(String[] args) {
        Veiculo veiculo = new Veiculo("Nissan", "Preto", 20);
        Carro carro = new Carro("Volkswagen", "Prata", 10, 2);

        veiculo.acelerar(40);
        carro.acelerar(30);

        veiculo.exibirInformacoes();
        carro.exibirInformacoes();
    }
}