package Pessoas;

public class Gerente extends Pessoa {

	// Atributos
	private int id;
	private String nome;
	private int idade;
	private char sexo;
	private long cpf;
	private String end;// criar classe
	private long fone;
	private String email;

	// Contrutore
	public Gerente(int _id, String _nome, int _idade, char _sexo, long _cpf, String _end, long _fone, String _email) {
		this.id = _id;
		this.nome = _nome;
		this.idade = _idade;
		this.sexo = _sexo;
		this.cpf = _cpf;
		this.end = _end;
		this.fone = _fone;
		this.email = _email;
	}

	public void cadastraVeiculo() {

	}

	public void cadastraAtendente() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
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
