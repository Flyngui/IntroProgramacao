package ficha43;

import java.util.Scanner;

public class ex431 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.printf("Insira o primeiro valor inteiro: ");
		int n1 = sc.nextInt();
		System.out.printf("Insira o segundo valor inteiro: ");
		int n2 = sc.nextInt();
		System.out.println((n1 >= n2) ? n1 : n2);
		sc.close();
		return;
	}
}
