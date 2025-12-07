package ficha7;

public class Ex712 {
	public static void main(String[] args) {
		// Array of 50 ages (years)
		double[] ages = {
				24, 30, 18, 45, 60, 12, 5, 33, 29, 51,
				72, 40, 22, 19, 85, 36, 47, 55, 63, 28,
				9, 15, 31, 42, 50, 68, 77, 21, 26, 34,
				39, 44, 53, 59, 10, 8, 88, 70, 25, 32,
				48, 56, 62, 17, 23, 37, 41, 66, 74, 80
		};

		// Array of 50 weights (e.g., in kg)
		double[] weights = {
				65.5, 82.0, 58.3, 75.1, 90.2, 35.0, 18.5, 70.0, 62.8, 85.4,
				68.0, 77.2, 55.5, 60.1, 72.3, 64.9, 88.0, 79.5, 81.2, 59.0,
				28.4, 45.6, 71.0, 76.5, 83.2, 101, 67.5, 54.0, 66.8, 74.5,
				78.0, 80.5, 86.0, 95.5, 32.0, 25.5, 63.0, 73.0, 69.5, 75.8,
				84.0, 89.5, 91.0, 57.0, 61.5, 70.8, 72.5, 87.5, 76.0, 82.5
		};
		System.out.printf("Média de idades: %f\n", Arrays.average(ages));
		System.out.printf("Média dos pesos: %f\n", Arrays.average(weights));
		System.out.printf("Número de pessoas que pesam mais de 50kg: %d\n", Arrays.moreThan(weights, 50.0));
		System.out.printf("Número de pessoas que pesam mais de 100kg: %d\n", Arrays.moreThan(weights, 100.0));
		System.out.printf("Número de pessoas que pesam menos de 30kg: %d\n", Arrays.lessThan(weights, 30.0));
		System.out.printf("Número de pessoas que pesam mais do que a média dos pesos: %d\n",
				Arrays.lessThan(weights, Arrays.average(weights)));
		return;
	}
}


