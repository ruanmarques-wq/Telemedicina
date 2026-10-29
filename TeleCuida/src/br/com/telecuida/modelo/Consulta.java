package br.com.telecuida.modelo;

public class Consulta {
    private Paciente paciente;
    private Medico medico;
    private String horario;
    private String status;

    public Consulta(Paciente paciente, Medico medico, String horario) {
        this.paciente = paciente;
        this.medico = medico;
        this.horario = horario;
        this.status = "AGUARDANDO_PAGAMENTO";
    }

    public boolean confirmar(Pagamento pagamento) {
        if (pagamento != null && pagamento.estaAprovado()) {
            status = "CONFIRMADA";
            return true;
        }
        return false;
    }

    public Paciente getPaciente() { return paciente; }
    public Medico getMedico() { return medico; }
    public String getHorario() { return horario; }
    public String getStatus() { return status; }
}
