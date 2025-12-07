package ficha41;

import java.util.Scanner;

public class ex4115 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.printf("Insira nome da reserva:");
		String nome = sc.next();
		int days, basePrice, totalPrice;
		while (true) {
			System.out.printf("Insira o número de dias:");
			if (sc.hasNextInt()) {
				int d = sc.nextInt();
				if (d >= 0) {
					days = d;
					break;
				} else {
					System.out.printf("Por favor insira um inteiro positivo.\n");
				}
			} else {
				sc.next();
				System.out.printf("Por favor insira um inteiro positivo.\n");
			}
		}
		basePrice = days * 50;
		if (days > 10) {
			totalPrice = basePrice + (5 * days);
		} else if (days == 10) {
			totalPrice = basePrice + (6 * days);
		} else {
			totalPrice = basePrice + (7 * days);
		}
		System.out.printf("A reserva de %s fica a um total de %d euros.\n", nome, totalPrice);
		sc.close();
		return;
	}
}
