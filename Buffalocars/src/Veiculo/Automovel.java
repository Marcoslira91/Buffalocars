package Veiculo;

public class Automovel {

	// Atributos
	private String placa;
	private String cor;
	private int numPorta;
	private String tipoCombu;
	private double valorLocacao;
	private Marca marcaAutomovel;
	private Modelo modeloAutomovel;
	private String tipoAutomovel;

	// Contrutores
	public Automovel(String _placa, String _cor, int _numPorta, String _tipoCombu, double _valorLocacao,
			Marca _marcaAutomovel, Modelo _modeloAutomovel, String _tipoAutomovel) {
		this.placa = _placa;
		this.cor = _cor;
		this.numPorta = _numPorta;
		this.tipoCombu = _tipoCombu;
		this.valorLocacao = _valorLocacao;
		this.marcaAutomovel = _marcaAutomovel;
		this.modeloAutomovel = _modeloAutomovel;
		this.tipoAutomovel = _tipoAutomovel;
	}

	// Metodos Abstratos
	public void consultarAutomovel() {

	}

	public void cadastrarAuto() {

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

	public Marca getMarcaAutomovel() {
		return marcaAutomovel;
	}

	public void setMarcaAutomovel(Marca marcaAutomovel) {
		this.marcaAutomovel = marcaAutomovel;
	}

	public Modelo getModeloAutomovel() {
		return modeloAutomovel;
	}

	public void setModeloAutomovel(Modelo modeloAutomovel) {
		this.modeloAutomovel = modeloAutomovel;
	}

	public String getTipoAutomovel() {
		return tipoAutomovel;
	}

	public void setTipoAutomovel(String tipoAutomovel) {
		this.tipoAutomovel = tipoAutomovel;
	}

}
