package br.edu.etec.model;

public class UsuarioComum extends Usuario {
    String biografia;

    public UsuarioComum(String nome, String email, int seguidores, String biografia) {
        super(nome, email, seguidores);
        this.biografia = biografia;
    }

    public void curtirPost() {
        System.out.println(nome + " curtiu um post");
    }

    public void exibirPerfil() {
        super.exibirPerfil();
        System.out.println("Biografia: " + biografia);
    }
}