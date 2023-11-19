package View;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JButton;

public class Butao extends JButton{
	public Butao (String texto) {
		setText(texto);
		setOpaque(true);
		setBackground(Color.YELLOW);
		setFont(new Font("arial", Font.BOLD, 20));
		
	}
}
