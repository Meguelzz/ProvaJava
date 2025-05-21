package br.edu.etec.model;

public class Veiculo {
    String modelo;
    String cor;
    int velocidade;

    public Veiculo(String modelo, String cor, int velocidade) {
        this.modelo = modelo;
        this.cor = cor;
        this.velocidade = 0;
    }

    public void acelerar(int incremento){
        this.velocidade += incremento; 
    }

    public void frear(int decremento){
        this.velocidade -= decremento; 
    }

    public void exibirInformacoes() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Cor: " + cor);
        System.out.println("Velocidade: " + velocidade + " km/h");
    }
}