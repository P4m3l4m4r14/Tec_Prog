package SistemaDeVendasCachorroQuente;

public class Proteina {
	private String proteina;
	private int tipoP;
	
	public Proteina(String proteina, int tipoP) {
		this.tipoP = tipoP;
		this.proteina = proteina;
	}

	public void setTipoP(int tipoP) {
		this.tipoP = tipoP;
	}
	public int getTipoP() {
		return tipoP;
	}

	
	public String EscolherProteina(int tipoP) {
		
		if(tipoP == 0)
			proteina = "Salsicha";
		if(tipoP == 1)
			proteina = "Linguica";
		if(tipoP == 2)
			proteina = "Frango";
		if(tipoP == 3)
			proteina = "Bacon";
		if (tipoP > 3 || tipoP < 0)
			proteina = null;
		
		return proteina;
	}
}
