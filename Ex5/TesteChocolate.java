/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package br.edu.etec.chocolates.Teste;

import br.edu.etec.chocolates.Model.Chocolate;
import br.edu.etec.chocolates.Model.ChocolateAmargo;
import br.edu.etec.chocolates.Model.ChocolateAoLeite;

/**
 *
 * @author selma
 */
public class TesteChocolate {
    public static void main(String[] args) {
        Chocolate[] chocolates = new Chocolate[3];

        chocolates[0] = new ChocolateAoLeite("Leite Feliz", 45, 100.0, "Integral");
        chocolates[1] = new ChocolateAmargo("Amargo Supremo", 85, 90.0, 9);
        chocolates[2] = new ChocolateAoLeite("Doce Leite", 40, 80.0, "Condensado");

        for (Chocolate choco : chocolates) {
            System.out.println("----");
            choco.exibirInformacoes();
        }

        System.out.println("\nDetalhamento especial:");
        ChocolateAoLeite leiteEspecial = new ChocolateAoLeite("Leite Premium", 50, 120.0, "Desnatado");
        leiteEspecial.exibirInformacoes(true);
    }
}
