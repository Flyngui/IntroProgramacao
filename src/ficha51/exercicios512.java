package ficha51;

public class exercicios512 {

	public static void main(String[] args) {
		double ze = 1.10;
		double to = 1.40;
		int numeroanos = 0;

		do {

			ze = ze + 0.03;
			to = to + 0.02;
			numeroanos++;
		} while (to > ze);
		{
			System.out.println("demora " + numeroanos + " anos para o ze ficar maior que o to");
		}

	}

}
