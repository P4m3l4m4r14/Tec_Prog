package controller;

import javax.swing.ImageIcon;

public abstract class Planeta implements Posicao{

	protected String nome;
	protected int raio;
	protected int vTranslacao;
	protected double tempoRotacao;
	protected int dias;
	protected int totalDias=0;
	protected int anos;
	protected int totalAnos=0;
	protected int posicaoY;
	protected int posicaoX;
	protected int posicaoMax ;
	protected int posicaoMin;
	protected String resumo;
	protected ImageIcon icone;
	protected int NBug = 0;
	public int getTotalAnos() {
		return totalAnos;
	}

	public void setTotalAnos(int totalAnos) {
		this.totalAnos = totalAnos;
	}

	public int getvTranslacao() {
		return vTranslacao;
	}

	public void setvTranslacao(int vTranslacao) {
		this.vTranslacao = vTranslacao;
	}

	public int getTotalDias() {
		return totalDias;
	}

	public void setTotalDias(int totalDias) {
		this.totalDias = totalDias;
	}

	public int getNBug() {
		return NBug;
	}

	public void setNBug(int nBug) {
		NBug = nBug;
	}

	public int getNDev() {
		return NDev;
	}

	public void setNDev(int nDev) {
		NDev = nDev;
	}

	protected int NDev = 0;

	public ImageIcon getIcone() {
		return icone;
	}

	protected void setIcone(ImageIcon icone) {
		this.icone = icone;
	}
	

	public int getPosicaoY() {
		return posicaoY;
	}

	protected void setPosicaoY(int posicaoY) {
		this.posicaoY = posicaoY;
	}

	public int getPosicaoX() {
		return posicaoX;
	}

	protected void setPosicaoX(int posicaoX) {
		this.posicaoX = posicaoX;
	}

	public void posicao(int x, int y) {
		posicaoX = x;
		posicaoY = y;
	}
	
	public void deslocarPlaneta(int tempo) {
		int deslocamento = vTranslacao*tempo;
		
		for(int i=0 ; i< deslocamento ; i++) {
			
			if(posicaoY==posicaoMax && posicaoX!=posicaoMin) {
				posicaoX--;
			}else if(posicaoX==posicaoMin && posicaoY!=posicaoMin) {
				posicaoY--;
			}else if(posicaoY==posicaoMin && posicaoX!=posicaoMax) {
				posicaoX++;
			}else if(posicaoX==posicaoMax && posicaoY!=posicaoMax) {
				posicaoY++;
			}else {
				System.out.println("erro \n");
			}
		}
	}
	
	public boolean verificarExistencia() {
		if(vTranslacao <= 0) {
			System.out.println("\nO planeta "+nome+" nao existe mais");
			return false;
		}
		else return true;
	}
	
	public void calcularDiasEAnos(double tempo) {
		if(verificarExistencia()) {
		dias = (int) Math.round(tempo*tempoRotacao); 
		anos = (int) Math.round((vTranslacao*tempo)/(8*raio));
		}
	}
	
}
