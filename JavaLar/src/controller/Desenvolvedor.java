package controller;

import java.awt.Image;
import java.util.Random;

import javax.swing.ImageIcon;

public class Desenvolvedor implements Posicao{

	protected Random random = new Random();
	protected int posicaoX;
	protected int posicaoY;
	protected ImageIcon icone;
	
	public Desenvolvedor() {
		int x;
		int y;
		do {
			x = random.nextInt(15);
			y = random.nextInt(15);
		}while( x == 7 && y == 7);
		
		posicao(x,y);
		setIcone(new ImageIcon((new ImageIcon("Dev.png")).getImage().getScaledInstance(45, 45, Image.SCALE_SMOOTH)));
	}

	public ImageIcon getIcone() {
		return icone;
	}

	protected void setIcone(ImageIcon icone) {
		this.icone = icone;
	}

	@Override
	public void posicao(int x, int y) {
		posicaoX = x;
		posicaoY = y;
	}

	public int getPosicaoX() {
		return posicaoX;
	}

	protected void setPosicaoX(int posicaoX) {
		this.posicaoX = posicaoX;
	}

	public int getPosicaoY() {
		return posicaoY;
	}

	protected void setPosicaoY(int posicaoY) {
		this.posicaoY = posicaoY;
	}
	
}
