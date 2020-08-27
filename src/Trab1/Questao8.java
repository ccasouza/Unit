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

		tmp = Math.pow (b,2) - (4 * a * c);

		if(tmp<0) {
			System.out.println("Não possui raízes");
			
		}else if(tmp==0){
			
			double x = (-b + Math.sqrt(tmp)) / 2 * a ;
			System.out.println("Raiz" + x);
			
		}else {
			x1 = (-b + Math.sqrt(tmp)) / 2 * a ;
			x2 = (-b - Math.sqrt(tmp)) / 2 * a ;
			System.out.println("Raiz1 = " + x1 + " e Raiz2 = " + x2 );
		}
		leTeclado.close();
	}
}
