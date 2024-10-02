package recursos;

public class RecursoMaterial extends Recurso {
    private String descricao;
    private String unidade;
  
    public RecursoMaterial(String nome, int quantidade, String descricao, String unidade) {
        super(nome, quantidade);
        this.descricao = descricao;
        this.unidade = unidade;
    }
  
    @Override
    public void exibirDetalhes() {
        System.out.println("Recurso Material - Nome: " + nome);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Descrição: " + descricao);
        System.out.println("Unidade: " + unidade);
    }
}

