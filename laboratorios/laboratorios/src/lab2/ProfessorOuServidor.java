package lab2;

public class ProfessorOuServidor extends Cliente {
	
	public String tipoDeId;

	public ProfessorOuServidor(String nome, int numeroDeItendificacao) {
		super(nome, numeroDeItendificacao);
		tipoDeId = "SIAPE";
	}

}
