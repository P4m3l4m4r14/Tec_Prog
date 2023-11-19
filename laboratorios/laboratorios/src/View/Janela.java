package View;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.jar.JarInputStream;


public class Janela extends JFrame{
	
	private Paineis p = new Paineis();
	private JPanel pPrincipal = new JPanel();
	
	public Janela() {
			
		setTitle("Sistema da Barraquinha");
		setSize(800,500);
		
		pPrincipal.setBackground(Color.RED);
		adicionarBotoes(pPrincipal);
		adicionarPaineis();
		add(pPrincipal, BorderLayout.NORTH);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		setLocationRelativeTo(null);
		setBackground(Color.RED);
		setVisible(true);
	}
	
	private void adicionarBotoes(JPanel panel) {
		panel.setBorder(new LineBorder(Color.yellow,4));
		JButton botaoVenda = criarBotao("Realizar Venda");
		JButton botaoListaVenda = criarBotao("Listar Vendas");
		JButton botaoRelatorio = criarBotao("Mostrar Relatório");
		JButton botaoClientes = criarBotao("Listar Clientes");
		
		botaoVenda.addActionListener(new AcaoApresentarPainelVenda(p.realizarVenda()));
		botaoListaVenda.addActionListener(new AcaoApresentaListaVenda(p.listarVendas()));
		botaoRelatorio.addActionListener(new AcaoApresentarPainelRelatorio(p.mostrarRelatorio()));
		botaoClientes.addActionListener(new AcaoApresentarPainelClientes(p.listarClientes()));
		
		panel.add(botaoVenda);
		panel.add(botaoListaVenda);
		panel.add(botaoRelatorio);
		panel.add(botaoClientes);
	}
	
	private Butao criarBotao(String texto) {
		Butao b = new Butao(texto);
		b.setForeground(Color.red);
		return b;
	}
	public void adicionarPaineis() {
				
		add(p.realizarVenda(), BorderLayout.CENTER);
		add(p.mostrarRelatorio(), BorderLayout.CENTER);
		add(p.listarClientes(), BorderLayout.CENTER);
		add(p.listarVendas(), BorderLayout.CENTER);
	}
}

class AcaoApresentarPainelVenda implements ActionListener {
	
	JPanel p;
	
	public AcaoApresentarPainelVenda(JPanel p) {
		this.p = p;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		p.setVisible(true);
	}
}
class AcaoApresentaListaVenda implements ActionListener{
	
	JPanel p;
	
	public AcaoApresentaListaVenda(JPanel p) {
		this.p = p;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		p.setVisible(true);
	}
}

class AcaoApresentarPainelRelatorio implements ActionListener{
	
	JPanel p;
	
	public AcaoApresentarPainelRelatorio(JPanel p) {

		this.p = p;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		p.setVisible(true);
		
	}
	
}
class AcaoApresentarPainelClientes implements ActionListener{
	public AcaoApresentarPainelClientes(JPanel p) {
		super();
		this.p = p;
	}

	JPanel p;

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
}

