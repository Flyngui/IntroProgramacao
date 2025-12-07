package ficha42;

import java.util.Scanner;

public class ex423 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduza o seu estado civil: (S)olteiro, (C)asado, (V)iúvo ou (D)ivorciado");
		String estadoCivil = sc.nextLine();
		char firstLetter = Character.toLowerCase(estadoCivil.charAt(0));
		char lastLetter = Character.toLowerCase(estadoCivil.charAt(estadoCivil.length() - 1));
		switch (lastLetter) {
			case 'o':
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
				}
				break;
			case 'a':
				switch (firstLetter) {
					case 's':
						System.out.println("Solteira");
						break;
					case 'c':
						System.out.println("Casada");
						break;
					case 'v':
						System.out.println("Viúva");
						break;
					case 'd':
						System.out.println("Divorciada");
						break;
				}
				break;
			default:
				System.out.println("Não foi possivel ler o estado civil.");
				break;
		}
		sc.close();
		return;
	}
}
