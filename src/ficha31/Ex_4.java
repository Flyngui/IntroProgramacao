package ficha31;

public class Ex_4 {
	public static void main(String[] args) {
		int a = 0b00000101;
		int b = 0b00000011;
		System.out.println(a);
		System.out.println(b);
		System.out.println(a & b); // 00000001 = 1
		System.out.println(a | b); // 00000111 = 7
		System.out.println(a ^ b); // 00000110 = 6
		System.out.println(~a); // 11111010 = -6
	}
}
