package Trab1;
import java.util.Scanner;

public class Questao5 {

	public static void main(String[] args) {
		int x = 1; 
		int y = 0;
		int temp;

		Scanner leTeclado = new Scanner(System.in); 
		System.out.println( "Por favor, digite o valor de N: " );
		int n = leTeclado.nextInt();

		for (int i=1; i <= n; i++) {
			System.out.println(x);

			temp = x;  
			x = x + y;
			y = temp; 

		}leTeclado.close();

	}
}

