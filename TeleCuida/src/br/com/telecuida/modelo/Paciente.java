package br.com.telecuida.modelo;

public class Paciente extends Usuario {
    public Paciente(int id, String nome, String email) {
        super(id, nome, email);
    }

    @Override
    public String getPerfil() {
        return "Paciente";
    }
}
