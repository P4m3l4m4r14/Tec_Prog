package lab2;
import java.util.ArrayList;

public class Venda {

	private Cliente cliente;
	private ArrayList<CachorroQuente> cachorrosQuentes;
	protected double valorDaVenda;
	private Caixa caixa;
	
	
	public Venda(Cliente cliente) {
		this.cliente= cliente;
		cachorrosQuentes = new ArrayList<CachorroQuente>();
	}
	
	public void realizarVenda(CachorroQuente c) {
		cachorrosQuentes.add(c);
		valorDaVenda= c.valor;
		caixa.valorTotal+=valorDaVenda;
	}
	
	public void imprimirVenda(Cliente cliente) {
		
		if( cliente == new Aluno(cliente.getNome(),cliente.getNumeroDeItendificacao())) 
			System.out.println("Aluno: <" + cliente.getNome() + "> - Matricula: <" + cliente.getNumeroDeItendificacao() + ">");
		else
			System.out.println("Cliente: <" + cliente.getNome() + "> - SIPAC: <" + cliente.getNumeroDeItendificacao() + ">");

		System.out.println("Cachorro Quente: \n");
		
		for(CachorroQuente cachorro : cachorrosQuentes) {
			System.out.println("<" + cachorro.tipo + ">\n");
		}
		
		System.out.println("O total da compra foi:" + valorDaVenda);
			
	}
	
	public Cliente getCliente() {
		return cliente;
	}

	public ArrayList<CachorroQuente> getCachorrosQuentes() {
		return cachorrosQuentes;
	}
	
	
}
