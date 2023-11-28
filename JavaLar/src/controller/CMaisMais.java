package controller;

import java.awt.Image;

import javax.swing.ImageIcon;

public final class CMaisMais extends Planeta {

	public CMaisMais() {
		posicao(7,13);
		this.nome = "C++";
		this.raio = 6;
		this.tempoRotacao = 0.5;
		this.vTranslacao = 2;
		this.posicaoMax = 13;
		this.posicaoMin = 1;
		this.icone = new ImageIcon((new ImageIcon("C++.png")).getImage().getScaledInstance(42, 42, Image.SCALE_SMOOTH));
	}
}
