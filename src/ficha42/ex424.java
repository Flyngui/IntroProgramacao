package ficha42;

import java.util.Scanner;

public class ex424 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduza a idade do nadador");
		int age = sc.nextInt();
		switch (age) {
			case 1, 2, 3, 4, 5, 6:
				System.out.println("O nadador pertence ao escalão Golfinho");
				break;
			case 7, 8, 9, 10:
				System.out.println("O nadador pertence ao escalão Infantil");
				break;
			case 11, 12, 13:
				System.out.println("O nadador pertence ao escalão Juvenil");
				break;
			case 14, 15, 16, 17:
				System.out.println("O nadador pertence ao escalão Tubarão");
				break;
			case 18:
				System.out.println("O nadador pertence ao escalão Cota");
				break;
			default:
				System.out.println("Introduza uma idade válida.");
				break;
		}
		sc.close();
		return;
	}
}
