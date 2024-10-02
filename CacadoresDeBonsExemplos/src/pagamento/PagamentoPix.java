package pagamento;

public class PagamentoPix extends Pagamento {
    private String chavePix;

    public PagamentoPix(double valor, String chavePix) {
        super(valor);
        this.chavePix = chavePix;
    }

    @Override
    public void processarPagamento() {
        // Lógica para processar pagamento via PIX
    }

    @Override
    public void cancelarPagamento() {
        // Lógica para cancelar pagamento via PIX
    }

    @Override
    public String obterStatus() {
        // Lógica para obter status do pagamento via PIX
        return null;
    }

	@Override
	public String getTipo() {
		return "Pix";
	}
}
