package random;

public class inheritance {
	private static void sum1(int[] arr) {
		arr[0] += 1;
	}

	private static void sub1(int[] arr) {
		arr[1] -= 1;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4 };
		sum1(arr);
		sub1(arr);
		System.out.println(arr[0] + "" + arr[1]);
	}
}
