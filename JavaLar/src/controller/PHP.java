package controller;

import java.awt.Image;

import javax.swing.ImageIcon;

public final class PHP extends Planeta {

	public PHP() {
		posicao(7,11);
		this.nome = "PHP";
		this.raio = 4;
		this.tempoRotacao = 60;
		this.vTranslacao = 2;
		this.posicaoMax = 11;
		this.posicaoMin = 3;
		this.icone = new ImageIcon((new ImageIcon("PHP.png")).getImage().getScaledInstance(42, 42, Image.SCALE_SMOOTH));

	}

}
