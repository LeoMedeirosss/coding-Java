package pagamento;

public abstract class Pagamento {
    private double valor;

    public Pagamento(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }
    
    public abstract String getTipo();

    public abstract void processarPagamento();
    public abstract void cancelarPagamento();
    public abstract String obterStatus();
}

