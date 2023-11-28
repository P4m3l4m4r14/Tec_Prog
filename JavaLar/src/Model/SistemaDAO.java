package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import controller.Planeta;
import controller.Sistema;

public class SistemaDAO {
	public void inserir(Sistema s) {
		try {
			Connection conexao = new ConectarBanco().getConectarBanco();

			PreparedStatement inserir = conexao.prepareStatement("insert into javalar "
					+ "(nome, matricula, nome_arquivo, bug_python, bug_javascript, bug_ruby, bug_php, bug_csharp, "
					+ "bug_cmais, bug_c, dev_python, dev_javascript, dev_ruby, dev_php, dev_csharp,"
					+ "dev_cmais, dev_c, v_python, v_javascript, v_ruby, v_php, v_csharp, v_cmais, v_c, "
					+ "d_python, d_javascript, d_ruby, d_php, d_csharp, d_cmais, d_c, "
					+ "a_python, a_javascript, a_ruby, a_php, a_csharp, a_cmais, a_c, "
					+ "bug_q1, bug_q2, bug_q3, bug_q4, dev_q1, dev_q2, dev_q3, dev_q4) "
					+ "values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
			inserir.setString(1,"Pâmela Maria");
			inserir.setString(2, "554557");
			inserir.setString(3, s.getArquivo());
			int op = 4;
			for( Planeta p : s.getPlanetas()) {
				System.out.println(p.getNBug());
				inserir.setInt(op , p.getNBug());
				op++;
			}
			for(Planeta p : s.getPlanetas()) {
				System.out.println(p.getNDev());
				inserir.setInt(op, p.getNDev());
				op++;
			}
			for(Planeta p : s.getPlanetas()) {
				System.out.println(p.getvTranslacao());
				inserir.setInt(op, p.getvTranslacao());
				op++;
			}
			for(Planeta p : s.getPlanetas()) {
				System.out.println(p.getTotalDias());
				inserir.setInt(op, p.getTotalDias());
				op++;
			}
			for(Planeta p : s.getPlanetas()) {
				System.out.println(p.getTotalAnos());
				inserir.setInt(op, p.getTotalAnos());
				op++;
			}
			for(int i = 0 ; i <= 3 ; i++) {
				System.out.println(s.getQuantBug()[i]);
				inserir.setInt(op, s.getQuantBug()[i]);
				op++;
			}
			for( int i = 0 ; i <= 3 ; i++) {
				System.out.println(s.getQuantDev()[i]);
				inserir.setInt(op, s.getQuantDev()[i]);
				op++;
			}
			
			inserir.executeUpdate();

			conexao.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
