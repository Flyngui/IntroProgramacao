package ficha51;

import java.util.Random;
import java.util.Scanner;

public class exercicio510 {

	public static void main(String[] args) {
		Random rand = new Random();
		int numero = rand.nextInt(255);
		Scanner scan = new Scanner(System.in);
		int numerodetentativas = 0;
		System.out.print("Insira a tentativa ate 255");
		int tentativa = scan.nextInt();

		do {
			if (numerodetentativas < 6) {
				System.out.print("tente novamente: ");
				tentativa = scan.nextInt();
				numerodetentativas++;
			} else
				System.out.println("Excesso de tentativas");

		} while (tentativa != numero);

		System.out.println("Acertou em " + numerodetentativas + " tentativas.");
		scan.close();
	}

}
