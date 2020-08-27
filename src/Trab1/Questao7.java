package Trab1;

public class Questao7 {

	public static void main(String[] args) {

		int impar = 0;
		int par = 0;

		for(int num = 1; num <= 50; num++) {

			if(num % 2 == 0) {
				par += num;

			} else {                                         
				impar += num;
			}
		}
		System.out.println(" Fatorial é : " + fatorial(par - impar));

	}
	public static double fatorial(int number) {
		if (number <= 1) {
			return 1;

		} else {

			return fatorial(number - 1) * number;

		}
	}
}
