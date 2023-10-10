package SistemaJavaLar;

import java.util.Random;

public class Bug{

	protected Random random = new Random();
	protected int posicaoY;
	protected int posicaoX;
	
	
	public Bug() {
		posicaoY = random.nextInt(17);
		posicaoX = random.nextInt(17);
	}
}
