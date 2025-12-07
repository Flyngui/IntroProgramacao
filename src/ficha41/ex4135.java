package ficha41;

import java.util.Scanner;

public class ex4135 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.printf("Introduza o valor do salário:");
		int salary = sc.nextInt();
		if (salary >= 1000 && salary < 1200) {
			System.out.printf("Salário aumentado 12%%: %f\n", (salary * 1.12));
		} else if (salary >= 1200 && salary < 1400) {
			System.out.printf("Salário aumentado 10%%: %f\n", (salary * 1.1));
		} else {
			System.out.printf("Salário aumentado 8%%: %f\n", (salary * 1.08));
		}
		sc.close();
		return;
	}
}
