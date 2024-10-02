package recursos;

public class RecursoFinanceiro extends Recurso{
	 private double valor;
	    private String moeda;
	    private String fonte;
	  
	    public RecursoFinanceiro(String nome, int quantidade, double valor, String moeda, String fonte) {
	        super(nome, quantidade);
	        this.valor = valor;
	        this.moeda = moeda;
	        this.fonte = fonte;
	    }
	  
	    @Override
	    public void exibirDetalhes() {
	        System.out.println("Recurso Financeiro - Nome: " + nome);
	        System.out.println("Quantidade: " + quantidade);
	        System.out.println("Valor: " + valor + " " + moeda);
	        System.out.println("Fonte: " + fonte);
	    }

}
