package ficha31;

public class Ex_3_1_2_1 {
	public static void main(String[] args) {
		// DECLARAÇÃO DE VARIAVEIS
		int i1 = 5;
		@SuppressWarnings("unused")
		int i2;
		double r1 = 5.0;
		double r2;
		// PROCESSAMENTO
		System.out.println("i1 / 2.0 = " + i1 / 2.0);
		System.out.println("i1 / 2 = " + i1 / 2);
		System.out.println("r1 / 2 = " + r1 / 2);
		System.out.println("i1 mod 2 = " + i1 % 2);
		i2 = i1 / 2;
		System.out.println("i2 = " + i1 / 2);
		r2 = 3;
		System.out.println("r1 / r2 = " + r1 / r2);
		System.out.println("r1 % r2 = " + r1 % r2);
	}
}
