package View;

import java.io.BufferedReader;
import java.io.File;
import java.io.Reader;

import javax.swing.JFileChooser;

import controller.Sistema;

public class SelecaoDeArq {

	protected JFileChooser selecionarArq;
	
	public SelecaoDeArq(Sistema s) {
		selecionarArq = new JFileChooser();
		selecionarArq.setCurrentDirectory(new File ("Arq"));
	    int result = selecionarArq.showOpenDialog(null);
	    
	    if (result == JFileChooser.APPROVE_OPTION) {
	        
	        String selectedFilePath = selecionarArq.getSelectedFile().getName();
			s.setArquivo(selectedFilePath);
		}
	}   

   
   
	

}
