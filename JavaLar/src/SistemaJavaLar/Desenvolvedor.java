package SistemaJavaLar;

import java.util.Random;

public class Desenvolvedor{

	protected Random random = new Random();
	protected int posicaoX;
	protected int posicaoY;
	
	public Desenvolvedor() {
		posicaoX = random.nextInt(17);
		posicaoY = random.nextInt(17);
	}
}
