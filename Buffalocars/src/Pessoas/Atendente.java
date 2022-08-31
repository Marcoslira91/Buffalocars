package Pessoas;

public class Atendente extends Pessoa {

	// Atributo
	private int id;

	// Contrutore
	public Atendente(String _nome, int _idade, char _sexo, long _cpf, String _end, long _fone, String _email, int _id) {
		super(_nome, _idade, _sexo, _cpf, _end, _fone, _email);
		this.id = _id;
	}

	// Metodos (Função)
	public void cadastraVeiculo() {

	}

	public void atualizarVeiculo() {

	}

	public void atualizarCliente() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String getNome() {
		// TODO Auto-generated method stub
		return super.getNome();
	}

	@Override
	public void setNome(String nome) {
		// TODO Auto-generated method stub
		super.setNome(nome);
	}

	@Override
	public int getIdade() {
		// TODO Auto-generated method stub
		return super.getIdade();
	}

	@Override
	public void setIdade(int idade) {
		// TODO Auto-generated method stub
		super.setIdade(idade);
	}

	@Override
	public char getSexo() {
		// TODO Auto-generated method stub
		return super.getSexo();
	}

	@Override
	public void setSexo(char sexo) {
		// TODO Auto-generated method stub
		super.setSexo(sexo);
	}

	@Override
	public long getCpf() {
		// TODO Auto-generated method stub
		return super.getCpf();
	}

	@Override
	public void setCpf(long cpf) {
		// TODO Auto-generated method stub
		super.setCpf(cpf);
	}

	@Override
	public String getEnd() {
		// TODO Auto-generated method stub
		return super.getEnd();
	}

	@Override
	public void setEnd(String end) {
		// TODO Auto-generated method stub
		super.setEnd(end);
	}

	@Override
	public long getFone() {
		// TODO Auto-generated method stub
		return super.getFone();
	}

	@Override
	public void setFone(long fone) {
		// TODO Auto-generated method stub
		super.setFone(fone);
	}

	@Override
	public String getEmail() {
		// TODO Auto-generated method stub
		return super.getEmail();
	}

	@Override
	public void setEmail(String email) {
		// TODO Auto-generated method stub
		super.setEmail(email);
	}

}
