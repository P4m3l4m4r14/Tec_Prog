
public class Questao13 {
	/*Verifique se A é maior que 10, se verdade imprima: "A > 10". AINDA,(soponhamos que isso seja considerando A>10)
	verifique se o A mais B é igual a 20, se verdade imprima: "A + B == 20”.
	Caso as afirmações não sejam verdadeiras, imprima: "números não
	válidos".*/
	
	public static void main(String[] args) {
		int A = 15;
		int B = 5;
	
	if(A>10) {
		System.out.println("A > 10");
		if(A+B==20)
			System.out.println("A + B == 20");	
	}else
		if(A+B==20){//nada
		}else 
			System.out.println("numeros nao validos");
  }
}
