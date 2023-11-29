package View;

import java.awt.Button;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import controller.ComputadorDados;
import controller.Sistema;

public class PainelDeBotoes extends JPanel{
	
	private Cores c = new Cores();
	private JButton B1 = new JButton("Processar Proximo instante");;
	private JButton B2 = new JButton("Ler novo arquivo de entrada");
	private JButton B3 = new JButton("Gravar Relatorio");;
	private JButton B4 = new JButton("Ler dados de outros participantes");
	private JButton B5 = new JButton("Gravar arquivo de saida");
	private int instante = 0;
	private PainelDosPlanetas p = new PainelDosPlanetas();
	private ComputadorDados cd = new ComputadorDados();
	

	public PainelDeBotoes(PainelDosPlanetas p) {
		this.p = p;
		setBackground(c.ROSE);
		AdicionarBotoes();
		setLayout(new GridLayout(5,1));
	}
	
	public void AdicionarBotoes() {
		mudarCor(B1);
		mudarCor(B2);
		mudarCor(B3);
		mudarCor(B4);
		mudarCor(B5);
		
		actionPerfomed();
		
		this.add(B1);
		this.add(B2);
		this.add(B3);
		this.add(B4);
		this.add(B5);
	}
	//implementa a acao de cada um
	public void actionPerfomed() {
		B1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Processar Proximo instante");
				p.rodarNovoSist();
			}
			
		});
		
		B2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Ler novo arquivo de entrada");
				SelecaoDeArq s = new SelecaoDeArq(p.S);
				p.S.trocarArquivo();
			}
			
		});
		B3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				p.S.Conexao();
				System.out.println("Relatorio gravado");
			}
		});

		B4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				cd.lerDadosParticipantes();
				JOptionPane.showMessageDialog(null, "Dados Lidos!", "Aviso!", JOptionPane.INFORMATION_MESSAGE, null);
				System.out.println("Ler dados de outros participantes");
			}
		});
		B5.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				cd.gravarArquivo();
				JOptionPane.showMessageDialog(null, "Arquivo Gravado!", "Aviso!", JOptionPane.INFORMATION_MESSAGE, null);
				System.out.println("Gravar arquivo de saida");
			}
		});
	}
	
	public void mudarCor(JButton b) {
		b.setBackground(c.pink);
		b.setForeground(c.ROSE);
	}
		
	
}
