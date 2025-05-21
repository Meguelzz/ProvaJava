/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.fazenda.Model;

/**
 *
 * @author selma
 */
public class AlertaClima extends Alerta {
    private String previsao;

    public AlertaClima(String destinatario, String mensagem, String previsao) {
        super(destinatario, mensagem, TipoAlerta.CLIMA);
        this.previsao = previsao;
    }

    @Override
    public void enviar() {
        System.out.println("=== ALERTA DE CLIMA ===");
        System.out.println("Destinatário: " + getDestinatario());
        System.out.println("Mensagem: " + getMensagem());
        System.out.println("Previsão: " + previsao);
        System.out.println("Ação sugerida: Verificar telhados e proteger os animais.");
    }
}

