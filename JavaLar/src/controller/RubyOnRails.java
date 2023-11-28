package controller;

import java.awt.Image;

import javax.swing.ImageIcon;

public final class RubyOnRails extends Planeta{

	public RubyOnRails() {
		posicao(7,10);
		this.nome = "RubyOnRails";
		this.raio = 3;
		this.tempoRotacao = 48;
		this.vTranslacao = 2;
		this.posicaoMax = 10;
		this.posicaoMin = 4;
		this.icone = new ImageIcon((new ImageIcon("Ruby.png")).getImage().getScaledInstance(42, 42, Image.SCALE_SMOOTH));

	}
}
