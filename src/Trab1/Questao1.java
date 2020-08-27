package Trab1;

public class Questao1 {

	public static void main(String[] args) {

		int a = 1 ;
		double b = 1 ;
		double c = 1 ; 

		do {
		System.out.println( "Casa " + a + " - Qtd: " + b + " - Soma: " + c );
			a = a + 1;
			b = b*2  ;
			c = c + b; 
		} 
		while (a <= 64);
	}
}
