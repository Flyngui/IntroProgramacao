package ficha52;

import java.util.Scanner;

public class ex523 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 0;

		while (true) {
			System.out.printf("Insira um valor entre 1 e 10: ");
			if (sc.hasNextInt()) {
				n = sc.nextInt();
				break;
			} else {
				sc.next();
			}
		}
		for (int i = 1; i <= 100; i++) {
			if (i % n == 0) {
				System.out.println(i);
			}
		}
		sc.close();
	}
}

// ex1 1 3 6 10 15 (21)
// ex2 15
// ex3 3
