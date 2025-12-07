package ficha41;

/* a)
 * a1) É escrito "i1 é par" e Fim
 * a2) Escreve os valores das 3 variáveis e Fim
 * a3) Escreve "só i2 e i3 são pares" e os seus valores e Fim
 * a4) Escreve os valores das variáveis e Fim
 *
 * b)
 * b1) Falso
 * b2) Falso
 * b3) Verdadeiro
 * b4) Verdadeiro
 */

import java.util.Scanner;

public class ex412 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduza o valor para i1");
		int i1 = sc.nextInt();
		System.out.println("Introduza o valor para i2");
		int i2 = sc.nextInt();
		System.out.println("Introduza o valor para i3");
		int i3 = sc.nextInt();

		if (i1 % 2 == 0) {
			System.out.println("i1 é par");
		} else {
			if (i2 % 2 == 0) {
				if (i3 % 2 == 0) {
					System.out.println("só i2 e i3 são pares");
					System.out.printf("i2 = %d, i3 = %d\n", i2, i3);
				} else {
					System.out.println("só i2 é par");
					System.out.printf("i2 = %d\n", i2);
				}
			} else {
				if (i3 % 2 == 0) {
					System.out.println("só i3 é par");
					System.out.printf("i3 = %d\n", i3);
				} else {
					System.out.println("Nenhum é par");
				}
				System.out.printf("i1 = %d, i2 = %d, i3 = %d\n", i1, i2, i3);
			}
		}
		sc.close();
		return;
	}
}
