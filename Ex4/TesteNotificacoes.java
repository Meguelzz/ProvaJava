/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package br.edu.etec.floricultura.Teste;

import br.eu.etec.floricultura.Model.NotificacaoCuidados;
import br.eu.etec.floricultura.Model.NotificacaoEntrega;
import br.eu.etec.floricultura.Model.TipoNotificacao;

/**
 *
 * @author selma
 */
public class TesteNotificacoes {
    public static void main(String[] args) {
        NotificacaoEntrega entrega = new NotificacaoEntrega(
            "Maria", "Sua entrega esta a caminho!", TipoNotificacao.ENTREGA, "21/05/2025", "Rosas Vermelhas"
        );
        entrega.enviar();
        entrega.enviar("Lirios");

        System.out.println();

        NotificacaoCuidados cuidados = new NotificacaoCuidados(
            "Joao", "Regue as flores todos os dias pela manha. Evite luz solar direta por mais de 4 horas."
        );
        cuidados.enviar();
        System.out.println("Resumo rapido: " + cuidados.resumoRapido());
    }
}
