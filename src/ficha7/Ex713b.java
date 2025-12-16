package ficha7;

import java.util.Scanner;

public class Ex713b {
	// Imprime as cidades dentro dos parametros pedidos pelo método original
	private static void printCidades(String[] cidades) {
		if (cidades[0] == null) {
			System.out.println("Nenhuma cidade está dentro dos parâmetros.");
		} else {
			int i = 0;
			System.out.printf("Cidades dentro dos parâmetros: ");
			while (i < cidades.length && cidades[i] != null) {
				if (i == 0) {
					System.out.printf("%s", cidades[i]);
				} else {
					System.out.printf(", %s", cidades[i]);
				}
				i += 1;
			}
			System.out.printf(".\n");
		}
	}

	// Cidades em que precipitação for igual a 0, ou seja, onde não choveu
	private static void noRain(String[] cidades, double[] temperatura, double[] precipitacao, int lenght) {
		String[] nonRain = new String[lenght];
		int j = 0;
		for (int i = 0; i < lenght; i++) {
			if (precipitacao[i] <= 0) {
				nonRain[j] = cidades[i];
				j++;
			}
		}
		System.out.printf("Cidades onde não choveu:\n");
		printCidades(nonRain);
	}

	// Cidades em que não choveu e que a temperatura seja superior a tempCheck
	private static void noRainTempCheckUp(String[] cidades, double[] temperatura, double[] precipitacao, int lenght,
			double tempCheck) {
		String[] arr = new String[lenght];
		int j = 0;
		for (int i = 0; i < lenght; i++) {
			if (precipitacao[i] <= 0 && temperatura[i] >= tempCheck) {
				arr[j] = cidades[i];
				j++;
			}
		}
		System.out.printf("Cidades onde não choveu e a temperatura foi superior a %f:\n", tempCheck);
		printCidades(arr);
	}

	// Número de cidades onde não choveu e temperatura foi inferior a tempCheck
	private static void noRainTempCheckDown(String[] cidades, double[] temperatura, double[] precipitacao, int lenght,
			double tempCheck) {
		String[] arr = new String[lenght];
		int j = 0;
		for (int i = 0; i < lenght; i++) {
			if (precipitacao[i] <= 0 && temperatura[i] <= tempCheck) {
				arr[j] = cidades[i];
				j++;
			}
		}
		System.out.printf("Cidades onde não choveu e a temperatura foi inferior a %f:\n", tempCheck);
		printCidades(arr);
	}

	public static void main(String[] args) {
		int lenght = 4;
		Scanner sc = new Scanner(System.in);
		String[] cidades = arrayLib.scanStringArr("Insira o nome da cidade", lenght);
		double[] temperatura = arrayLib.scanDoubleArr("temperatura", lenght, -100,
				100);
		double[] precipitacao = arrayLib.scanDoubleArr("precipitação", lenght, 0, 100);

		// cidades em que não choveu
		noRain(cidades, temperatura, precipitacao, lenght);

		// cidades onde não choveu e temperatura superior a 30
		noRainTempCheckUp(cidades, temperatura, precipitacao, lenght, 30);

		// cidades onde não choveu e temperatura foi negativa
		noRainTempCheckDown(cidades, temperatura, precipitacao, lenght, -1);
		sc.close();
	}
}
