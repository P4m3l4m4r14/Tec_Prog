package SistemaJavaLar;

public abstract class Planeta implements Posicao{

	protected String nome;
	protected int raio;
	protected int vTranslacao;
	protected double tempoRotacao;
	protected int dias;
	protected int totalDias=0;
	protected int anos;
	protected int totalAnos=0;
	protected int posicaoY;
	protected int posicaoX;
	protected int posicaoMax ;
	protected int posicaoMin;
	protected String resumo;

	public void posicao(int x, int y) {
		posicaoX = x;
		posicaoY = y;
	}
	
	public void deslocarPlaneta(int tempo) {
		int deslocamento = vTranslacao*tempo;
		
		for(int i=0 ; i< deslocamento ; i++) {
			
			if(posicaoY==posicaoMax && posicaoX!=posicaoMin) {
				posicaoX--;
			}else if(posicaoX==posicaoMin && posicaoY!=posicaoMin) {
				posicaoY--;
			}else if(posicaoY==posicaoMin && posicaoX!=posicaoMax) {
				posicaoX++;
			}else if(posicaoX==posicaoMax && posicaoY!=posicaoMax) {
				posicaoY++;
			}else {
				System.out.println("erro \n");
			}
		}
	}
	
	public boolean verificarExistencia() {
		if(vTranslacao <= 0) {
			System.out.println("\nO planeta "+nome+" nao existe mais");
			return false;
		}
		else return true;
	}
	
	public void calcularDiasEAnos(double tempo) {
		dias = (int) Math.round(tempo*tempoRotacao); 
		anos = (int) Math.round((vTranslacao*tempo)/(8*raio));
	}
	
}
