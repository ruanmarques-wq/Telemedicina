package br.com.telecuida.servico;

import br.com.telecuida.modelo.DocumentoMedico;

public interface ValidadorAssinatura {
    boolean validar(DocumentoMedico documento);
}
