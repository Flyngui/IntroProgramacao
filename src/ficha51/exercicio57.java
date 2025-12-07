package ficha51;

import java.util.Scanner;
import java.util.Random;

public class exercicio57 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("quantas vezes quer lancar ate sair? ");
		int numero = scan.nextInt();
		Random rand = new Random();

		int cara = 0;
		int coroa = 0;

		while (cara < numero && coroa < numero) {

			int moeda = rand.nextInt(2);
			if (moeda == 1) {
				cara++;
			} else {
				coroa++;
			}

		}
		System.out.println("Sairam " + cara + " caras e " + coroa + " coroas");
		scan.close();
	}
}
