package controller;

import java.awt.Image;

import javax.swing.ImageIcon;

public final class JavaScript extends Planeta {
	
	public JavaScript () {
		posicao(7,9);
		this.nome = "JavaScript";
		this.raio = 2;
		this.tempoRotacao = 10;
		this.vTranslacao = 3;
		this.posicaoMax = 9;
		this.posicaoMin = 5;
		this.icone = new ImageIcon((new ImageIcon("JS.png")).getImage().getScaledInstance(42, 42, Image.SCALE_SMOOTH));

	}
}
