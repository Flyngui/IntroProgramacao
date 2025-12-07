package ficha31;

public class primeiro {
	public static void main(String[] args) {
		System.out.println("etapa 1");
		int numero1 = 07;
		int numero2 = 01;
		int numero3 = numero1 + numero2;
		System.out.println(numero1 + ", " + numero2 + ", " + numero3);
		System.out.println("\netapa 2");
		numero1 = 070;
		numero2 = 012;
		numero3 = numero1 + numero2;
		System.out.println(numero1 + ", " + numero2 + ", " + numero3);
		System.out.println("\netapa 3");
		numero1 = 0b101;
		numero2 = 0b10;
		numero3 = numero1 + numero2;
		System.out.println(numero1 + ", " + numero2 + ", " + numero3);
	}
}
/*
 * O output dá o resultado que dá porque um 0 à esquerda de int quer dizer que
 * está representado
 * em octal, 07 em octal é 7 e 070 é 56. O 0b101 significa que o numero está
 * representado em binário
 * logo 0b101 = 101 binário = 5
 */
