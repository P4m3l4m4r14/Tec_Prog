package SistemaJavaLar;

import java.util.Random;

public class Bug implements Posicao{

	protected Random random = new Random();
	protected int posicaoY;
	protected int posicaoX;
	
	public Bug() {		
		posicao(random.nextInt(17),random.nextInt(17));
	}

	@Override
	public void posicao(int x, int y) {
		posicaoX = x;
		posicaoY = y;
	}
}
