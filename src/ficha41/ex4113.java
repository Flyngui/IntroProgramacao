package ficha41;

import java.util.Scanner;

public class ex4113 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.printf("Introduza um número inteiro:");
		int n = sc.nextInt();
		if (n < 20) {
			System.out.printf("%s\n", "menor do que 20");
		} else if (n >= 20 && n <= 50) {
			System.out.printf("%s\n", "entre 20 e 50");
		} else if (n > 50) {
			System.out.printf("%s\n", "maior que 50");
		}
		sc.close();
		return;
	}
}
