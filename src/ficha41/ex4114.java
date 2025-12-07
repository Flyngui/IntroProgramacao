package ficha41;

import java.util.Scanner;

public class ex4114 {
	public static void main(String[] args) {
		int tempoComparar = 7936;
		Scanner sc = new Scanner(System.in);
		System.out.printf("Insira as horas:");
		int hours = sc.nextInt();
		System.out.printf("Insira os minutos:");
		int minutes = sc.nextInt();
		System.out.printf("Insira os segundos:");
		int seconds = sc.nextInt();
		int tempoFormatado = (hours * 3600) + (minutes * 60) + seconds;
		if (tempoFormatado == tempoComparar) {
			System.out.printf("Os atletas empataram.\n");
		} else if (tempoFormatado < tempoComparar) {
			System.out.printf("Rui Silva perdeu.\n");
		} else if (tempoFormatado > tempoComparar) {
			System.out.printf("Rui Silva ganhou.\n");
		}
		sc.close();
		return;
	}
}
