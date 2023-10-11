package SistemaJavaLar;

public class Java implements Posicao{
	
	protected int posicaoX;
	protected int posicaoY;
	@Override
	public void posicao(int x, int y) {
		posicaoX = x;
		posicaoY = y;
	}	
	public Java() {
		posicao(8,8);
	}
}
