package controller;

public class Aluno {
	protected String nome;
	protected String matricula;
	protected int NAnalises;
	public Aluno(String nome, String matricula) {
		this.nome = nome;
		this.matricula = matricula;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public int getNAnalises() {
		return NAnalises;
	}
	public void setNAnalises(int nAnalises) {
		NAnalises = nAnalises;
	}
	
}
