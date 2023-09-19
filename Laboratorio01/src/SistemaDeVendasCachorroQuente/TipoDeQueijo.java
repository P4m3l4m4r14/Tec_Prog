package SistemaDeVendasCachorroQuente;

public class TipoDeQueijo {
	private String tipoDeQueijo;
	private int tipoQ;
	
	public TipoDeQueijo(String tipoDeQueijo, int tipoQ) {
		super();
		this.tipoDeQueijo = tipoDeQueijo;
		this.tipoQ = tipoQ;
	}
	
	public String getTipoDeQueijo() {
		return tipoDeQueijo;
	}

	public void setTipoDeQueijo(String tipoDeQueijo) {
		this.tipoDeQueijo = tipoDeQueijo;
	}


	public int getTipoQ() {
		return tipoQ;
	}
	public void setTipoQ(int tipoQ) {
		this.tipoQ = tipoQ;
	}
	
	public String EscolherQueijo( int tipoQ) {
		
		if(tipoQ == 1)
			tipoDeQueijo = "Mussarela";
		if(tipoQ == 2)
			tipoDeQueijo = "Prato";
		if(tipoQ == 3)
			tipoDeQueijo = "Parmesao";
		if(tipoQ == 4)
			tipoDeQueijo = "Coalho";
		if (tipoQ > 4 || tipoQ < 1)
			tipoDeQueijo = null;
		
		return tipoDeQueijo;
	}
}

