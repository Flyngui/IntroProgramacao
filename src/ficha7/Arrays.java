package ficha7;

import java.util.Scanner;

public class Arrays {
	// scans lenght values for an array that is lenght long, the values must be
	// between min and max
	public static double[] scanDoubleArr(String prompt, int lenght, double min, double max) {
		if (lenght <= 0)
			throw new IllegalArgumentException("Tamanho para array inválido.");
		Scanner sc = new Scanner(System.in);
		double[] arr = new double[lenght];
		for (int i = 0; i < lenght; i++) {
			if (min == Double.MIN_VALUE || max == Double.MAX_VALUE) {
				System.out.printf("%s para a posição %d:", prompt, i);
			} else {
				System.out.printf("Insira %s no intervalo [%f, %f] para a posição %d: ", prompt, min, max, i);
			}
			if (sc.hasNextDouble()) {
				double n = sc.nextInt();
				if (n >= min && n <= max) {
					arr[i] = n;
				} else {
					i--; // retry index
					System.out.println("O valor tem de estar no intervalo para ser válido.");
				}
			} else {
				sc.next();
				i--; // retry index
				System.out.println("O valor tem de estar no intervalo para ser válido.");
			}
		}
		return arr;
	}

	// scan de um array de strings
	public static String[] scanStringArr(String prompt, int lenght) {
		if (lenght <= 0)
			throw new IllegalArgumentException("Tamanho para array inválido.");
		Scanner sc = new Scanner(System.in);
		String[] arr = new String[lenght];
		for (int i = 0; i < lenght; i++) {
			System.out.printf("%s para a posição %d: ", prompt, i);
			if (sc.hasNextLine()) {
				String str = sc.nextLine();
				if (!str.isEmpty()) {
					arr[i] = str;
				} else {
					i--; // retry index
					System.out.println("Insira um string válido.");
				}
			} else {
				sc.next();
				i--; // retry index
				System.out.println("Insira um string válido.");
			}
		}
		return arr;
	}

	// scans stdin for a valid index value for an array
	public static int scanIndex(String prompt, int lenght) {
		if (lenght <= 0)
			throw new IllegalArgumentException("Tamanho para array inválido.");
		Scanner sc = new Scanner(System.in);
		int n = 0;
		System.out.printf("Length: %d\n", lenght - 1);
		while (true) {
			System.out.printf("%s ", prompt);
			if (sc.hasNextInt()) {
				n = sc.nextInt();
				if (n < lenght && n >= 0) {
					sc.nextLine(); // consumes extra \n leftover from nextInt()
					break;
				} else {
					System.out.println("Deve introduzir um índice válido para o tamanho do array.");
				}
			} else {
				sc.next();
			}
		}
		return n;
	}

	// finds the largest value in the array
	public static double largest(double[] arr) {
		if (arr == null || arr.length == 0)
			return 0;
		double largest = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (largest < arr[i])
				largest = arr[i];
		}
		return largest;
	}

	// finds the largest value's index
	public static int largestIndex(double[] arr) {
		if (arr == null || arr.length == 0)
			return 0;
		double largest = arr[0];
		int largestIndex = 0;
		for (int i = 0; i < arr.length; i++) {
			if (largest < arr[i]) {
				largest = arr[i];
				largestIndex = i;
			}
		}
		return largestIndex;
	}

	// finds the smallest value
	public static double smallest(double[] arr) {
		if (arr == null || arr.length == 0)
			return 0;
		double smallest = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (smallest > arr[i])
				smallest = arr[i];
		}
		return smallest;
	}

	// finds the smallest value's index
	public static int smallestIndex(double[] arr) {
		if (arr == null || arr.length == 0)
			return 0;
		double smallest = arr[0];
		int smallestIndex = 0;
		for (int i = 0; i < arr.length; i++) {
			if (smallest > arr[i]) {
				smallest = arr[i];
				smallestIndex = i;
			}
		}
		return smallestIndex;
	}

	// finds the normal average of an array
	public static double average(double[] arr) {
		if (arr == null || arr.length == 0)
			return 0;
		double sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum / arr.length;
	}

	// finds an array's average not counting a single instance of the largest and
	// smallest value
	public static double trimmedAverage(double[] arr) {
		if (arr == null || arr.length <= 2)
			return 0;
		double sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		sum -= Arrays.largest(arr) + Arrays.smallest(arr);
		return sum / (arr.length - 2);
	}

	// flips an array
	public static double[] flip(double[] arr) {
		double[] flipped = new double[arr.length];
		int j = 0;
		for (int i = arr.length - 1; i >= 0; i--) {
			flipped[j] = arr[i];
			j++;
		}
		return flipped;
	}

	// sort an array in descending order
	public static double[] bigToSmall(double[] arr) {
		double[] ordered = arr.clone();
		for (int i = 0; i < ordered.length - 1; i++) {
			for (int j = i + 1; j < ordered.length; j++) {
				if (ordered[i] < ordered[j]) {
					double temp = ordered[j];
					ordered[j] = ordered[i];
					ordered[i] = temp;
				}
			}
		}
		return ordered;
	}

	// sort an array in ascending order
	public static double[] smallToBig(double[] arr) {
		double[] ordered = arr.clone();
		for (int i = 0; i < ordered.length - 1; i++) {
			for (int j = i + 1; j < ordered.length; j++) {
				if (ordered[i] > ordered[j]) {
					double temp = ordered[j];
					ordered[j] = ordered[i];
					ordered[i] = temp;
				}
			}
		}
		return ordered;
	}

	// remove the value in an index and push all values one to the left so that the
	// empty value is at the end
	public static double[] removeIndex(double[] arr) {
		if (arr == null || arr.length == 0) {
			System.out.println("Erro: O array está vazio.");
			return arr;
		}
		// new array
		double[] arrClone = arr.clone();
		int index = scanIndex("Introduza o índice para remover:", arrClone.length);
		// puxa todos para a esquerda até ao penultimo
		while (index < arrClone.length - 2) {
			arrClone[index] = arrClone[index + 1];
			index++;
		}
		// garante que o ultimo esta vazio
		arrClone[arrClone.length - 1] = 0;
		return arrClone;
	}

	// how many values are higher than n
	public static int moreThan(double[] arr, double n) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >= n) {
				count++;
			}
		}
		return count;
	}

	// how many values are less than n
	public static int lessThan(double[] arr, double n) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] <= n) {
				count++;
			}
		}
		return count;
	}

	// Prints any type of array by overloading the method (means that the compiler
	// selects the correct method for the input)
	// <T> and T[] are generic Object Types, meaning they can take any Object
	// (String, Double) and work correctly
	public static <T> void printArray(T[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("arr[%d]: %s; ", i, arr[i]);
		}
		System.out.println();
	}

	// overload printArray to int[]
	public static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("arr[%d]: %s; ", i, arr[i]);
		}
		System.out.println();
	}

	// overload printArray to double[]
	public static void printArray(double[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("arr[%d]: %s; ", i, arr[i]);
		}
		System.out.println();
	}
}
