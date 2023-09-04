
public class Questao2 {

	public static void main(String[] args) {
		int A = 9;
		int B = 11;
		
		if (A < 10) {
			if(A + B == 20) {
				System.out.println("A < 10" +"\n"+ "A + B == 20");// caso as duas sejam verdade
			}else {
				System.out.println("A < 10");// caso apenas a primeira seja verdade
			}
		}else {
			if(A + B == 20) {
				System.out.println("A + B == 20"); // caso apenas a segunda seja verdade
			}else {
				System.out.println("Numero nao valido");//caso as duas sejam falsas
			}
		}
	}
}
