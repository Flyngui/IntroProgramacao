package ficha52;

import java.util.Scanner;

public class ex5210 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 0;
		int golfinho = 0, infantil = 0, juvenil = 0, tubarao = 0, cota = 0;

		for (int i = 0; i < 10; i++) {
			while (true) {
				System.out.printf("Inserir inteiro positivo: ");
				if (sc.hasNextInt()) {
					n = sc.nextInt();
					break;
				} else {
					sc.next();
				}
			}
			if (n <= 6) {
				golfinho += 1;
			} else if (n >= 6 && n <= 10) {
				infantil += 1;
			} else if (n >= 11 && n <= 13) {
				juvenil += 1;
			} else if (n >= 14 && n <= 17) {
				tubarao += 1;
			} else if (n >= 18) {
				cota += 1;
			}
		}
		System.out.printf("Golhinhos: %d\nInfantis: %d\nJuvenis: %d\nTubarões: %d\nCotas: %d\n", golfinho, infantil,
				juvenil, tubarao, cota);
		sc.close();
	}

}
