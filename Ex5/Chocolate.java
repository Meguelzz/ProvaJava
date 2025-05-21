/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.chocolates.Model;

/**
 *
 * @author selma
 */
public class Chocolate {
    private String nome;
    private int porcentagemCacau;
    private double peso;

    public Chocolate(String nome, int porcentagemCacau, double peso) {
        this.nome = nome;
        this.porcentagemCacau = porcentagemCacau;
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPorcentagemCacau() {
        return porcentagemCacau;
    }

    public void setPorcentagemCacau(int porcentagemCacau) {
        this.porcentagemCacau = porcentagemCacau;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void exibirInformacoes() {
        System.out.println("Chocolate: " + nome);
        System.out.println("Cacau: " + porcentagemCacau + "%");
        System.out.println("Peso: " + peso + "g");
    }
}
