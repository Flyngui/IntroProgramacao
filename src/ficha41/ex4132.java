package ficha41;

import java.util.Scanner;

public class ex4132 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.printf("Introduza o primeiro valor inteiro:");
		int n1 = sc.nextInt();
		System.out.printf("Introduza o segundo valor inteiro:");
		int n2 = sc.nextInt();
		System.out.printf("Introduza o terceiro valor inteiro:");
		int n3 = sc.nextInt();
		if (n1 == n2 && n1 == n3 && n2 == n3) {
			System.out.println("Os valores são iguais");
		} else if (n1 >= n2 && n1 >= n3) {
			System.out.println(n1);
		} else if (n2 >= n1 && n2 >= n3) {
			System.out.println(n2);
		} else {
			System.out.println(n3);
		}
		sc.close();
		return;
	}
}
