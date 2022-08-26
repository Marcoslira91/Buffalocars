package Veiculo;

public class Marca extends Modelo{
	
		private String descricao;

	public Marca(String _placa, String _cor, int _numPorta, String _tipoCombu, double _valorLocacao, String categoria, int capacidade, double motor, String descricao) {
		super(_placa, _cor, _numPorta, _tipoCombu, _valorLocacao, categoria, capacidade, motor); 
		this.descricao=descricao;
	}
	void Consultarmarc() {
		
	}
	
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	@Override
	public String toString() {
		return "Descricao: " + descricao + "\nCategoria: "
				+ getCategoria() + "\nCapacidade: " + getCapacidade() + "\nMotor: " + getMotor()
				+ "\nPlaca: " + getPlaca() + "\nCor: " + getCor() + "\nNumPorta: " + getNumPorta()+" portas"
				+ "\nTipoCombu: " + getTipoCombu() + "\nValorLocacao: R$ " + getValorLocacao();
	}
	
}
