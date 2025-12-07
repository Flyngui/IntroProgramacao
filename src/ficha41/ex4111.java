package ficha41;

import java.util.Scanner;

public class ex4111 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		if (A == B) {
			System.out.println("Os valores são iguais");
		} else if (A > B) {
			System.out.println(A);
		} else {
			System.out.println(B);
		}
		sc.close();
	}
}
