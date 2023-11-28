package Model;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.Spring;

import View.Janela;
import View.PainelDeBotoes;
import controller.Sistema;

public class LerArquivo {
	
	public void ler(String entrada, Sistema s) {

		FileReader arquivo;
		try {
			arquivo = new FileReader(entrada);
			BufferedReader leitura = new BufferedReader(arquivo);
			int op = 0;
			while (leitura.ready()) {
				op++;
				separarLinha(leitura.readLine(), s);
			}
			s.setNLinhas(op);


		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public void separarLinha(String linha, Sistema s) {
		String[] aux = linha.split(",");
		s.setAux(aux);

	}

}
