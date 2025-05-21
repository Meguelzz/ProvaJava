/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.meuprojeto.Teste;

import br.edu.etec.meuprojeto.Model.Arara;
import br.edu.etec.meuprojeto.Model.Golfinho;
import br.edu.etec.meuprojeto.Model.Leao;

/**
 *
 * @author selma
 */
public class TesteZoologico {
    public static void main(String[] args) {
        Leao leao = new Leao("Simba", 5);
        Golfinho golfinho = new Golfinho("Flipper", 8);
        Arara arara = new Arara("Loro", 3);

        System.out.println("=== LEÃO ===");
        leao.exibirInfo();
        leao.emitirSom();

        System.out.println("\n=== GOLFINHO ===");
        golfinho.exibirInfo();
        golfinho.emitirSom();

        System.out.println("\n=== ARARA ===");
        arara.exibirInfo();
        arara.emitirSom();
    }
}
    

