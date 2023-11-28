package controller;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Java implements Posicao{
	
	protected int posicaoX;
	protected int posicaoY;
	protected ImageIcon icone;
	@Override
	public void posicao(int x, int y) {
		posicaoX = x;
		posicaoY = y;
	}	
	public Java() {
		posicao(7,7);
		setIcone(new ImageIcon((new ImageIcon("Java.png")).getImage().getScaledInstance(45, 45, Image.SCALE_SMOOTH)));
	}
	public ImageIcon getIcone() {
		return icone;
	}
	protected void setIcone(ImageIcon icone) {
		this.icone = icone;
	}
	
}
