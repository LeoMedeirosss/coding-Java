package doador;

import java.util.ArrayList;
import java.util.List;

import util.TipoDoador;

public class Doador {
	
    public String getNome() {
		return nome;
	}

	private String nome;
    private TipoDoador tipo;
    private String contato;
    private double totalDoado;
    private List<Doacao> doacoes;

    public Doador(String nome, TipoDoador tipo, String contato) {
        this.nome = nome;
        this.tipo = tipo;
        this.contato = contato;
        this.totalDoado = 0;
        this.doacoes = new ArrayList<>();
    }

    public void realizarDoacao(Doacao doacao) {
        doacoes.add(doacao);
        totalDoado += doacao.getValor();
    }

    public void cancelarDoacao(Doacao doacao) {
        doacoes.remove(doacao);
        totalDoado -= doacao.getValor();
    }

    public List<Doacao> listarDoacoes() {
        return doacoes;
    }

    public double obterTotalDoado() {
        return totalDoado;
    }

    public void imprimirDetalhes() {
        System.out.println("Nome do Doador: " + nome);
        System.out.println("Tipo: " + tipo);
        System.out.println("Contato: " + contato);
        System.out.println("Total doado: " + totalDoado);
        System.out.println("Doações:");
        for (Doacao doacao : doacoes) {
            doacao.imprimirDetalhes();
        }
    }
}

