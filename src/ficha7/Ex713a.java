package ficha7;

import java.util.Scanner;

public class Ex713a {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int lenght = 5;
		String[] gpu = arrayLib.scanStringArr("Nome do gpu", lenght);
		double[] price = new double[lenght];
		for (int i = 0; i < lenght; i++) {
			System.out.printf("Nome do gpu nesta posição: %s. ", gpu[i]);
			price[i] = arrayLib.scanDouble("Preço para o GPU:");
		}
		// number of gpus cheaper than 100€
		System.out.printf("Número de GPUs que custam menos de 100€: %d\n", arrayLib.lessThan(price, 100));

		// gpus between 70 and 90€
		between(gpu, price, 70, 90);

		// name of most expensive
		System.out.printf("A placa mais cara é: %s\n", gpu[arrayLib.largestIndex(price)]);
		
		sc.close();
	}

	private static void between(String[] gpu, double[] price, double min, double max) {
		String[] inBetween = new String[gpu.length];
		int j = 0;
		for (int i = 0; i < gpu.length; i++) {
			if (price[i] > min && price[i] < max) {
				inBetween[j] = gpu[i];
				j++;
			}
		}
		if (inBetween[0] == null) {
			System.out.println("Nenhum GPU custa entre 70€ e 90€.");
			return;
		}
		System.out.printf("GPUs que custam mais de %f€ e menos de %f€:", min, max);
		for (int i = 0; i < inBetween.length && inBetween[i] != null; i++) {
			System.out.printf(" %s; ", inBetween[i]);
		}
		System.out.println();
	}
} 
