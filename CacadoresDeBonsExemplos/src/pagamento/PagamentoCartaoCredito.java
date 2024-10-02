package pagamento;

public class PagamentoCartaoCredito extends Pagamento {
    private String numeroCartao;
    private String dataValidade;
    private String codigoSeguranca;

    public PagamentoCartaoCredito(double valor, String numeroCartao, String dataValidade, String codigoSeguranca) {
        super(valor);
        this.numeroCartao = numeroCartao;
        this.dataValidade = dataValidade;
        this.codigoSeguranca = codigoSeguranca;
    }

    @Override
    public void processarPagamento() {
        // Lógica para processar pagamento via cartão de crédito
    }

    @Override
    public void cancelarPagamento() {
        // Lógica para cancelar pagamento via cartão de crédito
    }

    @Override
    public String obterStatus() {
        // Lógica para obter status do pagamento via cartão de crédito
        return null;
    }

	@Override
	public String getTipo() {
		return "CartaoDeCredito";
	}
}
