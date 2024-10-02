package doador;
import java.util.Date;
import pagamento.Pagamento;
import recursos.Recurso;
import ong.Ong;

import java.util.Date;

public class Doacao {
    private Ong ong;
    private Recurso recurso;
    private int quantidade;
    private Date data;
    private Doador doador;
    private double valor;
    private Pagamento pagamento;

    public Doacao(Recurso recurso, int quantidade, Date data, Doador doador, double valor, Pagamento pagamento) {
        this.recurso = recurso;
        this.quantidade = quantidade;
        this.data = data;
        this.doador = doador;
        this.valor = valor;
        this.pagamento = pagamento;
    }

    public Recurso getRecurso() {
        return recurso;
    }

    public void setRecurso(Recurso recurso) {
        this.recurso = recurso;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Doador getDoador() {
        return doador;
    }

    public void setDoador(Doador doador) {
        this.doador = doador;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Pagamento getPagamento() {
        return pagamento;
    }

    public void setPagamento(Pagamento pagamento) {
        this.pagamento = pagamento;
    }

    public void imprimirDetalhes() {
        System.out.println("Recurso doado: " + recurso.getNome());
        System.out.println("Quantidade doada: " + quantidade);
        System.out.println("Data da doação: " + data);
        System.out.println("Doador: " + doador.getNome());
        System.out.println("Tipo de pagamento: " + pagamento.getTipo());
    }

	public Ong getOng() {
		return ong;
	}

	public void setOng(Ong ong) {
		this.ong = ong;
	}
}
