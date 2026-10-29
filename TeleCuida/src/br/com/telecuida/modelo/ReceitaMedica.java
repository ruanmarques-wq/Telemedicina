package br.com.telecuida.modelo;

public class ReceitaMedica extends DocumentoMedico {
    private String medicamento;
    private String dosagem;

    public ReceitaMedica(String crmMedico, String cpfPaciente, String medicamento, String dosagem) {
        super(crmMedico, cpfPaciente);
        this.medicamento = medicamento;
        this.dosagem = dosagem;
    }

    @Override
    public boolean camposObrigatoriosOk() {
        return medicamento != null && !medicamento.isBlank()
                && dosagem != null && !dosagem.isBlank();
    }
}
