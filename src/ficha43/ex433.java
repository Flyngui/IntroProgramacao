package ficha43;

import java.util.Scanner;

public class ex433 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.printf("Insira um valor inteiro:");
		int n = sc.nextInt();
		String str = (n <= 20) ? "é menor do que 20" : (n > 20 && n <= 50) ? "está entre 20 e 50" : "é maior que 50";
		System.out.printf("n %s\n", str);
		sc.close();
		return;
	}
}
