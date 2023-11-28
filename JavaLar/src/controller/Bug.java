package controller;

import java.awt.Image;
import java.util.Random;

import javax.swing.ImageIcon;

public class Bug implements Posicao{

	protected Random random = new Random();
	protected int posicaoY;
	protected int posicaoX;
	protected ImageIcon icone;
	
	public Bug() {
		int x;
		int y;
		do {
			x = random.nextInt(15);
			y = random.nextInt(15);
		}while(x == 7 && y == 7);
		posicao(x,y);
		icone = new ImageIcon((new ImageIcon("BUG.png")).getImage().getScaledInstance(42, 42, Image.SCALE_SMOOTH));

	}

	@Override
	public void posicao(int x, int y) {
		posicaoX = x;
		posicaoY = y;
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

	public ImageIcon getIcone() {
		return icone;
	}

	protected void setIcone(ImageIcon icone) {
		this.icone = icone;
	}

	protected void setPosicaoX(int posicaoX) {
		this.posicaoX = posicaoX;
	}
	
	
}
