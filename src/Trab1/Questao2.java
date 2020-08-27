package Trab1;
import java.util.Scanner;

public class Questao2 {

	public static void main(String[] args) {

		int x;
		int n;
		double a = 0;

		Scanner leTeclado = new Scanner(System.in); 
		System.out.println( "Digite o valor de N : " );
		n = leTeclado.nextInt();

		for (x = 0 ; x < n ; x++) {
			a +=  (n - x) / (x + 1);
		}		
		System.out.println("A = " + a);
		leTeclado.close();
	}

}
