package recursos;

public class RecursoPerecivel extends Recurso {
    private String descricao;
    private String dataValidade;
  
    public RecursoPerecivel(String nome, int quantidade, String descricao, String dataValidade) {
        super(nome, quantidade);
        this.descricao = descricao;
        this.dataValidade = dataValidade;
    }
  
    @Override
    public void exibirDetalhes() {
        System.out.println("Recurso Perecível - Nome: " + nome);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Descrição: " + descricao);
        System.out.println("Data de Validade: " + dataValidade);;
    }
}
