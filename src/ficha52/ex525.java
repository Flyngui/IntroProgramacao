package ficha52;

import java.util.Scanner;

public class ex525 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int min = 2147483647;
		for (int i = 0; i < 6; i++) {
			System.out.printf("Insira um valor inteiro: ");
			int n = sc.nextInt();
			if (n < min) {
				min = n;
			}
		}
		System.out.println(min);
		sc.close();
	}
}
