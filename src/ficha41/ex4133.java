package ficha41;

import java.util.Scanner;

public class ex4133 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.printf("Introduza a nota do primeiro teste:");
		float firstTest = sc.nextFloat();
		System.out.printf("Introduza a nota do segundo teste:");
		float secondTest = sc.nextFloat();
		System.out.printf("Introduza a nota do terceiro teste:");
		float thirdTest = sc.nextFloat();

		float normalAvg = (firstTest + secondTest + thirdTest) / 3;
		System.out.printf("A média não ponderada do aluno é: %f\n", normalAvg);
		float weightedAvg = ((firstTest * 3) + (secondTest * 4) + (thirdTest * 5)) / 12;
		System.out.printf("A média ponderada é: %f\n", weightedAvg);
		if (normalAvg >= 9.5) {
			System.out.println("Usando a média normal o aluno está dispensado de exame.");
		} else if (normalAvg >= 7.5 && normalAvg < 9.5) {
			System.out.println("Usando a média normal o aluno está admitido a exame.");
		} else if (normalAvg < 7.5) {
			System.out.println("Usando a média normal o aluno está reprovado.");
		}
		if (weightedAvg >= 9.5) {
			System.out.println("Usando a média ponderada o aluno está dispensado de exame.");
		} else if (weightedAvg >= 7.5 && weightedAvg < 9.5) {
			System.out.println("Usando a média ponderada o aluno está admitido a exame.");
		} else if (weightedAvg < 7.5) {
			System.out.println("Usando a média ponderada o aluno está reprovado.");
		}
		sc.close();
		return;
	}
}
