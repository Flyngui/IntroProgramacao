package ficha41;

import java.util.Scanner;

public class ex4136 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		float a = readFloat(sc, "Introduza o valor de a:");
		float b = readFloat(sc, "Introduza o valor de b:");
		float c = readFloat(sc, "Introduza o valor de c:");
		float d = readFloat(sc, "Introduza o valor de d:");
		float e = readFloat(sc, "Introduza o valor de e:");
		float f = readFloat(sc, "Introduza o valor de f:");

		System.out.printf("x = %f\n", (c * e - b * f) / (a * e - b * d));
		System.out.printf("y = %f\n", (a * f - c * d) / (a * e - b * d));
		sc.close();
		return;
	}

	private static float readFloat(Scanner sc, String prompt) { // garante que um valor válido é lido
		while (true) {
			System.out.printf(prompt);
			if (sc.hasNextFloat()) {
				return sc.nextFloat();
			} else {
				sc.next();
				System.out.println("Valor inválido, insira um número válido.");
			}
		}
	}
}
