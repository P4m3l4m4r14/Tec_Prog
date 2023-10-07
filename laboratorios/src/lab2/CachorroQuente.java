package lab2;

import java.util.ArrayList;

public abstract class CachorroQuente {

	protected String queijo;
	protected ArrayList<String> ingredientes;
	protected String bebiba;
	protected double valor;
	protected String tipo;
	
	public CachorroQuente(String queijo) {
		this.queijo = queijo;		
	}
	
	public void adicionarIngredientes(String ingrediente) {
		
		ingredientes.add(ingrediente);
	}
}
