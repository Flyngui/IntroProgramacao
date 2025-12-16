package ficha42;

import java.util.Scanner;

public class ex427 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduza o valor do salário:");
		int salary = sc.nextInt();
		int percent = 8;
		if (salary >= 1000 && salary < 1200) {
			percent = 12;
		} else if (salary >= 1200 && salary < 1400) {
			percent = 10;
		}
		switch (percent) {
			case 12:
				System.out.printf("Salário aumentado: %f\n", (salary * 1.12));
				break;
			case 10:
				System.out.printf("Salário aumentado: %f\n", (salary * 1.1));
				break;
			default:
				System.out.printf("Salário aumentado: %f\n", (salary * 1.08));
				break;
		}
		sc.close();
		return;
	}
}

// Não é prático resolver este problema com switch cases porque continua a ser preciso um if para fazer a lógica de quanto é suposto
// o salário ser aumentado, sendo que esse mesmo if pode ser usado para resolver a totalidade do exercício, sem o uso do switch
