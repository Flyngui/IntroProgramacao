package ficha6;

import java.util.Scanner;

public class Ex631 {
	private static double scanDouble(Scanner sc, String prompt) {
		double n = 0;
		while (true) {
			System.out.printf("%s ", prompt);
			if (sc.hasNextLine()) {
				n = sc.nextDouble();
				break;
			} else {
				sc.next();
			}
		}
		return n;
	}

	private static double scanNonNegative(Scanner sc, String prompt) {
		double n = 0;
		while (true) {
			n = scanDouble(sc, prompt);
			if (Methods.isNegative(n)) {
				System.out.println("O valor deve ser positivo.");
			} else {
				break;
			}
		}
		return n;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// hipotenusa
		double n1 = scanNonNegative(sc, "Insira um valor positivo para o primeiro cateto:");
		double n2 = scanNonNegative(sc, "Insira um valor positivo para o segundo cateto:");
		System.out.printf("%f\n", Methods.hypothenuse(n1, n2));

		// se sao iguais
		n1 = scanDouble(sc, "Insira o valor para o primeiro numero a comparar:");
		n2 = scanDouble(sc, "Insira o valor para o segundo numero a comparar:");
		System.out.printf("Os numeros são iguais? %b\n", Methods.isEqual(n1, n2));

		// raio e area de um circulo
		double radius = scanNonNegative(sc, "Insira um valor positivo para o raio:");
		System.out.printf("Area: %f, Perimetro: %f\n", Methods.circleArea(radius), Methods.circlePerimeter(radius));

		// medias
		n1 = scanDouble(sc, "Insira o primeiro numero para calcular a media:");
		n2 = scanDouble(sc, "Insira o segundo numero para calcular a media:");
		double n3 = scanDouble(sc, "Insira o terceiro numero para calcular a media:");
		System.out.printf("Media aritmetica: %f, Media Harmonica: %f\n", Methods.avg(n1, n2, n3),
				Methods.harmonicAvgThree(n1, n2, n3));

		// diferença
		n1 = scanDouble(sc, "Insira o primeiro de dois numeros para comparar:");
		n2 = scanDouble(sc, "Insira o segundo numero:");
		double difference = Methods.absDifference(n1, n2);
		System.out.printf("A diferenceça absoluta dos valores é: %f ", difference);
		System.out.printf("\nArredondadamente:\n para cima: %d;\n para baixo: %d.\n", Methods.roundUp(difference),
				Methods.roundDown(difference));
	}
}
