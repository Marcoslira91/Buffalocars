package Pessoas;

public class Cliente extends Pessoa {

	private int id;
	private long cnh;

	public Cliente(String _nome, int _idade, char _sexo, long _cpf, String _end, long _fone, String _email, int _id,
			long _cnh) {
		super(_nome, _idade, _sexo, _cpf, _end, _fone, _email);
		this.id = _id;
		this.cnh = _cnh;
	}
	
	public void cadastraCliente() {
		
	}
	
	public String locar() {
		return null;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public long getCnh() {
		return cnh;
	}

	public void setCnh(long cnh) {
		this.cnh = cnh;
	}
	
	

}
