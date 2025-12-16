package ficha51;

import java.util.Scanner;

public class exercicio53 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("insira o número de 1 a 5 ");
		int N = scan.nextInt();
		while (N > 5 || N < 0) {
			System.out.print("insira o número de 1 a 5 ");
		}

		int resultado = N;
		int contador = N;
		while (contador <= 10) {

			resultado = resultado + contador++;
			contador++;

		}
		System.out.print(resultado);
		scan.close();
	}

}
