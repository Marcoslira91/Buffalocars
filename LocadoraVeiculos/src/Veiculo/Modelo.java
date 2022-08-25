package Veiculo;

public class Modelo extends Automovel {

	private String categoria;
	private int capacidade;
	private double motor;
	
	
	
	public Modelo(String _placa, String _cor, int _numPorta, String _tipoCombu, double _valorLocacao,String categoria,int capacidade,double motor) {
		super(_placa, _cor, _numPorta, _tipoCombu, _valorLocacao);
		this.capacidade=capacidade;
		this.categoria=categoria;
		this.motor=motor;
	}

		public void conModelo() {
			
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
