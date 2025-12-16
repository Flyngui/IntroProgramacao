package ficha51;

import java.util.Scanner;

public class exercicio514 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("insira o numero de vezes");
		int n = scan.nextInt();
		int contador = 0;
		int sequencia = 0;
		int n1 = 0;
		int n2 = 1;
		System.out.println("0");
		System.out.println("1");
		while (n >= contador) {

			sequencia = n1 + n2;
			System.out.println(sequencia);
			n1 = n2;
			n2 = sequencia;

			contador++;
		}
		scan.close();

	}

}
