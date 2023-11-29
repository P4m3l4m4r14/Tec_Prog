package controller;

import java.util.Scanner;

import Model.ConectarBanco;
import Model.LerArquivo;
import Model.SistemaDAO;

import java.util.ArrayList;

public class Sistema {
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
	public Java Java = new Java();
	public Python Python = new Python();
	public JavaScript JS = new JavaScript();
	public RubyOnRails Ruby = new RubyOnRails();
	public PHP PHP = new PHP();
	public CSharp CS = new CSharp();
	public CMaisMais CM = new CMaisMais();
	public C C = new C();
	protected Computador c;
	private ArrayList <String[]> linha = new ArrayList<String[]>();
	private String[] aux ;
	private String arquivo;
	private int NLinhas;
	private int op;
	protected int[] QuantBug = new int[4];
	protected int[] QuantDev = new int [4];

	public int[] getQuantBug() {
		return QuantBug;
	}

	public void setQuantBug(int[] quantBug) {
		QuantBug = quantBug;
	}

	public int[] getQuantDev() {
		return QuantDev;
	}

	public void setQuantDev(int[] quantDev) {
		QuantDev = quantDev;
	}

	public int getOp() {
		return op;
	}

	public void setOp(int op) {
		this.op = op;
	}

	public int getNLinhas() {
		return NLinhas;
	}

	public void setNLinhas(int nLinhas) {
		NLinhas = nLinhas;
	}

	public Sistema() {
		op = 1;
		addPlanetas();
	}
	
	public void rodarSistema() {
		Nbugs = Integer.parseInt(aux[8]);
		NDesenvolvedores = Integer.parseInt(aux[9]);
		Nrodadas++;
		addBug(Nbugs);
		addDesenvolvedor(NDesenvolvedores);
		deslocarPlanetas(aux);
		colidirBug();
		colidirDesenvolvedor();
		verificarPlanetas();
		
		imprimirDadosPlaneta();
		c = new Computador();
	}
	
	public boolean trocarLinha() {
		
		if(op < NLinhas) {
			aux = linha.get(op);
			op++;
			return false;
		}else {
			op = 1;
			System.out.println("Arquivo acabou");
			return true;
		}
	}
	
	public void trocarArquivo() {
		System.out.println(arquivo);
		LerArquivo ler = new LerArquivo();
		ler.ler( "Arq/"+arquivo, this);		
		
	}
	
	public String getArquivo() {
		
		return arquivo;
	}

	public void setArquivo(String arquivo) {
		
		this.arquivo = arquivo;
	}

	private void addPlanetas() {
		planetas.add(Python);
		planetas.add(JS);
		planetas.add(Ruby);
		planetas.add(PHP);
		planetas.add(CS);
		planetas.add(CM);
		planetas.add(C);
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
	
	private void deslocarPlanetas(String[] aux) {
		
		for(int i = 1 ; i < aux.length-2 ; i++) {
			int op = Integer.parseInt(aux[i]);
			for(Planeta planeta : planetas) {
				if(planeta.verificarExistencia()) {
					planeta.deslocarPlaneta(op);
					planeta.calcularDiasEAnos(op);
					planeta.totalAnos+=planeta.anos;
					planeta.totalDias+=planeta.dias;
				}
			}
		}
	}
		
	private void verificarPlanetas() {
		for (int i=0; i<planetas.size() ; i++) {
			if(planetas.get(i).verificarExistencia()==false) {
			planetasMortos.add(planetas.get(i));
		//	planetas.remove(planetas.get(i));
			}
		}
	}
	private void imprimirDadosPlaneta() {
		System.out.println("Posicao dos Planetas:\n");
		
		for(Planeta planeta : planetas) {
			
				System.out.println("\nO planeta "+ planeta.nome + 
				" esta na posicao\n x = " + planeta.posicaoX + " y = " + planeta.posicaoY);
				
				System.out.println("Dias: " + planeta.dias);
				System.out.println("Anos: " + planeta.anos);
				System.out.println("Velocidade de Translacao: " + planeta.vTranslacao);
				
			}
		if(planetasMortos != null) {
			for(Planeta p : planetasMortos) {
				System.out.println("\n" +p.nome+" - MORREU");
			}
		}
	}
	/*private void imprimirBugsEDesenv() {
		System.out.println("Posicao dos "+ (totalBugs-bugsColididos) +" Bugs\n");
		for(Bug bug : bugs) {
			System.out.println("x = " + bug.posicaoX + " y = " + bug.posicaoY);
		}
		System.out.println("Posicao dos "+ (totalDesenvolvedores-desenvolvedoresColididos)+" Desenvolvedores:\n");
		for(Desenvolvedor desenv: desenvolvedores) {
			System.out.println("x = " + desenv.posicaoX + " y = " + desenv.posicaoY);
		}
	}*/
	
	private void colidirBug() {
		for(Planeta planeta : planetas) {
				for(int i = 0; i < bugs.size() ; i++) {
					if ( bugs.get(i).posicaoY == planeta.posicaoY && bugs.get(i).posicaoX == planeta.posicaoX) {
						if(planeta.verificarExistencia()) {
						planeta.vTranslacao--;
						planeta.NBug++;
						this.bugsColididos++;
						bugs.remove(bugs.get(i));
						Nbugs--;
						}
					}
				}
		}
	}
	
	private void colidirDesenvolvedor() {
		for(Planeta planeta : planetas) {
			if(planeta.verificarExistencia()) {
				for(int i = 0; i < desenvolvedores.size() ; i++){
					if ( desenvolvedores.get(i).posicaoY == planeta.posicaoY && desenvolvedores.get(i).posicaoX == planeta.posicaoX) {
						planeta.vTranslacao++;
						planeta.NDev++;
						desenvolvedoresColididos++;
						desenvolvedores.remove(desenvolvedores.get(i));
						NDesenvolvedores--;
					}
				}
			}
		}
	}
	public void bugsEDevsPorQuadrante() {
		c.bugsPorQuadrante(bugs, this);
		c.devsPorQuadrante(desenvolvedores, this);
	}
	
	public ArrayList<Planeta> getPlanetasMortos() {
		return planetasMortos;
	}

	public void setPlanetasMortos(ArrayList<Planeta> planetasMortos) {
		this.planetasMortos = planetasMortos;
	}
	public void Conexao() {
		SistemaDAO sistema = new SistemaDAO();
		bugsEDevsPorQuadrante();
		sistema.inserir(this);
	}

	/*private void Relatorio() {
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
	}*/

	public String[] getAux() {
		return aux;
	}

	public void setAux(String[] aux) {
		this.aux = aux;
		linha.add(aux);
	}

	public ArrayList<Planeta> getPlanetas() {
		return planetas;
	}
	public ArrayList<Bug> getBugs(){
		return bugs;
	}
	public ArrayList<Desenvolvedor> getDev(){
		return desenvolvedores;
	}
}