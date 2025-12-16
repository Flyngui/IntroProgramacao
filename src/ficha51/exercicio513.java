package ficha51;

import java.util.Scanner;

public class exercicio513 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Introduza os 8 primeiros dígitos do NIF: ");
		String nif8 = sc.nextLine();

		int soma = 0;
		int multiplicador = 9;
		int i = 0;

		while (i < 8) {
			int digito = Character.getNumericValue(nif8.charAt(i));
			soma = soma + digito * multiplicador;
			multiplicador = multiplicador - 1;
			i = i + 1;
		}

		int resto = soma % 11;
		int digitoControlo;

		if (resto == 0 || resto == 1) {
			digitoControlo = 0;
		} else {
			digitoControlo = 11 - resto;
		}

		System.out.println("O dígito de controlo é: " + digitoControlo);
		System.out.println("O NIF completo é: " + nif8 + digitoControlo);

		System.out.print("\nIntroduza um NIF completo (9 dígitos) para validar: ");
		String nif = sc.nextLine();

		soma = 0;
		multiplicador = 9;
		i = 0;

		while (i < 8) {
			int digito = Character.getNumericValue(nif.charAt(i));
			soma = soma + digito * multiplicador;
			multiplicador = multiplicador - 1;
			i = i + 1;
		}

		resto = soma % 11;

		if (resto == 0 || resto == 1) {
			digitoControlo = 0;
		} else {
			digitoControlo = 11 - resto;
		}

		int digitoFinal = Character.getNumericValue(nif.charAt(8));

		System.out.println("Dígito de controlo calculado: " + digitoControlo);
		System.out.println("Dígito final do NIF: " + digitoFinal);

		if (digitoControlo == digitoFinal) {
			System.out.println("O NIF é válido!");
		} else {
			System.out.println("O NIF é inválido!");
		}

		sc.close();
	}

}
