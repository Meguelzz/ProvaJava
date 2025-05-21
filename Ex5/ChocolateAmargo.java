/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.chocolates.Model;

/**
 *
 * @author selma
 */
public class ChocolateAmargo extends Chocolate {
    private int amargor;

    public ChocolateAmargo(String nome, int porcentagemCacau, double peso, int amargor) {
        super(nome, porcentagemCacau, peso);
        this.amargor = amargor;
    }

    public int getAmargor() {
        return amargor;
    }

    public void setAmargor(int amargor) {
        this.amargor = amargor;
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Nível de amargor: " + amargor + "/10");
    }
}

