package Pessoas;

public abstract class Pessoa {

	// Atributos
	private String nome;
	private int idade;
	private String sexo;
	private long cpf;
	private String end;// criar classe
	private long fone;
	private String email;

	// Contrutore
	public Pessoa(String _nome, int _idade, String _sexo, long _cpf, String _end, long _fone, String _email) {
		this.nome = _nome;
		this.idade = _idade;
		this.sexo = _sexo;
		this.cpf = _cpf;
		this.end = _end;
		this.fone = _fone;
		this.email = _email;
	}
	public Pessoa() {
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public long getCpf() {
		return cpf;
	}

	public void setCpf(long cpf) {
		this.cpf = cpf;
	}

	public String getEnd() {
		return end;
	}

	public void setEnd(String end) {
		this.end = end;
	}

	public long getFone() {
		return fone;
	}

	public void setFone(long fone) {
		this.fone = fone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
