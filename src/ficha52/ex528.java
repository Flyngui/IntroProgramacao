package ficha52;

public class ex528 {
	public static void main(String[] args) {
		long squaregrains = 1L;
		long totalgrains = 0L;
		for (int i = 1; i <= 64; i++) {
			totalgrains += squaregrains;
			squaregrains *= 2;
		}
		System.out.println(Long.toUnsignedString(totalgrains));
	}
}
