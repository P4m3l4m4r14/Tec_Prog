package view;

import java.util.ArrayList;

import com.mysql.jdbc.Connection;

import controller.Aluno;
import model.Conexao;

public class Main {
	public static void main(String[] args) {

		//Connection conexao = (Connection) new Conexao().getConexao();
		
		Aluno aluno= new Aluno();
		ArrayList<Aluno> a= aluno.buscarTodosAlunos();
		
		for (Aluno alunos : a) {
			System.out.println(alunos.getId() + " - "+  alunos.getMatricula() + " - "+alunos.getNome());
		}
		Aluno aluno2 = new Aluno(3, "pedro", 552);
		
		aluno.update(aluno2);

		ArrayList<Aluno> a2= aluno.buscarTodosAlunos();


		for (Aluno alunos : a2) {
			System.out.println(alunos.getId() + " - "+  alunos.getMatricula() + " - "+alunos.getNome());
		}
		
	}
}
