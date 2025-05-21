/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.fazenda.Model;

/**
 *
 * @author selma
 */
public class AlertaIrrigacao extends Alerta {

    public AlertaIrrigacao(String destinatario, String mensagem) {
        super(destinatario, mensagem, TipoAlerta.IRRIGACAO);
    }

    @Override
    public void enviar() {
        String msg = getMensagem();
        if (msg.length() > 50) {
            msg = msg.substring(0, 50) + "...";
        }
        System.out.println("=== ALERTA DE IRRIGAÇÃO ===");
        System.out.println("Destinatário: " + getDestinatario());
        System.out.println("Mensagem (corte simulado): " + msg);
    }
}
