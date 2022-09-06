package Veiculo;

public class Marca {

	// Atributos
	private String nome;
	private String descricao;

	// Contrutores
	public Marca(String _nome, String _descricao) {
		this.nome = _nome;
		this.descricao = _descricao;
	}

	public Marca() {

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
