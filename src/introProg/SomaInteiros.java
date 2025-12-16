package introProg;

public class SomaInteiros {
	public static void main(String[] args) {
		String texto = "inicio";
		System.out.println(texto);
		m2();
		m3();
		System.out.println("fim");
	}

	public static void m2() {
		int n1 = 10;
		int n2;
		n2 = 20;
		int soma = n1 + n2;
		System.out.println("soma = " + soma);
	}

	public static void m3() {
		int n1 = 15;
		int n2 = 5;
		int subtract = n1 - n2;
		System.out.println("subtract = " + subtract);
	}
}
