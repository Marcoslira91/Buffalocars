package Veiculo;

public class Automovel {

	private String placa;
	private String cor;
	private int numPorta;
	private String tipoCombu;
	private double valorLocacao;

	public Automovel(String _placa, String _cor, int _numPorta, String _tipoCombu, double _valorLocacao) {
		this.placa = _placa;
		this.cor = _cor;
		this.numPorta = _numPorta;
		this.tipoCombu = _tipoCombu;
		this.valorLocacao = _valorLocacao;
	}

	public void conAutomovel() {
		
	}

	public void  cadastrarAuto() {

	}

	public void editarAuto() {
	 
	}

	public void removerAuto() {
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getNumPorta() {
		return numPorta;
	}

	public void setNumPorta(int numPorta) {
		this.numPorta = numPorta;
	
	}

	public String getTipoCombu() {
		return tipoCombu;
	}

	public void setTipoCombu(String tipoCombu) {
		this.tipoCombu = tipoCombu;
	}

	public double getValorLocacao() {
		return valorLocacao;
	}

	public void setValorLocacao(double valorLocacao) {
		this.valorLocacao = valorLocacao;
	}
	
	

}
