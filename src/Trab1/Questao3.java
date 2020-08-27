package Trab1;
import java.util.Scanner;

public class Questao3 {

	public static void main(String[] args) {
		String frase; 
		int totalA = 0;

		Scanner leTeclado = new Scanner(System.in); 
		System.out.println( "Digite uma frase : " );
		frase = leTeclado.nextLine();

		for(int i = 0; i< frase.length(); i++){
			if(frase.charAt(i) == 'a'){
				totalA = totalA+1;
			}
		}
		System.out.println("O total de letras A é igual a = " + totalA );
		leTeclado.close();
	}

}
