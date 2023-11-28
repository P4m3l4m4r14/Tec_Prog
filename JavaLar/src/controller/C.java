package controller;

import java.awt.Image;

import javax.swing.ImageIcon;

public final class C extends Planeta {

	public C() {
		posicao(7,14);
		this.nome = "C";
		this.raio = 7;
		this.tempoRotacao = 0.1;
		this.vTranslacao = 10;
		this.posicaoMax = 14;
		this.posicaoMin = 0;
		setIcone( new ImageIcon((new ImageIcon("C.png")).getImage().getScaledInstance(42, 42, Image.SCALE_SMOOTH)));

	}
}
