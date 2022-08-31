package Veiculo;

public class Modelo {

	// Atributos
	private String categoria;
	private int capacidade;
	private double motor;

	// Contrutores
	public Modelo(String _categoria, int _capacidade, double _motor) {
		this.capacidade = _capacidade;
		this.categoria = _categoria;
		this.motor = _motor;
	}

	// Metodos
	public void consultarModelo() {

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

}
