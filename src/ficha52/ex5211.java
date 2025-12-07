package ficha52;

public class ex5211 {
	public static void main(String[] args) {
		double pi = 1;
		double mathPi = Math.PI;
		for (int i = 1; i <= 2147483640; i += 4) {
			pi += -(1.0 / (i + 2)) + (1.0 / (i + 4));
		}
		pi *= 4;
		System.out.println(pi);
		System.out.println(mathPi);
		System.out.println(mathPi - pi);
	}
}
