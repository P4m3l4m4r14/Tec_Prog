package SistemaDeVendasCachorroQuente;

public class Vendas {
	public Aluno aluno;
	public CachorroQuente cachorroQuente;
	
	public void Venda() {		
		cachorroQuente.p.setTipoP(3);
		cachorroQuente.q.setTipoQ(3);
		cachorroQuente.ingredientesCachorro( cachorroQuente.p.getTipoP() , cachorroQuente.q.getTipoQ());
		
		cachorroQuente.b.setTipoB(2);
		cachorroQuente.escolherBebida(cachorroQuente.b.getTipoB());
		
		cachorroQuente.a.setTipoAd(1);
		cachorroQuente.adicionar(cachorroQuente.a.getTipoAd());
		cachorroQuente.a.setTipoAd(2);
		cachorroQuente.adicionar(cachorroQuente.a.getTipoAd());
		
		aluno.Registro(cachorroQuente);
	}
	
}
