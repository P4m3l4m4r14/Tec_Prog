package lab2;

public class Cliente {
	private String nome;
	private int numeroDeItendificacao;

	public Cliente(String nome, int numeroDeItendificacao) {
		super();
		this.nome = nome;
		this.numeroDeItendificacao = numeroDeItendificacao;
	}

	protected String getNome() {
		return nome;
	}

	protected int getNumeroDeItendificacao() {
		return numeroDeItendificacao;
	}
	
}
