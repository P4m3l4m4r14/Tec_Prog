package SistemaDeVendasCachorroQuente;

public class Aluno {
	private String  Aluno;
	private int Matricula;
	private CachorroQuente cachorroQuente[];
	private int numeroDeCompras;
	
	public int getNumeroCompras() {
		return numeroDeCompras;
	}

	public void setNumeroDeCompras(int numeroDeCompras) {
		this.numeroDeCompras += numeroDeCompras;
	}

	public Aluno(String aluno, int matricula) {
		super();
		Aluno = aluno;
		Matricula = matricula;
	}

	public String getAluno() {
		return Aluno;
	}

	public void setAluno(String aluno) {
		Aluno = aluno;
	}

	public int getMatricula() {
		return Matricula;
	}

	public void setMatricula(int matricula) {
		Matricula = matricula;
	}
	
	public void Registro(CachorroQuente cachorroQuente) {
		this.cachorroQuente[numeroDeCompras] = cachorroQuente;
	}
	
}
