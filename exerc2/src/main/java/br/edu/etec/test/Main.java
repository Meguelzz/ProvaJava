package br.edu.etec.test;

import br.edu.etec.model.Influenciador;
import br.edu.etec.model.UsuarioComum;

public class Main {
    
    public static void main(String[] args) {
        Influenciador influenciador = new Influenciador(" TCK ", "TCKoSujo@gmail.com ", 20000);
        UsuarioComum usuario = new UsuarioComum(" Miguel ", "Miguel@gmail.com ", 200, "Java é legal");

        usuario.exibirPerfil();
        usuario.seguir(influenciador);
        usuario.postar("Meu primeiro post");
        usuario.curtirPost();

        influenciador.exibirPerfil();
        influenciador.postarPublicidade(" Nike ");
    }

}
