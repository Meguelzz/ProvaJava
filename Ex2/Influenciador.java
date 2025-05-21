package br.edu.etec.model;

public class Influenciador extends Usuario {
    int parcerias;

    public Influenciador(String nome, String email, int seguidores) {
        super(nome, email, seguidores);
        this.parcerias = 0;
    }

    public void postarPublicidade(String marca) {
        System.out.println(nome + " fez um post patrocinado por " + marca);
        parcerias++;
        postar("Parceria com" + marca);
    }

    public void exibirPerfil() {
        super.exibirPerfil();
        System.out.println("Parcerias: " + parcerias);
        System.out.println("Tipo: Influenciador");
    }
}
