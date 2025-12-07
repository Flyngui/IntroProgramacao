package ficha51;

import java.util.Random;

public class exercicio58 {

	public static void main(String[] args) {

		Random rand = new Random();
		int carta1, carta2, carta3, carta4, carta5;
		int numerodevezes = 0;

		do {
			numerodevezes++;
			carta1 = rand.nextInt(13);
			carta2 = rand.nextInt(13);
			carta3 = rand.nextInt(13);
			carta4 = rand.nextInt(13);
			carta5 = rand.nextInt(13);
		} while (!((carta1 == carta2 && carta1 == carta3 && carta1 == carta4) ||
				(carta1 == carta2 && carta1 == carta3 && carta1 == carta5) ||
				(carta1 == carta2 && carta1 == carta4 && carta1 == carta5) ||
				(carta1 == carta3 && carta1 == carta4 && carta1 == carta5) ||
				(carta2 == carta3 && carta2 == carta4 && carta2 == carta5)));
		System.out.println("demorou " + numerodevezes + " tentavias ate vir um poker");
	}

}
