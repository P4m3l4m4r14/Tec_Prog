package SistemaDeVendasCachorroQuente;

public class Adicional {
	private String[] adicional;
	private int tipoAd;
	private int quantidade = 0;
	
	public Adicional(String[] adicional, int tipoAd) {
		this.tipoAd = tipoAd;
	
		this.adicional = adicional;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public int getTipoAd() {
		return tipoAd;
	}
	public void setTipoAd(int tipoAd) {
		this.tipoAd = tipoAd;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	public String[] EscolherAdicional(int tipoAd) {
		
		int i = quantidade;
			
		if (tipoAd > 4 || tipoAd < 1 )
			adicional[i] = null;
		if (tipoAd == 1)
			adicional[i] = "maionese";
		if (tipoAd == 2)
			adicional[i] = "ketchup";
		if(tipoAd == 3)
			adicional[i] = "ovo";
		if(tipoAd == 4)
			adicional[i] = "batataPalha";
		
		
		quantidade ++; ;
			
		return adicional;
	}
	
}
