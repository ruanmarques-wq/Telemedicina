package br.com.telecuida.modelo;

import br.com.telecuida.servico.ValidadorAssinatura;

public abstract class DocumentoMedico {
    private String crmMedico;
    private String cpfPaciente;
    private boolean assinado;

    public DocumentoMedico(String crmMedico, String cpfPaciente) {
        this.crmMedico = crmMedico;
        this.cpfPaciente = cpfPaciente;
        this.assinado = false;
    }

    public String getCrmMedico() { return crmMedico; }
    public String getCpfPaciente() { return cpfPaciente; }
    public boolean isAssinado() { return assinado; }

    public boolean assinar(ValidadorAssinatura validador) {
        if (crmMedico != null && !crmMedico.isBlank()
                && cpfPaciente != null && !cpfPaciente.isBlank()
                && validador != null && validador.validar(this)) {
            assinado = true;
        }
        return assinado;
    }

    public abstract boolean camposObrigatoriosOk();
}
