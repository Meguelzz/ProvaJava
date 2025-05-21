/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package br.edu.etec.fazenda.Teste;

import br.edu.etec.fazenda.Model.Alerta;
import br.edu.etec.fazenda.Model.AlertaClima;
import br.edu.etec.fazenda.Model.AlertaIrrigacao;

/**
 *
 * @author selma
 */
public class TesteAlertas {
    public static void main(String[] args) {
        Alerta[] alertas = new Alerta[3];

        alertas[0] = new AlertaClima("Funcionário João", "Tempestade prevista para hoje à noite.", "Chuva forte com ventos de até 60 km/h.");
        alertas[1] = new AlertaIrrigacao("Setor Norte", "O sistema de irrigação foi desligado temporariamente para manutenção preventiva.");
        alertas[2] = new AlertaClima("Gerente Carla", "Frente fria chegando à fazenda.", "Queda de temperatura e possibilidade de geada.");

        for (Alerta alerta : alertas) {
            alerta.preparar();
            alerta.enviar();
            System.out.println();
        }
    }
}
