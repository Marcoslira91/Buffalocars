package Locadora;

import java.util.Date; // Classe data


public class Locacao {

	// Atributo
	private Date dataLocacao;
	private Date dataDevolucao;
	private double valorLocacao;
	private boolean devolvido;

	// Contrutore
	public Locacao(Date _dataLocacao, Date _dataDevolucao, double _valorLocacao, boolean _devolvido) {
		this.dataLocacao = _dataLocacao;
		this.dataDevolucao = _dataDevolucao;
		this.valorLocacao = _valorLocacao;
		this.devolvido = _devolvido;

	}

	// Metodos (Função)
	public boolean registrarLocacao() {
		return devolvido;
	}

	public Date getDataLocacao() {
		return dataLocacao;
	}

	public void setDataLocacao(Date dataLocacao) {
		this.dataLocacao = dataLocacao;
	}

	public Date getDataDevolucao() {
		return dataDevolucao;
	}

	public void setDataDevolucao(Date dataDevolucao) {
		this.dataDevolucao = dataDevolucao;
	}

	public double getValorLocacao() {
		return valorLocacao;
	}

	public void setValorLocacao(double valorLocacao) {
		this.valorLocacao = valorLocacao;
	}

	public boolean isDevolvido() {
		return devolvido;
	}

	public void setDevolvido(boolean devolvido) {
		this.devolvido = devolvido;
	}

}
