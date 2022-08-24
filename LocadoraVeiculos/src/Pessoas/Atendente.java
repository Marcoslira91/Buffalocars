package Pessoas;

public class Atendente extends Pessoa{
	
	private int id;
	
	public Atendente(String _nome, int _idade, char _sexo, long _cpf, String _end, long _fone, String _email, int _id) {
		super(_nome, _idade, _sexo, _cpf, _end, _fone, _email);
		this.id = _id;
	}
	
	public void atualizarCadastro() {
		
	}
	
	public void atualizarVeiculo() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	

}
