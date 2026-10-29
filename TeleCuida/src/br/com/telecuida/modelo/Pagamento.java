package br.com.telecuida.modelo;

public abstract class Pagamento {
    private double valor;
    private boolean aprovado;

    public Pagamento(double valor) {
        this.valor = valor;
        this.aprovado = false;
    }

    public double getValor() { return valor; }
    public boolean estaAprovado() { return aprovado; }

    protected void setAprovado(boolean aprovado) {
        this.aprovado = aprovado;
    }

    public abstract boolean processar();
}
