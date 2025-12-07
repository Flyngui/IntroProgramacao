package ficha42;

import java.util.Scanner;

public class ex422 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduza o seu estado civil: (S)olteiro, (C)asado, (V)iúvo ou (D)ivorciado");
		String estadoCivil = sc.nextLine();
		char firstLetter = Character.toLowerCase(estadoCivil.charAt(0));
		switch (firstLetter) {
			case 's':
				System.out.println("Solteiro");
				break;
			case 'c':
				System.out.println("Casado");
				break;
			case 'v':
				System.out.println("Viúvo");
				break;
			case 'd':
				System.out.println("Divorciado");
				break;
			default:
				System.out.println("Não foi possivel ler o estado civil.");
				break;
		}
		sc.close();
		return;
	}
}
