	package View;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.util.ArrayList;

import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;


public class Paineis extends JPanel{
	
	public JCheckBox maionese = new JCheckBox("Maionese");
	public JCheckBox katchup = new JCheckBox("Katchup");
	public JCheckBox ovo = new JCheckBox("Ovo");
	public JCheckBox batataPalha = new JCheckBox("Batata Palha");
	public ArrayList<String> adicionais = new ArrayList<String>();
	
	public JPanel realizarVenda() {
		JPanel painel = new JPanel();
		painel.setPreferredSize(new Dimension(900,700));
		painel.setBackground(Color.RED);
		JLabel label1 = new JLabel("Nome:");
		JLabel label2 = new JLabel("Matrícula: ");
		JLabel label3 = new JLabel("Opção de queijo: ");
		JLabel label4 = new JLabel("Opção de Proteína: ");
		JLabel label5 = new JLabel("Escolha os adicionais:");
		JLabel label6 = new JLabel("Bebida:");
		JTextField nome = new JTextField(15);
		JTextField matricula = new JTextField(6);
	//	maionese.addActionListener();
		
		maionese.setBackground(Color.red);
		katchup.setBackground(Color.red);
		ovo.setBackground(Color.red);
		batataPalha.setBackground(Color.red);
		
		nome.setBounds(300, 500, 300, 100);
		painel.setBackground(Color.RED);
		painel.add(label1);
		painel.add(nome);
		painel.add(label2);
		painel.add(matricula);
		painel.add(label3);
		painel.add(label4);
		painel.add(label5);
		painel.add(maionese);
		painel.add(katchup);
		painel.add(ovo);
		painel.add(batataPalha);
		painel.add(label6);
		setVisible(false);
		
		System.out.println("Realizar Venda");
		
		return painel;
	}
	
	
	public JPanel listarVendas() {
		JPanel p = new JPanel();
		
		return p;
	}
	public JPanel mostrarRelatorio() {
		JPanel p = new JPanel();
		
		return p;
	}
	public JPanel listarClientes() {
		JPanel p = new JPanel();
		
		return p;
	}
}
