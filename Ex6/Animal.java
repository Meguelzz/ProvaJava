/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.meuprojeto.Model;

/**
 *
 * @author selma
 */
public abstract class Animal {
    
    private String nome;
    private int idade;
    private Habitat habitat;

    public Animal(String nome, int idade, Habitat habitat) {
        this.nome = nome;
        this.idade = idade;
        this.habitat = habitat;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public Habitat getHabitat() {
        return habitat;
    }

    public void exibirInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade + " anos");
        System.out.println("Habitat: " + habitat);
    }

    public abstract void emitirSom();
}


