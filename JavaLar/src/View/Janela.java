package View;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JFrame;

public class Janela extends JFrame {

	public Janela(){
		PainelDosPlanetas planetas = new PainelDosPlanetas();
		this.setSize(900,700);
		this.setTitle("Sistema JavaLar!");
		this.add(planetas, BorderLayout.CENTER);
		this.add(new PainelDeBotoes(planetas),BorderLayout.EAST);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		setLocationRelativeTo(null);
		setBackground(Color.pink);
		setVisible(true);
	}
	
	
}
