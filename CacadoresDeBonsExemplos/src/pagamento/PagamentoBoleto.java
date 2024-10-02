package pagamento;

public class PagamentoBoleto extends Pagamento {
    private String codigoBarras;

    public PagamentoBoleto(double valor, String codigoBarras) {
        super(valor);
        this.setCodigoBarras(codigoBarras);
    }

    @Override
    public void processarPagamento() {
        // Lógica para processar pagamento via boleto
    }

    @Override
    public void cancelarPagamento() {
        // Lógica para cancelar pagamento via boleto
    }

    @Override
    public String obterStatus() {
        // Lógica para obter status do pagamento via boleto
        return null;
    }

	@Override
	public String getTipo() {
		return "Boleto";
	}

	public String getCodigoBarras() {
		return codigoBarras;
	}

	public void setCodigoBarras(String codigoBarras) {
		this.codigoBarras = codigoBarras;
	}
}
