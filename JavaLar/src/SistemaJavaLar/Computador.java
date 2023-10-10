package SistemaJavaLar;

import java.util.ArrayList;
import java.lang.Math;

public class Computador {
	private Java java = new Java();
	
	public Computador(ArrayList <Planeta> planetas) {
		System.out.println("Planetas ao Norte de Java: "+planetasAoNorte(planetas));
		System.out.println("Planetas ao Sul de Java: "+planetasAoSul(planetas)+"\n");
		verificarAlinhamento(planetas);
		System.out.println("\nAREA ENTRE OS PLANETAS:\n");
		for(Planeta p: planetas) {
			calcularArea(p, planetas);
		}
		System.out.println("\nDISTANCIA ENTRE OS PLANETAS:\n");
		for (Planeta p: planetas) {
			calcularDistancia(p, planetas);
		}
	}
	
	private int planetasAoNorte(ArrayList <Planeta> planetas ) {
		int i=0;
		for(Planeta planeta : planetas) {
			if( planeta.posicaoY > java.posicaoY)
				i++;
		}
		return i;
	}
	private int planetasAoSul(ArrayList <Planeta> planetas) {
		int i = 0;
		for(Planeta planeta : planetas) {
			if( planeta.posicaoY < java.posicaoY)
				i++;
		}
		return i;
	}
	
	private boolean alinhamentoVerticalNorte(ArrayList <Planeta> planetas) {
		int contador = 0;
		if(planetasAoNorte(planetas) == 8) {
		for(Planeta planeta: planetas) {
			if(planeta.posicaoX == 8)
				contador++;
		}
		if(contador == 8)
			return true;
		else return false;
		}
		else 
			return false;
	}
	private boolean alinhamentoVerticalSul(ArrayList <Planeta> planetas) {
		int contador = 0;
		if(planetasAoSul(planetas) == 8) {
		for(Planeta planeta: planetas) {
			if(planeta.posicaoX == 8)
				contador++;
		}
		if(contador == 8)
			return true;
		else return false;
		}
		else 
			return false;
	}
	private boolean alinhamentoPrimeiroQuadrante(ArrayList <Planeta> planetas) {
		int contador = 0;
		for(Planeta planeta: planetas) {
			if(planeta.posicaoX == planeta.posicaoMax && planeta.posicaoY == planeta.posicaoMax)
				contador++;
		}
		if(contador == 8)
			return true;
		else 
			return false;
		}
	private boolean alinhamentoTerceiroQuadrante(ArrayList <Planeta> planetas) {
		int contador = 0;
		for(Planeta planeta: planetas) {
			if(planeta.posicaoX == planeta.posicaoMin && planeta.posicaoY == planeta.posicaoMin)
				contador++;
		}
			if(contador == 8)
				return true;
		else 
			return false;
	}
	private boolean alinhamentoSegundoQuadrante(ArrayList <Planeta> planetas) {
		int contador = 0;
		for(Planeta planeta: planetas) {
			if(planeta.posicaoX == planeta.posicaoMin && planeta.posicaoY == planeta.posicaoMax)
				contador++;
		}
		if(contador == 8)
			return true;
		else 
			return false;
	}
	private boolean alinhamentoQuartoQuadrante(ArrayList <Planeta> planetas) {
			int contador = 0;
			for(Planeta planeta: planetas) {
				if(planeta.posicaoX == planeta.posicaoMax && planeta.posicaoY == planeta.posicaoMin)
					contador++;
				}
			if(contador == 8)
				return true;
			else
				return false;
	}

	private String verificarAlinhamento(ArrayList <Planeta> planetas) {
		if(alinhamentoVerticalNorte(planetas))
			return "Vertical ao norte de Java";
		else if(alinhamentoVerticalSul(planetas))
			return "Vertical ao sul de Java";
		else if(alinhamentoPrimeiroQuadrante(planetas))
			return "Diagonal no primeiro quadrante";
		else if(alinhamentoSegundoQuadrante(planetas))
			return "Diagonal no segundo quadrante";
		else if(alinhamentoTerceiroQuadrante(planetas))
			return "Diagonal no terceiro quadrante";
		else if(alinhamentoQuartoQuadrante(planetas))
			return "Diagonal no quarto quadrante";
		else 
			return "Os planetas nao estao alinhados";
	}
	private void calcularArea(Planeta p, ArrayList <Planeta> planetas) {
		for(Planeta planeta : planetas ) {
			if(planeta != p) {
				int area;
				area = (planeta.posicaoX - p.posicaoX)*(planeta.posicaoY - p.posicaoY);
				System.out.println("A distancia em area de " + p.nome + " e " + planeta.nome + ": " + Math.abs(area));
			}
		}
	}
	
	private void calcularDistancia(Planeta p, ArrayList <Planeta> planetas ) {
		for(Planeta planeta: planetas) {
			if (planeta !=p) {
			double distancia;
			distancia = Math.sqrt(Math.pow(planeta.posicaoX - p.posicaoX,2)+ Math.pow(planeta.posicaoY - p.posicaoY, 2));
			System.out.println("A distancia de " + p.nome + " para " + planeta.nome + " eh: " + distancia);
			}
		}
	}


}
