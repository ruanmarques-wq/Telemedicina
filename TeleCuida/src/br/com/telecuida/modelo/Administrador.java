package br.com.telecuida.modelo;

public class Administrador extends Usuario {
    public Administrador(int id, String nome, String email) {
        super(id, nome, email);
    }

    @Override
    public String getPerfil() {
        return "Administrador";
    }
}
