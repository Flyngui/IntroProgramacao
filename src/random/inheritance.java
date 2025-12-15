package random;

public class inheritance {
	private static void sum1(int[] arr) {
		arr[0]++;
	}

	private static void sub1(int[] arr) {
		arr[1]--;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4 };
		sum1(arr);
		sub1(arr);
		System.out.printf("%d %d\n", arr[0], arr[1]);
	}
}
