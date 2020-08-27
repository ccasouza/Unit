package Trab1;
import java.util.Scanner;

public class Questao4 {

	public static void main(String[] args) {
		String frase;
		Scanner leTeclado = new Scanner (System.in);

		System.out.println("Por favor, digite uma frase: ");
		frase = leTeclado.nextLine();

		String quebra[] = frase.split(" ");
		
		System.out.println("O total de palavras é " + quebra.length);
		leTeclado.close();
	}

}
