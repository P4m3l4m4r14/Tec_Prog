package SistemaJavaLar;

import java.util.Random;

public class Desenvolvedor implements Posicao{

	protected Random random = new Random();
	protected int posicaoX;
	protected int posicaoY;
	
	public Desenvolvedor() {
		posicao(random.nextInt(17),random.nextInt(17));
	}

	@Override
	public void posicao(int x, int y) {
		posicaoX = x;
		posicaoY = y;
	}
}
