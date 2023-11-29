package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;


public class LerDadosBanco {
	private ArrayList<String[]> dados = new ArrayList<String[]>();

	public ArrayList<String[]> LerDados() {
		Connection conexao = new ConectarBanco().getConectarBanco();
		
		try {
			PreparedStatement selecionar = conexao.prepareStatement("select * from javalar");
			ResultSet rs = selecionar.executeQuery();	
			
			while(rs.next()) {
				String[] dados = new String[47];
				
				dados[0] = rs.getString("nome");
				
				dados[1] = rs.getString("matricula");
				
				dados[2] = rs.getString("nome_arquivo");
				
				for(int i = 5 ; i <= 47 ; i++) {
					dados[i-2] = String.valueOf(rs.getInt(i));
				}
				//imprimirLinha(dados);
				this.dados.add(dados);
			}
		
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.dados;
	}

	public void imprimirLinha(String[] linha) {
		for(int i = 0; i < linha.length;i++) {
			System.out.println(linha[i]);
		}
	}
	
}
