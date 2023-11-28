package controller;

import java.util.ArrayList;

import Model.Gravar;
import Model.LerDadosBanco;

public class ComputadorDados {
	
	private ArrayList<Aluno> alunos = new ArrayList<Aluno>();
	private ArrayList<String[]> dados = new ArrayList<String[]>();
	private String arquivoDeSaida = pergunta1()+ pergunta2()+pergunta3()+pergunta4()+pergunta5()
						+pergunta6()+pergunta7()+pergunta8()+pergunta9()+pergunta10()+pergunta11();
	
	public ComputadorDados() {
		LerDadosBanco leitura = new LerDadosBanco(dados,alunos);
		dados = leitura.LerDados();	
	}

	//Perguntas
	//1
	private String pergunta1() {
		int instantes = 0;
		String nome = new String();
		String matricula = new String();
		for(Aluno a : alunos) {
			if(a.NAnalises > instantes) {
				instantes = a.NAnalises;
				nome = a.nome;
				matricula = a.matricula;
			}
		}
		return matricula +" - "+ nome +", ";
	}
	private String pergunta2() {
		String planeta = new String();
		int[] mortes = new int[7];
		for(String[] d : dados) {
			for( int i = 18 ; i < 25 ; i++ ) {
				if(Integer.parseInt(d[i]) == 0) {
					mortes[i-18]++;
				}
			}
		}
		int op = 0;
		for(int i = 0 ; i < 7 ; i++) {
			if(mortes[i] > op) {
				op = mortes[i];
				switch(i) {
				case 0:
					planeta = "Python";
					break;
				case 1:
					planeta = "JavaScript";
					break;
				case 2:
					planeta = "Ruby";
					break;
				case 3:
					planeta = "PHP";
					break;
				case 4:
					planeta = "C#";
					break;
				case 5:
					planeta = "C++";
					break;
				case 6:
					planeta = "C";
				}
			}
		}
		return planeta + ", ";
	}
	private String pergunta3() {
		String planeta = new String();
		int[] vivos = new int[7];
		for(String[] d : dados) {
			for( int i = 18 ; i < 25 ; i++ ) {
				if(Integer.parseInt(d[i]) != 0) {
					vivos[i-18]++;
				}
			}
		}
		int op = 0;
		for(int i = 0 ; i < 7 ; i++) {
			if(vivos[i] > op) {
				op = vivos[i];
				switch(i) {
				case 0:
					planeta = "Python";
					break;
				case 1:
					planeta = "JavaScript";
					break;
				case 2:
					planeta = "Ruby";
					break;
				case 3:
					planeta = "PHP";
					break;
				case 4:
					planeta = "C#";
					break;
				case 5:
					planeta = "C++";
					break;
				case 6:
					planeta = "C";
				}
			}
		}
		return planeta + ", ";
	}
	private String pergunta4() {
		String quadrante = new String();
		int[] media = new int[4];
		
		for(String[] d : dados) {
			for(int i = 39 ; i < 43 ; i++) {
				media[i-34] = (media[i-34]+ Integer.parseInt(d[i]))/2;
			}
		}
		int op = 0 ;
		for(int i = 0 ; i < 4 ; i++) {
			if(media[i] > op) {
				op = media[i];
				quadrante = String.valueOf(i+1);;
			}
		}
		return quadrante + ", ";
	}
	private String pergunta5() {
		String quadrante = new String();
		int[] media = new int[4];
		
		for(String[] d : dados) {
			for(int i = 43 ; i < 46 ; i++) {
				media[i-38] = (media[i-38]+ Integer.parseInt(d[i]))/2;
			}
		}
		int op = 0 ;
		for(int i = 0 ; i < 4 ; i++) {
			if(media[i] > op) {
				op = media[i];
				quadrante = String.valueOf(i+1);
			}
		}
		return quadrante + ", ";
	}
	private String pergunta6() {
		String instantes = new String();
		int inst = 0;
		for(Aluno a : alunos) {
			inst += a.NAnalises;
		}
		instantes = String.valueOf(inst);
		return instantes + ", ";
	}
	private String pergunta7() {
		String resposta = new String();
		double[] vMedia = new double[7];
		
		for(String[] d : dados) {
			for( int i = 18 ; i < 25 ; i++ ) {
				vMedia[i-18] = (vMedia[i-18] + Integer.parseInt(d[i]))/2;
			}
		}
		resposta = "Python: "+ String.valueOf(vMedia[0]) + " - JavaScript: " + String.valueOf(vMedia[1]) 
					+ " - Ruby on Rails:" + String.valueOf(vMedia[2]) + " - PHP: " + String.valueOf(vMedia[3]) 
					+ " - C#: " + String.valueOf(vMedia[4]) + " - C++: " + String.valueOf(vMedia[5]) + " - C: " 
					+ String.valueOf(vMedia[6]);
	
		return resposta + ", ";
	}
	private String pergunta8() {
		int totalBugs = 0;
		for(String[] d : dados) 
			for(int i = 39 ; i < 43 ; i++) {
				totalBugs +=  Integer.parseInt(d[i]);
		}
		return String.valueOf(totalBugs) + ", ";
	}
	private String pergunta9() {
		int totalDevs = 0;
		for(String[] d : dados) {
			for(int i = 42 ; i < 47 ; i++)
				totalDevs +=  Integer.parseInt(d[i]);
		}
		return String.valueOf(totalDevs) + ", ";
	}
	private  String pergunta10() {
		int totalHoras = 0;
		for(String[] d : dados) {
			for(int i = 25 ; i < 32 ; i++) 
				totalHoras += Integer.parseInt(d[i]);
		}
		return String.valueOf(totalHoras) + ", ";
	}
	private String pergunta11() {
		int totalAnos = 0;
		for(String[] d : dados) {
			for(int i = 32 ; i < 39 ; i++) 
				totalAnos += Integer.parseInt(d[i]);
		}
		return String.valueOf(totalAnos);
	}
	
	public void gravarArquivo() {
		Gravar gravar = new Gravar();
		gravar.gravarDados("dados/ArquivoDeSaida", arquivoDeSaida);
	}
	
	
}
	
