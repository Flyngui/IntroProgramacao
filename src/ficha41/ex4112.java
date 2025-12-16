package ficha41;

import java.util.Scanner;

public class ex4112 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduza um valor em kg:");
		float kg = sc.nextFloat();
		int convertTo;
		while (true) {
			System.out.println("Especifique unidade para conversão: 1. libras, 2. onças, 3. quilates");
			if (sc.hasNextInt()) {
				int n = sc.nextInt();
				if (n == 1 || n == 2 || n == 3) {
					convertTo = n;
					break;
				} else {
					System.out.printf("Insira apenas (1) para libras, (2) para onças ou (3) para quilates");
				}
			} else {
				sc.next();
				System.out.printf("Insira apenas (1) para libras, (2) para onças ou (3) para quilates");
			}
		}
		if (convertTo == 1) {
			System.out.printf("%f\n", kg * 2.205); // libras
		} else if (convertTo == 2) {
			System.out.printf("%f\n", kg * 35.274); // onças
		} else if (convertTo == 3) {
			System.out.printf("%f\n", kg * 5000); // quilates
		}
		sc.close();
		return;
	}
}
