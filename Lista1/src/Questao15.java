
public class Questao15 {
	public static void main(String[] args) {
		int A = 9;
		int B = 11;
		
		if (A < 10) {
			System.out.println("A < 10");
			if(A + B == 20) 
				System.out.println("A + B == 20");
		}else {
			if(A + B == 20) {
				System.out.println("A + B == 20"); 
			}else
				System.out.println("Numero nao valido");
		}
	}
}
