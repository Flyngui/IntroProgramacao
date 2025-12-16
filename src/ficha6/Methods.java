package ficha6;

public class Methods {
	public static double avg(double n1, double n2, double n3) {
		return (n1 + n2 + n3) / 3;
	}

	public static double square(double n) {
		return n * n;
	}

	public static double cube(double n) {
		return n * n * n;
	}

	public static double sqrt(double n) {
		return Math.sqrt(n);
	}

	public static boolean isPositive(double n) {
		return n >= 0;
	}

	public static boolean isNegative(double n) {
		return n < 0;
	}

	public static boolean isZero(double n) {
		return n == 0;
	}

	public static int roundUp(double n) {
		if ((int) n == n) {
			return (int) n;
		} else {
			return (int) n + 1;
		}
	}

	public static int roundDown(double n) {
		return (int) n;
	}

	public static double hypothenuse(double c1, double c2) {
		return square(c1) + square(c2);
	}

	public static double circleArea(double radius) {
		return Math.PI * square(radius);
	}

	public static double circlePerimeter(double radius) {
		return 2 * (Math.PI * radius);
	}

	public static boolean isEqual(double n1, double n2) {
		return n1 == n2;
	}

	public static double harmonicAvg(double n1, double n2) {
		return 2 / ((1 / n1) + (1 / n2));
	}

	public static double harmonicAvgThree(double n1, double n2, double n3) {
		return 3 / ((1 / n1) + (1 / n2) + (1 / n3));
	}

	public static double absDifference(double n1, double n2) {
		double difference = n1 - n2;
		if (difference < 0) {
			difference *= -1;
		}
		return difference;
	}
}
