package SistemaJavaLar;

import java.util.Scanner;
import java.util.ArrayList;

public class Sistema {
	private int tempo;
	private int Nbugs;
	private int totalBugs;
	private int NDesenvolvedores;
	private int totalDesenvolvedores;
	private int bugsColididos = 0;
	private int desenvolvedoresColididos = 0;
	private int Nrodadas = 0;
	protected ArrayList <Bug> bugs = new ArrayList <Bug>();
	protected ArrayList <Desenvolvedor> desenvolvedores = new ArrayList <Desenvolvedor>();
	protected ArrayList <Planeta> planetas = new ArrayList<Planeta>();
	private ArrayList <Planeta> planetasMortos = new ArrayList <Planeta>();
	protected Computador c;
	
	public Sistema() {
		addPlanetas();
		int op;
		do {
			Nrodadas++;
			menu(Nrodadas);
			addBug(Nbugs);
			addDesenvolvedor(NDesenvolvedores);
			imprimirBugsEDesenv();
			deslocarPlanetas(tempo,planetas);
			colidirBug();
			colidirDesenvolvedor();
			verificarPlanetas();
			
			imprimirDadosPlaneta(tempo);
			c = new Computador(planetas);
			
			op = reiniciarSistema();
		}while(op!=2);
		Relatorio();
	}
	
	private void addPlanetas() {
		planetas.add(new Python());
		planetas.add(new JavaScript());
		planetas.add(new RubyOnRails());
		planetas.add(new PHP());
		planetas.add(new CSharp());
		planetas.add(new CMaisMais());
		planetas.add(new C());
	}
	
	private void addBug (int Nbugs) {
		totalBugs+=Nbugs;
		for(int i = 0; i < Nbugs ; i++) {
			Bug bug = new Bug();
			bugs.add(bug);
		}
	}
	private void addDesenvolvedor (int Ndesenvolvedores) {
		totalDesenvolvedores+=Ndesenvolvedores;
		for ( int i = 0 ; i < Ndesenvolvedores ; i++) {
			Desenvolvedor d = new Desenvolvedor();
			desenvolvedores.add(d);
		}
	}
	
	private void deslocarPlanetas(int tempo, ArrayList<Planeta> planetas) {
		for (Planeta planeta: planetas) {
			planeta.deslocarPlaneta(tempo);
			planeta.calcularDiasEAnos(tempo);
			planeta.totalAnos+=planeta.anos;
			planeta.totalDias+=planeta.dias;
		}
	}
	
	private void verificarPlanetas() {
		for (int i=0; i<planetas.size() ; i++) {
			if(planetas.get(i).verificarExistencia()==false) {
			planetasMortos.add(planetas.get(i));
			planetas.remove(planetas.get(i));
			}
		}
	}
	private void imprimirDadosPlaneta(int tempo) {
		System.out.println("Posicao dos Planetas:\n");
		
		for(Planeta planeta : planetas) {
			
				System.out.println("\nO planeta "+ planeta.nome + 
				" esta na posicao\n x = " + planeta.posicaoX + " y = " + planeta.posicaoY);
				
				System.out.println("Dias: " + planeta.dias);
				System.out.println("Anos: " + planeta.anos);
				System.out.println("Velocidade de Translacao: " + planeta.vTranslacao);
			}
	}
	private void imprimirBugsEDesenv() {
		System.out.println("Posicao dos "+ (totalBugs-bugsColididos) +" Bugs\n");
		for(Bug bug : bugs) {
			System.out.println("x = " + bug.posicaoX + " y = " + bug.posicaoY);
		}
		System.out.println("Posicao dos "+ (totalDesenvolvedores-desenvolvedoresColididos)+" Desenvolvedores:\n");
		for(Desenvolvedor desenv: desenvolvedores) {
			System.out.println("x = " + desenv.posicaoX + " y = " + desenv.posicaoY);
		}
	}
	
	private void colidirBug() {
		for(Planeta planeta : planetas) {
		for(int i = 0; i < bugs.size() ; i++) {
			if ( bugs.get(i).posicaoY == planeta.posicaoY && bugs.get(i).posicaoX == planeta.posicaoX) {
				planeta.vTranslacao--;
				this.bugsColididos++;
				bugs.remove(bugs.get(i));
				Nbugs--;
			}
		}
		}
	}
	
	private void colidirDesenvolvedor() {
		for(Planeta planeta : planetas) {
			for(int i = 0; i < desenvolvedores.size() ; i++){
			if ( desenvolvedores.get(i).posicaoY == planeta.posicaoY && desenvolvedores.get(i).posicaoX == planeta.posicaoX) {
				planeta.vTranslacao++;
				desenvolvedoresColididos++;
				desenvolvedores.remove(desenvolvedores.get(i));
				NDesenvolvedores--;
			}
		}
		}
	}
	
	private void menu(int i) {
		
		System.out.println("Rodada " + i + "\n\n");
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o tempo: ");
		tempo= input.nextInt();
		
		System.out.println("Digite o numero de bugs: ");
		Nbugs = input.nextInt();
		
		System.out.println("Digite o numero de desenvolvedores: ");
		NDesenvolvedores = input.nextInt();		
	}
	
	private int reiniciarSistema() {
		System.out.println("Selecione as opcoes: \n 1 -  Retornar ao Menu \n 2 - Finalizar jogo");
		Scanner input = new Scanner(System.in);
		int resposta = input.nextInt();
		return resposta;
	}
	
	private void Relatorio() {
		System.out.println(" RELATORIO:\n\n");
		System.out.println("Bugs colididos: "+bugsColididos);
		System.out.println("\nDesenvolvedores colididos: "+desenvolvedoresColididos);
		System.out.println("\n\n - Planetas -");
		for(Planeta planeta:planetas) {
			System.out.println("\nNome: "+planeta.nome);
			System.out.println("Velocidade de Rotacao: "+(6.28/planeta.tempoRotacao));
			System.out.println("Velocidade de Translacao: "+planeta.vTranslacao );
			System.out.println("Dias durante o jogo: "+ planeta.totalDias);
			System.out.println("Anos durante o jogo: "+ planeta.totalAnos);
		}
		if(planetasMortos != null) {
		for(Planeta p : planetasMortos) {
			System.out.println("\n" +p.nome+" - MORREU");
		}
		}
		System.out.println("\n\n Foram "+Nrodadas+ " rodadas\n");
		
		System.out.println("\n -- Resumo --\n");
		for(Planeta p: planetas) {
			System.out.println(p.resumo+"\n");
		}
	}
	
}