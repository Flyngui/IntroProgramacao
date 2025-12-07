package ficha51;

import java.util.Scanner;

public class exercicio511 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("insira 2 numeros inteiros");
		double n1 = scan.nextInt();
		double n2 = scan.nextInt();
		double quociente = n1 / n2;
		double resto = n1 % n2;
		do {
			System.out.print("Insira 2 numeros inteiros");
			n1 = scan.nextInt();
			n2 = scan.nextInt();

		} while (n1 < 0 && n2 < 0);
		{
			System.out.println("o quociente é " + quociente + " e o resto é " + resto);
		}
		scan.close();

	}

}
