package controller;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Python extends Planeta{

	public Python() {
		posicao(7,8);
		this.nome = "Python";
		this.raio = 1;
		this.tempoRotacao = 24;
		this.vTranslacao = 4;
		this.posicaoMax = 8;
		this.posicaoMin = 6;
		this.icone = new ImageIcon((new ImageIcon("Python.png")).getImage().getScaledInstance(42, 42, Image.SCALE_SMOOTH));

	}

}
