package View;

import java.awt.GridLayout;
import java.awt.Image;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import controller.Bug;
import controller.Desenvolvedor;
import controller.Planeta;
import controller.Sistema;

public class PainelDosPlanetas extends JPanel {

	private MyLabel[][] grade = new MyLabel[15][15];
	protected Sistema S = new Sistema();
	
	public PainelDosPlanetas() {
		bigBangJava();
		setVisible(true);
		System.out.println("Planetas");
	}
	
	private void bigBangJava() {
		setLayout(new GridLayout(15,15));

		for(int y = 14; y >= 0 ; y--) {
			for(int x = 0; x < 15 ; x++) {
				grade[x][y] = new MyLabel(x,y);
				add(grade[x][y]);
			}
		}
		
		grade[7][7].setIcon(S.Java.getIcone());
		grade[7][8].setIcon(S.Python.getIcone());
		grade[7][9].setIcon(S.JS.getIcone());
		grade[7][10].setIcon(S.Ruby.getIcone());
		grade[7][11].setIcon(S.PHP.getIcone());
		grade[7][12].setIcon(S.CS.getIcone());
		grade[7][13].setIcon(S.CM.getIcone());
		grade[7][14].setIcon(S.C.getIcone());
	}
	
	public void rodarNovoSist() {
		if(S.trocarLinha()) {
			JOptionPane.showMessageDialog(null, "Fim do arquivo", "Aviso!", JOptionPane.WARNING_MESSAGE, null);
		}else {
		removerPlanetas(S.getPlanetas());
		removerBugs(S.getBugs());
		removerDevs(S.getDev());
		
		S.rodarSistema();
		addBugAGrade(S.getBugs());
		addDevAGrade(S.getDev());
		addPlanetas(S.getPlanetas());
		planetasMortos(S.getPlanetasMortos());
		}
		
		
	}
	
	private void removerPlanetas(ArrayList<Planeta> planetas) {
		for( Planeta planeta : planetas) {
			grade[planeta.getPosicaoX()][planeta.getPosicaoY()].setIcon(null);
		}
	}
	private void planetasMortos(ArrayList<Planeta> planetas ) {
		for( Planeta p: planetas) {
			grade[p.getPosicaoX()][p.getPosicaoY()].setIcon(null);

		}
	}
	private void addPlanetas(ArrayList<Planeta> planetas) {
		for( Planeta planeta : planetas) {
			grade[planeta.getPosicaoX()][planeta.getPosicaoY()].setIcon(planeta.getIcone());
		}
	}
	
	private void addBugAGrade(ArrayList<Bug> bugs) {
		for(Bug b : bugs) {
			grade[b.getPosicaoX()][b.getPosicaoY()].setIcon(b.getIcone());
		}
	}
	private void removerBugs(ArrayList<Bug> bugs) {
		for(Bug b : bugs) {
			grade[b.getPosicaoX()][b.getPosicaoY()].setIcon(null);
		}
	}
	private void addDevAGrade(ArrayList<Desenvolvedor> devs) {
		for(Desenvolvedor d : devs) {
			grade[d.getPosicaoX()][d.getPosicaoY()].setIcon(d.getIcone());
		}
	}
	private void removerDevs(ArrayList<Desenvolvedor> devs) {
		for(Desenvolvedor d : devs) {
			grade[d.getPosicaoX()][d.getPosicaoY()].setIcon(null);
		}
	}	

}
