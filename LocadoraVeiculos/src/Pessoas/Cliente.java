
public class Cliente extends Pessoa {

	// Atributos
	private int id;
	private long cnh;

	// Contrutore
	public Cliente(String _nome, int _idade, char _sexo, long _cpf, String _end, long _fone, String _email, int _id,
			long _cnh) {
		super(_nome, _idade, _sexo, _cpf, _end, _fone, _email);
		this.id = _id;
		this.cnh = _cnh;

	}

	// Metodos (Função)
	public void cadastraCliente() {

	}

	public void locarVeiculo() {

	}

	// Get & Set
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
