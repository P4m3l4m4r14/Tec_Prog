package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import controller.Sistema;

public class ConectarBanco {
	
	private static String host;
	private static String usuario;
	private static String senha;
	private static String banco;
	
	public ConectarBanco() {

		this.host = "da_java.mysql.dbaas.com.br"; 
		this.banco = "da_java";
		this.usuario = "da_java";
		this.senha = "Tecnicas*2023@";
	}
	
	public Connection getConectarBanco() {
		//String url="jdbc:mysql://" + this.host + "/" + this.banco + "?verifyServerCertificate=false&useSSL=true";

		String url="jdbc:mysql://" + this.host +"/"+ this.banco;
		System.out.println(url);
		try {
			return DriverManager.getConnection(url, usuario, senha);
		} catch (SQLException ex) {
			System.out.println("Conex�o com MYSQL n�o realizada");
			ex.printStackTrace();
		}
		return null;
	}
	
}
