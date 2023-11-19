package Conexao;

import java.util.ArrayList;


public class Main {
	public static void main(String[] args) {

		//Connection conexao = (Connection) new Conexao().getConexao();
		
		Aluno aluno= new Aluno(4,"Pâmela", 554557);
		//ArrayList<Aluno> a= aluno.buscarTodosAlunos();
		
		//for (Aluno alunos : a) {
		//	System.out.println(alunos.getId() + " - "+  alunos.getMatricula() + " - "+alunos.getNome());
		//}
		//Aluno aluno2 = new Aluno(3, "pedro", 552);
		
		aluno.update(aluno);

		//ArrayList<Aluno> a2= aluno.buscarTodosAlunos();


		/*for (Aluno alunos : aluno) {
			System.out.println(alunos.getId() + " - "+  alunos.getMatricula() + " - "+alunos.getNome());
		}*/
		
	}
}
