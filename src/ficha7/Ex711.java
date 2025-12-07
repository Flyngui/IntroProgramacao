package ficha7;

import java.util.Scanner;

public class Ex711 {
	private static void printArray(double[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("arr[%d]: %d; ", i, arr[i]);
		}
		System.out.println();
	}

	private static void showMenu() {
		System.out.println("1. Apresentar o maior número do vetor.");
		System.out.println("2. Apresentar o menor número do vetor.");
		System.out.println("3. Apresentar a média dos valores do vetor.");
		System.out.println("4. Apresentar a média dos valores do vetor, desprezando o maior e o menor deles.");
		System.out.println("5. Obter o índice do maior elemento do vetor.");
		System.out.println("6. Obter o índice do menor elemento do vetor.");
		System.out.println("7. Trocar a ordem dos valores do vetor.");
		System.out.println("8. Ordenar o vetor por ordem decrescente.");
		System.out.println("9. Ordenar o vetor por ordem crescente.");
		System.out.println("10. Apagar um valor.");
		System.out.println("11. Imprimir vetor");
		System.out.println("0. Terminar programa.");
	}

	private static void menu(Scanner sc, double[] arr) {
		while (true) {
			showMenu();
			System.out.printf("Escolha a opção a executar: ");
			String input = sc.nextLine().trim();
			switch (input) {
				case "1":
					System.out.printf("O maior valor no vetor é %d.\n", Arrays.largest(arr));
					break;
				case "2":
					System.out.printf("O menor valor no vetor é %d.\n", Arrays.smallest(arr));
					break;
				case "3":
					System.out.printf("A média dos valores do vetor é %f.\n", Arrays.average(arr));
					break;
				case "4":
					System.out.printf("A média dos valores do vetor, excluindo o maior e o menor é %f.\n",
							Arrays.trimmedAverage(arr));
					break;
				case "5":
					System.out.printf("O índice do maior valor no vetor é %d.\n", Arrays.largestIndex(arr));
					break;
				case "6":
					System.out.printf("O índice do menor valor no vetor é %d.\n", Arrays.smallestIndex(arr));
					break;
				case "7": {
					System.out.printf("A inversão do vetor é:\n");
					printArray(Arrays.flip(arr));
					break;
				}
				case "8": {
					System.out.printf("O vetor ordenado por ordem decrescente é:\n");
					printArray(Arrays.bigToSmall(arr));
					break;
				}
				case "9": {
					System.out.printf("O vetor ordenado por ordem crescente é:\n");
					printArray(Arrays.smallToBig(arr));
					break;
				}
				case "10": {
					arr = Arrays.removeIndex(arr);
					System.out.printf("O novo vetor é:\n");
					printArray(arr);
					break;
				}
				case "11":
					printArray(arr);
					break;
				case "0":
					return;
				default:
					System.out.println("Opção inválida.");
			}
			// wait for input before reprinting menu
			System.out.printf("Press enter to continue.");
			sc.nextLine();
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double[] arr = null;
		try {
			arr = Arrays.scanDoubleArr("", 10, 1, 20);
		} catch (IllegalArgumentException e) {
			System.out.printf("Erro: %s\n", e);
			sc.close();
			return;
		}
		menu(sc, arr);
		sc.close();
		return;
	}
}
