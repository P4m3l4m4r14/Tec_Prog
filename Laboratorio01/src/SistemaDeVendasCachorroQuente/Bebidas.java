package SistemaDeVendasCachorroQuente;

public class Bebidas {
	private String Bebida;
	private int tipoB;
	
	public Bebidas(String bebida, int tipoB) {
		super();
		Bebida = bebida;
		this.tipoB = tipoB;
	}
	public String getBebida() {
		return Bebida;
	}
	public void setBebida(String bebida) {
		Bebida = bebida;
	}
	public int getTipoB() {
		return tipoB;
	}
	public void setTipoB(int tipoB) {
		this.tipoB = tipoB;
	}
	
	public String EscolherBebida(int tipoB) {
		
		if(tipoB == 1)
			Bebida = "Coca-cola";
		if(tipoB == 2)
			Bebida = "DelRio";
		if(tipoB == 3)
			Bebida = "Suco do Chaves";
		if (tipoB > 3 || tipoB < 1)
			Bebida = null;
		
		return Bebida;
	}	
}
