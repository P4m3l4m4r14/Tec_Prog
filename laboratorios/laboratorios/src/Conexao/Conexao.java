package Conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
	
	private String host;
	private String usuario;
	private String senha;
	private String banco;

	public Conexao() {

		this.host = "test_db.mysql.dbaas.com.br"; // localhost
		this.banco = "test_db";
		this.usuario = "test_db";
		this.senha = "TecProg23-2!@";
	}

	public Connection getConexao() {
		String url= this.host;
		try {	
			return DriverManager.getConnection(this.host, usuario, senha);
		} catch (SQLException ex) {
			System.out.println("Conex�o com MYSQL n�o realizada");
			ex.printStackTrace();
			return null;
		}
	}

	
	
}
