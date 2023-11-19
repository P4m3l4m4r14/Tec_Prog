package lab2;

public class Aluno extends Cliente {

	public String tipoDeId;
	public Aluno(String nome, int numeroDeItendificacao) {
		super(nome, numeroDeItendificacao);	
		tipoDeId = "Matricula";
	}
}
