package ficha51;

import java.util.Scanner;

public class exercicio59 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int idade;
		int golfinho = 0;
		int infantil = 0;
		int juvenil = 0;
		int tubarao = 0;
		int cota = 0;

		int i = 0;

		while (i < 10) {
			System.out.print("Idade do nadador " + (i + 1) + ": ");
			idade = sc.nextInt();

			if (idade <= 6) {
				golfinho++;
			} else if (idade <= 10) {
				infantil++;
			} else if (idade <= 13) {
				juvenil++;
			} else if (idade <= 17) {
				tubarao++;
			} else {
				cota++;
			}

			i++;
		}

		System.out.println("\n--- Resultado (10 nadadores) ---");
		System.out.println("Golfinho: " + golfinho);
		System.out.println("Infantil: " + infantil);
		System.out.println("Juvenil: " + juvenil);
		System.out.println("Tubarão: " + tubarao);
		System.out.println("Cota: " + cota);

		golfinho = infantil = juvenil = tubarao = cota = 0;
		System.out.println("\n--- Novo processamento (até 1º cota) ---");

		while (true) {
			System.out.print("Idade do nadador: ");
			idade = sc.nextInt();

			if (idade <= 6) {
				golfinho++;
			} else if (idade <= 10) {
				infantil++;
			} else if (idade <= 13) {
				juvenil++;
			} else if (idade <= 17) {
				tubarao++;
			} else {
				cota++;
				break;
			}
		}

		System.out.println("\n--- Resultado (até 1º cota) ---");
		System.out.println("Golfinho: " + golfinho);
		System.out.println("Infantil: " + infantil);
		System.out.println("Juvenil: " + juvenil);
		System.out.println("Tubarão: " + tubarao);
		System.out.println("Cota: " + cota);

		golfinho = infantil = juvenil = tubarao = cota = 0;
		System.out.println("\n--- Novo processamento (até idade negativa) ---");

		while (true) {
			System.out.print("Idade do nadador: ");
			idade = sc.nextInt();

			if (idade < 0) {
				break;
			}

			if (idade <= 6) {
				golfinho++;
			} else if (idade <= 10) {
				infantil++;
			} else if (idade <= 13) {
				juvenil++;
			} else if (idade <= 17) {
				tubarao++;
			} else {
				cota++;
			}
		}

		System.out.println("\n--- Resultado (até idade negativa) ---");
		System.out.println("Golfinho: " + golfinho);
		System.out.println("Infantil: " + infantil);
		System.out.println("Juvenil: " + juvenil);
		System.out.println("Tubarão: " + tubarao);
		System.out.println("Cota: " + cota);

		sc.close();
	}

}
