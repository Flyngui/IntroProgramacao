package ficha51;

import java.util.Scanner;

public class exercicio56 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Insira a espessura(superior a 1");
		double espessura = scan.nextDouble();

		double contador = 0.074;
		int numerodevezes = 0;
		while (contador <= espessura) {
			contador = contador + contador;
			numerodevezes++;

		}
		System.out.println(
				"sao necessarias " + numerodevezes + " dobragens para chegar a " + contador + "mm de espessura");
		scan.close();
	}

}
