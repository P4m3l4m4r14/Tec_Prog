package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import controller.Aluno;

public class LerDadosBanco {
	private ArrayList<String[]> dados = new ArrayList<String[]>();
	private ArrayList<Aluno> alunos = new ArrayList<Aluno>();
	
	
	public LerDadosBanco(ArrayList<String[]> dados, ArrayList<Aluno> alunos) {
		this.dados = dados;
		this.alunos = alunos;
	}

	public ArrayList<String[]> LerDados() {
		Connection conexao = new ConectarBanco().getConectarBanco();
		
		try {
			PreparedStatement selecionar = conexao.prepareStatement("select * from javalar");
			ResultSet rs = selecionar.executeQuery();	
			
			while(rs.next()) {
				String[] dados = new String[46];
				
				dados[0] = rs.getString("nome");
				
				dados[1] = rs.getString("matricula");
				
				Aluno a = consultar(dados[0], dados[1]);
				
				dados[2] = rs.getString("nome_arquivo");
				
				for(int i = 3 ; i < 46 ; i++) {
					dados[i] = String.valueOf(rs.getObject(i+1));
				}
				System.out.println(dados);
				this.dados.add(dados);
			}
		
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return dados;
	}
	
	public Aluno consultar(String nome,String matricula) {
		for(Aluno a : alunos) {
			if(matricula == a.getMatricula()) {
				int op = a.getNAnalises();
				a.setNAnalises(op++);
				return a;
			}
		}
		Aluno a = new Aluno(nome,matricula);
		int op = a.getNAnalises();
		a.setNAnalises(op++);
		alunos.add(a);
		return a;
		
	}
}
