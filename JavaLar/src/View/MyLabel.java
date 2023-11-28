package View;

import javax.swing.BorderFactory;
import javax.swing.JLabel;

import controller.Posicao;

public class MyLabel extends JLabel implements Posicao{
	
	private int x;
	private int y;
	private Cores c = new Cores();
	@Override
	public void posicao(int x, int y) {
		// TODO Auto-generated method stub
		this.x = x;
		this.y = y;
	}
	public MyLabel(int x, int y) {
		setBorder(BorderFactory.createLineBorder(c.ROSE, 1));
		//setText(x + ", " + y);
		posicao(x,y);
		setBackground(c.ROSE);
		
	}
	
}
