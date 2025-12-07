package ficha51;

import java.util.Scanner;

public class exercicio54 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Insira o valor de x (entre 1 e 10): ");
		int x = scan.nextInt();

		System.out.print("Insira o valor de y (entre 1 e 10, y >= x): ");
		int y = scan.nextInt();

		int soma = 0;
		int i = x;

		if (x >= 1 && y <= 10 && y >= x) {
			while (i <= y) {
				soma += i;
				i++;
			}
			System.out.println("A soma de " + x + " até " + y + " é: " + soma);
		} else {
			System.out.println("Valores inválidos! x e y devem estar entre 1 e 10 e y >= x.");
		}
		scan.close();
	}

}
