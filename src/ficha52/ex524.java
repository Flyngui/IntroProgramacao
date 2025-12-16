package ficha52;

import java.util.Scanner;

public class ex524 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int max = -2147483648;
		for (int i = 0; i < 6; i++) {
			System.out.printf("Insira um valor inteiro: ");
			int n = sc.nextInt();
			if (n > max) {
				max = n;
			}
		}
		System.out.println(max);
		sc.close();
	}
}
