/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.fazenda.Model;

/**
 *
 * @author selma
 */
public class Alerta {
    private String destinatario;
    private String mensagem;
    private TipoAlerta tipo;

    public Alerta(String destinatario, String mensagem, TipoAlerta tipo) {
        this.destinatario = destinatario;
        this.mensagem = mensagem;
        this.tipo = tipo;
    }

    public void preparar() {
        System.out.println("Preparando alerta para: " + destinatario);
    }

    public void enviar() {
        System.out.println("Enviando alerta (" + tipo + "): " + mensagem);
    }

    // Getters
    public String getDestinatario() {
        return destinatario;
    }

    public String getMensagem() {
        return mensagem;
    }

    public TipoAlerta getTipo() {
        return tipo;
    }
}
