package br.edu.etec.model;

public class Usuario {
    String nome;
    String email;
    int seguidores;

    public Usuario(String nome, String email, int seguidores) {
        this.nome = nome;
        this.email = email;
        this.seguidores = seguidores;
    }
    
    public void seguir(Usuario outroUsuario){
        outroUsuario.seguidores++;
        System.out.println(this.nome + "começou a seguir" + outroUsuario.nome);
    }

    public void postar(String conteudo) {
        System.out.println("Post de" + nome + " diz: " + conteudo);
    }

    public void exibirPerfil() {
        System.out.println("_------Perfil-----_");
        System.out.println("Nome: " + nome);
        System.out.println("Email: " + email);
        System.out.println("Seguidores: " + seguidores);
    }
}
