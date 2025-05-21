/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.meuprojeto.Model;

/**
 *
 * @author selma
 */
public class Leao extends Animal {
    public Leao(String nome, int idade) {
        super(nome, idade, Habitat.TERRESTRE);
    }

    @Override
    public void emitirSom() {
        System.out.println("O leão ruge: Grrrrr!");
    }
}