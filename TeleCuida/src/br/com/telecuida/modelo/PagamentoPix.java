package br.com.telecuida.modelo;

public class PagamentoPix extends Pagamento {
    private String chavePix;

    public PagamentoPix(double valor, String chavePix) {
        super(valor);
        this.chavePix = chavePix;
    }

    @Override
    public boolean processar() {
        boolean valido = chavePix != null && !chavePix.isBlank() && getValor() > 0;
        setAprovado(valido);
        return valido;
    }
}
