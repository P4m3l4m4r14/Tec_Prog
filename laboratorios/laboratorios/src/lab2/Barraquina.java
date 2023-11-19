package lab2;

import java.util.ArrayList;
import java.util.Scanner;

import Conexao.Conexao;

public class Barraquina {

	private Scanner dados;
	private ArrayList<Venda> listaVenda;
	private Caixa caixa;
	public Conexao conexao;
	
	public Barraquina() {
		System.out.println("Bem vindo a barraquinha de técnicas!\n\n");
		dados = new Scanner(System.in);
		listaVenda = new ArrayList<Venda>();		
		menuOperacoes();
	}

	private void menuOperacoes() {

		int op = 0;
		Cliente comprador = null;
		CachorroQuente cachorroQuenteEscolhido;
		Venda venda= null;
		do {
			op = itensDoMenu();
			switch (op) {
			case 1:
				comprador = registrarCliente();
				venda = new Venda(comprador);
				break;
			case 2:
				System.out.println("Digite quantos cachorros quentes vai querer: ");
				int NCachorroQuente = dados.nextInt();
				String tipoQueijo = escolherTipoQueijo();
				
				caixa.numeroDeVendas+=NCachorroQuente;
				
				cachorroQuenteEscolhido = escolherCachorroQuente(tipoQueijo, NCachorroQuente);
				escolherIngredientes(cachorroQuenteEscolhido);
			
				venda.realizarVenda(cachorroQuenteEscolhido);
				
				listaVenda.add(venda);
				break;
			case 3:
				venda.imprimirVenda(comprador);
			default:
				break;
			}

		} while (op != 4);
		System.out.println("Bye!");

	}

	private int itensDoMenu() {
		System.out.println("Escolha uma opcao para registra a venda");
		System.out.println("1: informar os dados do Cliente comprador");
		System.out.println("2: Escolher cachorro quente");
		System.out.println("3: Mostar valor total");
		System.out.println("4: Encerrar compra");
		return dados.nextInt();
	}

	private String escolherTipoQueijo() {
		System.out.println("Escolha a opcao de queijo: [1 - Mussarela, 2 - Prato, 3 - Parmesao , 4- Coalho]");
		int queijo = dados.nextInt();
		String tipoQueijo = null;

		switch (queijo) {
		case 1:
			tipoQueijo = "Mussarela";
			break;
		case 2:
			tipoQueijo = "Prato";
			break;
		case 3:
			tipoQueijo = "Parmesao";
			break;
		case 4:
			tipoQueijo = "Coalho";
			break;
		default:
			break;
		}
		return tipoQueijo;
	}

	private CachorroQuente escolherCachorroQuente(String tipoQueijo, int NCachorroQuente) {
		System.out.println("\n Escolha a opcaode cachorro quente: [1 - Salsicha, 2 - Linguica, 3 - Frango, 4- Bacon]");
		int tipo = dados.nextInt();
		CachorroQuente c = null;
		switch (tipo) {
		case 1:
			c = new Salsicha(tipoQueijo);
			if(NCachorroQuente > 2) {
				c.valor = (NCachorroQuente * c.valor)*0.9;
			}
			else
				c.valor = NCachorroQuente * c.valor;
			break;
		case 2:
			c = new Linguica(tipoQueijo);
			if(NCachorroQuente > 2)
				c.valor = (NCachorroQuente * c.valor)*0.88;
			else
				c.valor = NCachorroQuente * c.valor;
			break;
		case 3:
			c = new Frango(tipoQueijo);
			if(NCachorroQuente > 3)
				c.valor = (NCachorroQuente * c.valor)*0.87;
			else
				c.valor = NCachorroQuente * c.valor;
			break;
		case 4:
			c = new Bacon(tipoQueijo);
			if(NCachorroQuente > 4)
				c.valor = (NCachorroQuente * c.valor)*0.86;
			else
				c.valor = NCachorroQuente * c.valor;
			break;

		default:
			break;
		}
		return c;
	}
	/*private int ingredientes(){
		System.out.println("Escolha os seguintes ingredientes:\n 1 - Maionese \n 2 - Ketchup \n 3 - Ovo \n 4 - Batata Palha \n 5 - Nao adicionar");
		return dados.nextInt();
	}*/
	
	private ArrayList<String> escolherIngredientes(CachorroQuente c) {
		c.ingredientes = new ArrayList<String>();			
			
	
		return c.ingredientes;
	}

	private Cliente registrarCliente() {
		System.out.println("Você é aluno(1), professor(2) ou servidor(3)?");
		int profissao = dados.nextInt();
		Cliente c = null;
				
		if(profissao==1) {
			System.out.print("\n Nome: ");
			String nome = dados.next();
			System.out.print("\n Matricula:");
			int matricula = dados.nextInt();
			c = new Aluno(nome, matricula);
		
			return c;
		}else if(profissao==2) {
			System.out.print("\n Nome: ");
			String nome = dados.next();
			System.out.print("\n SIAPE:");
			int SIAPE = dados.nextInt();
			c = new ProfessorOuServidor(nome, SIAPE);
			
			return c;
		}else if(profissao==3){
			System.out.print("\n Nome: ");
			String nome = dados.next();
			System.out.print("\n SIAPE:");
			int SIAPE = dados.nextInt();
			c = new ProfessorOuServidor(nome, SIAPE);
	
			return c;
		}else
			System.out.print("\n ERROR!\n Por favor, digite um numero valido 1, 2 ou 3:");
			return registrarCliente();
		}
}
