/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.floricultura.Model;

/**
 *
 * @author selma
 */
public class NotificacaoEntrega extends Notificacao {
    private String dataEntrega;
    private String tipoFlor;

    public NotificacaoEntrega(String destinatario, String mensagem, TipoNotificacao tipo,
                               String dataEntrega, String tipoFlor) {
        super(destinatario, mensagem, tipo);
        this.dataEntrega = dataEntrega;
        this.tipoFlor = tipoFlor;
    }

    @Override
    public void enviar() {
        preparar();
        System.out.println("Enviando notificação de ENTREGA para " + getDestinatario() +
            ": " + getMensagem() + "\nData: " + dataEntrega + " | Flor: " + tipoFlor);
    }

    // Sobrecarga
    public void enviar(String nomeFlor) {
        preparar();
        System.out.println("Enviando notificacao de ENTREGA personalizada para " +
            getDestinatario() + ": " + getMensagem() + "\nFlor escolhida: " + nomeFlor);
    }
}

