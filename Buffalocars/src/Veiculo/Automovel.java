package Veiculo;

public class Automovel extends Marca {

	// Atributos
	private String placa;
	private String cor;
	private int numPorta;
	private String tipoCombu;
	private double valorLocacao;
	private Marca marcaAutomovel;
	private String categoria;

	@Override
	public String toString() {
		return "Placa do automovel:  " + placa + "\nCor: " + cor + "\nQuantidade de portas: " + numPorta
				+ "\nTipo do combustivel: " + tipoCombu + "\nValor locacao: " + valorLocacao + "\nModelo: " + categoria
				+ "\nCapacidade: " + capacidade + "\nMotor: " + motor + "\nTipo do automovel: " + tipoAutomovel;
	}

	private int capacidade;
	private double motor;

	// private Modelo modeloAutomovel;
	private String tipoAutomovel;

	// Contrutores
	public Automovel(String _placa, String _cor, int _numPorta, String _tipoCombu, double _valorLocacao,
			String _tipoAutomovel, int capacidade, double motor, String categoria) {
		this.placa = _placa;
		this.cor = _cor;
		this.numPorta = _numPorta;
		this.tipoCombu = _tipoCombu;
		this.valorLocacao = _valorLocacao;
		// this.marcaAutomovel = _marcaAutomovel;
		// this.modeloAutomovel = _modeloAutomovel;
		this.tipoAutomovel = _tipoAutomovel;
		this.capacidade = capacidade;
		this.categoria = categoria;
		this.motor = motor;
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

	/*
	 * public Marca getMarcaAutomovel() { return marcaAutomovel; }
	 * 
	 * public void setMarcaAutomovel(Marca marcaAutomovel) { this.marcaAutomovel =
	 * marcaAutomovel; } public Modelo getModeloAutomovel() { return
	 * getModeloAutomovel(); }
	 * 
	 * public void setModeloAutomovel(Modelo modeloAutomovel) { this.modeloAutomovel
	 * = modeloAutomovel; }
	 */
	public String getTipoAutomovel() {
		return tipoAutomovel;
	}

	public void setTipoAutomovel(String tipoAutomovel) {
		this.tipoAutomovel = tipoAutomovel;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public int getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}

	public double getMotor() {
		return motor;
	}

	public void setMotor(double motor) {
		this.motor = motor;
	}

	public Marca getMarcaAutomovel() {
		return marcaAutomovel;
	}

	public void setMarcaAutomovel(Marca marcaAutomovel) {
		this.marcaAutomovel = marcaAutomovel;
	}

}
