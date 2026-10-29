package br.com.telecuida.modelo;

public class Medico extends Usuario {
    private String crm;
    private String especialidade;

    public Medico(int id, String nome, String email, String crm, String especialidade) {
        super(id, nome, email);
        this.crm = crm;
        this.especialidade = especialidade;
    }

    public String getCrm() { return crm; }
    public String getEspecialidade() { return especialidade; }

    @Override
    public String getPerfil() {
        return "Médico";
    }
}
