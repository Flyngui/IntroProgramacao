package random;

import java.util.Scanner;

public class Exstring {
	public static String CREATOR_NAME = "LOPES";
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String first = scanString(sc, "Insira o nome proprio: ");
		String last = scanString(sc, "Insira o apelido: ");
		String full = first + " " + last;
		while (true) {
			showMenu();
			String input = scanString(sc, "Escolha a opção a executar: ");
			switch (input) {
				case "1":
					System.out.printf("%s %s\n", first, last);
					break;
				case "2":
					System.out.printf("O número de caracteres do nome "
							+ "(incluindo espaços) é: %d\n", full.length());
					break;
				case "3":
					System.out.println(last.toUpperCase());
					break;
				case "4":
					System.out.println(full.charAt(0));
					break;
				case "5":
					System.out.println(full.charAt(full.length() - 2));
					break;
				case "6":
					System.out.println(full.replace(" ", ""));
					break;
				case "7":
					System.out.println(full.replace(" ", "_"));
					break;
				case "8":
					System.out.println(CREATOR_NAME.equals(last.toUpperCase()));
					break;
				case "9":
					first = scanString(sc, "Insira o nome proprio: ");
					last = scanString(sc, "Insira o apelido: ");
					full = first + " " + last;
					break;
				case "0":
					sc.close();
					return;
				default:
					System.out.println("Opção inválida.");
			}
			// wait for input before reprinting menu
			System.out.printf("Press enter to continue.");
			sc.nextLine();
		}
	}

	private static void showMenu() {
		System.out.println("1. Apresentar o nome completo da pessoa.");
		System.out.println("2. Apresentar a quantidade de caracteres do nome completo da pessoa.");
		System.out.println("3. Apresentar o apelido em letras maiusculas.");
		System.out.println("4. Apresentar o primeiro caractere do nome.");
		System.out.println("5. Apresentar o penultimo caractere do nome.");
		System.out.println("6. Apresentar o nome completo sem espaço.");
		System.out.println("7. Apresentar o nome substituindo o espaço por um '_'.");
		System.out.println("8. Comparar apelido inserido com apelido do criador do programa.");
		System.out.println("9. Reintroduzir nomes.");
		System.out.println("0. Terminar programa.");
	}

	private static String scanString(Scanner sc, String prompt) {
		String str = null;
		while (true) {
			System.out.printf("%s", prompt);
			if (sc.hasNextLine()) {
				str = sc.nextLine().trim();
				if (!str.isEmpty())
					break;
			} else {
				sc.next();
			}
		}
		return str;
	}
}
