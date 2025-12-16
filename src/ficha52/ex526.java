package ficha52;

public class ex526 {
	public static void main(String[] args) {
		for (int i = 100; i < 1000; i++) {
			int digit1 = i % 10;
			int digit2 = (i / 10) % 10;
			int digit3 = (i / 100);
			int sum = power3(digit1) + power3(digit2) + power3(digit3);

			if (sum == i) {
				System.out.println(sum);
			}
		}
	}

	private static int power3(int digit) {
		return (digit * digit * digit);
	}
}
