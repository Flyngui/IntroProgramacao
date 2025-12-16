package ficha42;

import java.util.Scanner;

public class ex421 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduza a idade da criança");
		int age = sc.nextInt();
		switch (age) {
			case 1:
				System.out.println("A criança pertence ao escalão Um");
				break;
			case 2:
				System.out.println("A criança pertence ao escalão Dois");
				break;
			case 3:
				System.out.println("A criança pertence ao escalão Três");
				break;
			case 4:
				System.out.println("A criança pertence ao escalão Quatro");
				break;
			default:
				System.out.println("Introduza um valor inteiro válido de 1 a 4.");
				break;
		}
		sc.close();
		return;
	}
}
