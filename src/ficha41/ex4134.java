package ficha41;

import java.util.Scanner;

public class ex4134 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.printf("Introduza o primeiro valor inteiro:");
		int n1 = sc.nextInt();
		System.out.printf("Introduza o segundo valor inteiro:");
		int n2 = sc.nextInt();
		if (n1 % n2 == 0 && n2 % n1 == 0) {
			System.out.println("Ambos os números são múltiplos do outro.");
		} else if (n1 % n2 != 0 && n2 % n1 != 0) {
			System.out.println("Nenhum dos números é múltiplo do outro.");
		} else if (n1 % n2 == 0) {
			System.out.println("Apenas o primeiro número é múltiplo do segundo.");
		} else if (n2 % n1 == 0) {
			System.out.println("Apenas o segundo número é múltiplo do primeiro.");
		}
		sc.close();
		return;
	}
}
