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
		return "Marca [descricao=" + descricao + ", getDescricao()=" + getDescricao() + ", getCategoria()="
				+ getCategoria() + ", getCapacidade()=" + getCapacidade() + ", getMotor()=" + getMotor()
				+ ", getPlaca()=" + getPlaca() + ", getCor()=" + getCor() + ", getNumPorta()=" + getNumPorta()
				+ ", getTipoCombu()=" + getTipoCombu() + ", getValorLocacao()=" + getValorLocacao() + ", toString()="
				+ super.toString() + "]";
	}
		public void Printador(Marca auto) {
			System.out.println(toString( ));
		}
}
