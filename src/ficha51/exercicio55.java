package ficha51;

public class exercicio55 {

	public static void main(String[] args) {

		int contador = 0;

		while (contador <= 20) {
			if (contador % 2 != 0 && contador % 3 == 0) {
				System.out.println(contador);
			}
			contador++;
		}

	}

}
