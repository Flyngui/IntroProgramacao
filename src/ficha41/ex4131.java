package ficha41;

import java.util.Scanner;

public class ex4131 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.printf("Introduza a idade do nadador:");
		int age = sc.nextInt();
		if (age < 6) {
			System.out.println("O nadador pertence ao escalão Golfinho");
		} else if (age >= 7 && age <= 10) {
			System.out.println("O nadador pertence ao escalão Infantil");
		} else if (age >= 11 && age <= 13) {
			System.out.println("O nadador pertence ao escalão Juvenil");
		} else if (age >= 14 && age <= 17) {
			System.out.println("O nadador pertence ao escalão Tubarão");
		} else if (age > 17) {
			System.out.println("O nadador pertence ao escalão Cota");
		}
		sc.close();
		return;
	}
}
