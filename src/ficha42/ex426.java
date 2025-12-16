package ficha42;

import java.util.Scanner;

public class ex426 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduza o nome do mês:");
		String month = sc.nextLine().toLowerCase();
		if (month.equals("fevereiro")) {
			System.out.println("Introduza o ano:");
			int year = sc.nextInt();
			if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
				month = "fevereirob";
			}
		}
		switch (month) {
			case "janeiro", "março", "marco", "maio", "julho", "agosto", "outubro", "dezembro":
				System.out.println("O mês tem 31 dias");
				break;
			case "abril", "junho", "setembro", "novembro":
				System.out.println("O mês tem 30 dias");
				break;
			case "fevereiro":
				System.out.println("O mês tem 28 dias");
				break;
			case "fevereirob":
				System.out.println("O mês tem 29 dias");
				break;
			default:
				System.out.println("Mês inválido");
				break;
		}
		sc.close();
		return;
	}
}
