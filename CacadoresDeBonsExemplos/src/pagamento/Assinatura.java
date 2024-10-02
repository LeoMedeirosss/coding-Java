package pagamento;
import ong.Ong;

import java.util.Date;

import doador.Doador;

public class Assinatura{

	 private String id;
	private Doador doador;
	private Ong ong;
	private double valor;
	private String moeda;
	private String status;
	private Date dataInicio;
	private Date dataFim;

	public Assinatura(String id, Doador doador, Ong ong, double valor, String moeda, String status, Date dataInicio) {
	        this.id = id;
	        this.doador = doador;
	        this.ong = ong;
	        this.valor = valor;
	        this.moeda = moeda;
	        this.status = status;
	        this.dataInicio = dataInicio;
	        this.dataFim = null;
	        }

	public String getId() {
	        return id;
	        }

	public Doador getDoador() {
	        return doador;
	        }

	public Ong getOng() {
	        return ong;
	        }

	public double getValor() {
	        return valor;
	        }

	public String getMoeda() {
	        return moeda;
	        }

	public String getStatus() {
	        return status;
	        }

	public Date getDataInicio() {
	        return dataInicio;
	        }

	public Date getDataFim() {
	        return dataFim;
	        }

	public void setDataFim(Date dataFim) {
	        this.dataFim = dataFim;
	        }

	public void cancelar() {
	        this.status = "Cancelada";
	        this.dataFim = new Date();
	        }
}

