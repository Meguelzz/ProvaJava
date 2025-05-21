/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.meuprojeto.Model;

/**
 *
 * @author selma
 */
public class Arara extends Animal {
    public Arara(String nome, int idade) {
        super(nome, idade, Habitat.AEREO);
    }

    @Override
    public void emitirSom() {
        System.out.println("A arara grita: Cricri cricri!");
    }
}
