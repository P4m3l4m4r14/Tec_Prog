package Model;

import java.io.FileWriter;

public class Gravar {
	public void gravarDados(String file, String mensagem) {
		try {
			FileWriter arquivo = new FileWriter(file, true);
			arquivo.write(mensagem);
			arquivo.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
