package br.com.telecuida.servico;

import br.com.telecuida.modelo.DocumentoMedico;

public class ValidadorSimulado implements ValidadorAssinatura {
    @Override
    public boolean validar(DocumentoMedico documento) {
        return documento != null && documento.camposObrigatoriosOk();
    }
}
