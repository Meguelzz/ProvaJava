/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.floricultura.Model;

/**
 *
 * @author selma
 */
public class NotificacaoCuidados extends Notificacao {

    public NotificacaoCuidados(String destinatario, String mensagem) {
        super(destinatario, mensagem, TipoNotificacao.CUIDADOS);
    }

    @Override
    public void enviar() {
        String msg = getMensagem();
        if (msg.length() > 100) {
            msg = msg.substring(0, 100) + "...";
        }
        System.out.println("Enviando notificação de cuidados para " + getDestinatario() + ": " + msg);
    }

    public String resumoRapido() {
        if (getMensagem().length() > 30) {
            return getMensagem().substring(0, 30) + "...";
        } else {
            return getMensagem();
        }
    }
}
