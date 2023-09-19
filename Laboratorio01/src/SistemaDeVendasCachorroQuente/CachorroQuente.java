package SistemaDeVendasCachorroQuente;

public class CachorroQuente {
	public Adicional a;
	public Bebidas b;
	public Proteina p;
	public TipoDeQueijo q;
	
	public void ingredientesCachorro(int tipoP, int tipoQ) {
		p.EscolherProteina(tipoP);
		q.EscolherQueijo(tipoQ);
	}
	
	public void adicionar(int tipoAd) {
		a.EscolherAdicional(tipoAd);
	}
	
	public void escolherBebida(int tipoB) {
		b.EscolherBebida(tipoB);
	}
	
}
