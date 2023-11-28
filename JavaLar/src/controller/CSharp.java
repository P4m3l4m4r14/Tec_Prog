package controller;

import java.awt.Image;

import javax.swing.ImageIcon;

public final class CSharp extends Planeta {

	public CSharp() {
		posicao(7,12);
		this.nome = "C#";
		this.raio = 5;
		this.tempoRotacao = 4;
		this.vTranslacao = 1;
		this.posicaoMax = 12;
		this.posicaoMin = 2;
		this.icone = new ImageIcon((new ImageIcon("C#.png")).getImage().getScaledInstance(42, 42, Image.SCALE_SMOOTH));

	}

}
