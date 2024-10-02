package recursos;

public abstract class Recurso {
    protected String nome;
    protected int quantidade;
  
    public Recurso(String nome, int quantidade) {
        this.nome = nome;
        this.quantidade = quantidade;
    }
  
    public abstract void exibirDetalhes();

	public String getNome() {
		return nome;
	}

}
