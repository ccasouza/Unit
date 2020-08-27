package Trab1;
import java.util.Scanner;

public class Questao8 {

	public static void main(String[] args) {

		double tmp, x1, x2;
		Scanner leTeclado = new Scanner(System.in);
		
		System.out.println( "Por favor, informe o coeficiente de a : " );
		int a = leTeclado.nextInt();

		System.out.println( "Por favor, informe o coeficiente de b : " );
		int b = leTeclado.nextInt();

		System.out.println( "Por favor, informe o coeficiente de c : " );
		int c = leTeclado.nextInt();

		tmp = Math.pow (b,2) * a * c ;
		x1 = (b + Math.sqrt(tmp)) / 2 * a ;
		x2 = (b - Math.sqrt(tmp)) / 2 * a ;

		System.out.println("X1 = " + x1 + " e X2 = " + x2 );
		leTeclado.close();
	}
}
