package ficha7;

import java.util.Scanner;

public class Ex713b {
	public static void main(String[] args) {
		int lenght = 4;
		Scanner sc = new Scanner(System.in);
		String[] cidades = Arrays.scanStringArr("Insira o nome da cidade", lenght);
		double[] temperatura = Arrays.scanDoubleArr("temperatura", lenght, -100,
				100);
		double[] precipitacao = Arrays.scanDoubleArr("precipitação", lenght, 0, 100);

		System.out.printf("Não choveu nas cidades: ");
		for (int i = 0; i < lenght; i++) {
			if (precipitacao[i] <= 0 && i == 0) {
				System.out.printf("%s", cidades[i]);
			} else if (precipitacao[i] <= 0) {
				System.out.printf(", %s", cidades[i]);
			}
			if (i == lenght - 1)
				System.out.printf(".\n");
		}
		sc.close();
	}
}
