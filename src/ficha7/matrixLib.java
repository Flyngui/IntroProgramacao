package ficha7;

import java.util.Scanner;

public class matrixLib {
	// Scan a matrix of doubles. If specified values must be between min and max,
	// else set these values to Double.MIN_VALUE and Double.MAX_VALUE respectively
	// and they will be ignored.
	public static void scan2DDouble(double[][] arr, String prompt, double min, double max) {
		if (arr == null || arr.length == 0 || arr[0].length == 0)
			throw new IllegalArgumentException("Array inválido.");
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (min == Double.MIN_VALUE || max == Double.MAX_VALUE) {
					System.out.printf("%s para a posição arr[%d][%d]:", prompt, i, j);
				} else {
					System.out.printf("%s no intervalo [%.2f, %.2f] para a posição arr[%d][%d]: ", prompt, min,
							max, i, j);
				}
				if (sc.hasNextDouble()) {
					double n = sc.nextDouble();
					if (n >= min && n <= max) {
						arr[i][j] = n;
					} else {
						j--; // retry index
						System.out.println("O valor tem de estar no intervalo para ser válido.");
					}
				} else {
					sc.next();
					j--; // retry index
					System.out.println("Valor inserido é inválido.");
				}
			}
		}
	}

	// Scan a matrix of doubles. If specified values must be between min and max.
	// When requesting double[x][y] the value in whatFor[x] will be printed in the
	// request line
	public static void scan2DDouble(double[][] arr, String prompt, double min, double max, String[] whatFor) {
		if (arr == null || arr.length == 0 || arr[0].length == 0)
			throw new IllegalArgumentException("Array inválido.");
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (min == Double.MIN_VALUE || max == Double.MAX_VALUE) {
					System.out.printf("%s para a posição arr[%d][%d], que corresponde a %s:", prompt, i, j, whatFor[i]);
				} else {
					System.out.printf("%s no intervalo [%.2f, %.2f] para a posição arr[%d][%d], que corresponde a %s: ",
							prompt, min, max, i, j, whatFor[i]);
				}
				if (sc.hasNextDouble()) {
					double n = sc.nextDouble();
					if (n >= min && n <= max) {
						arr[i][j] = n;
					} else {
						j--; // retry index
						System.out.println("O valor tem de estar no intervalo para ser válido.");
					}
				} else {
					sc.next();
					j--; // retry index
					System.out.println("Valor inserido é inválido.");
				}
			}
		}
	}

	// Scan a row (selectRow) of a matrix of doubles. If specified values must be
	// between minand max, else set these values to Double.MIN_VALUE and
	// Double.MAX_VALUE respectively
	// and they will be ignored.
	public static void scanDoubleRow(double[][] arr, String prompt, int selectRow, double min, double max) {
		if (arr == null || arr.length == 0 || arr[0].length == 0)
			throw new IllegalArgumentException("Array inválido.");
		Scanner sc = new Scanner(System.in);
		for (int j = 0; j < arr[selectRow].length; j++) {
			if (min == Double.MIN_VALUE || max == Double.MAX_VALUE) {
				System.out.printf("%s para a posição arr[%d][%d]:", prompt, selectRow, j);
			} else {
				System.out.printf("%s no intervalo [%.2f, %.2f] para a posição arr[%d][%d]: ", prompt, min,
						max, selectRow, j);
			}
			if (sc.hasNextDouble()) {
				double n = sc.nextDouble();
				if (n >= min && n <= max) {
					arr[selectRow][j] = n;
				} else {
					j--; // retry index
					System.out.println("O valor tem de estar no intervalo para ser válido.");
				}
			} else {
				sc.next();
				j--; // retry index
				System.out.println("Valor inserido é inválido.");
			}
		}
	}

	// Scan a column (selectCol) of a matrix of doubles. If specified values must be
	// between min and max, else set these values to Double.MIN_VALUE and
	// Double.MAX_VALUE respectively
	// and they will be ignored.
	public static void scanDoubleCol(double[][] arr, String prompt, int selectCol, double min, double max) {
		if (arr == null || arr.length == 0 || arr[0].length == 0)
			throw new IllegalArgumentException("Array inválido.");
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < arr.length; i++) {
			if (min == Double.MIN_VALUE || max == Double.MAX_VALUE) {
				System.out.printf("%s para a posição arr[%d][%d]:", prompt, i, selectCol);
			} else {
				System.out.printf("Insira %s no intervalo [%.2f, %.2f] para a posição arr[%d][%d]: ", prompt, min,
						max, i, selectCol);
			}
			if (sc.hasNextDouble()) {
				double n = sc.nextDouble();
				if (n >= min && n <= max) {
					arr[i][selectCol] = n;
				} else {
					i--; // retry index
					System.out.println("O valor tem de estar no intervalo para ser válido.");
				}
			} else {
				sc.next();
				i--; // retry index
				System.out.println("Valor inserido é inválido.");
			}
		}
	}

	public static int colMoreThan(double[][] arr, int selCol, double min) {
		if (arr == null || arr.length == 0 || arr[0].length == 0)
			throw new IllegalArgumentException("Array inválido.");
		int count = 0;
		for (double[] row : arr) {
			if (row[selCol] >= min) {
				count += 1;
			}
		}
		return count;
	}

	public static int colLessThan(double[][] arr, int selCol, double max) {
		if (arr == null || arr.length == 0 || arr[0].length == 0)
			throw new IllegalArgumentException("Array inválido.");
		int count = 0;
		for (double[] row : arr) {
			if (row[selCol] <= max) {
				count += 1;
			}
		}
		return count;
	}

	public static void colBonusMoreThan(double[][] arr, int selCol, double min, double bonus) {
		if (arr == null || arr.length == 0 || arr[0].length == 0)
			throw new IllegalArgumentException("Array inválido.");
		for (double[] row : arr) {
			if (row[selCol] >= min) {
				row[selCol] += bonus;
			}
		}
	}

	public static void colRound(double[][] arr, int selCol, int cDecimais) {
		if (arr == null || arr.length == 0 || arr[0].length == 0)
			throw new IllegalArgumentException("Array inválido.");
		for (double[] row : arr) {
			switch (cDecimais) {
				case 0 -> row[selCol] = Math.round(row[selCol]);
				case 1 -> row[selCol] = Math.round(row[selCol] * 10) / 10.0;
				case 2 -> row[selCol] = Math.round(row[selCol] * 100) / 100.0;
				case 3 -> row[selCol] = Math.round(row[selCol] * 1000) / 1000.0;
			}
		}
	}

	public static double colAverage(double[][] arr, int selCol) {
		if (arr == null || arr.length == 0 || arr[0].length == 0)
			throw new IllegalArgumentException("Array inválido.");
		int count = 0;
		double sum = 0;
		for (double[] row : arr) {
			sum += row[selCol];
			count += 1;
		}
		return sum / count;
	}

	public static double rowAverage(double[][] arr, int selRow) {
		if (arr == null || arr.length == 0 || arr[0].length == 0)
			throw new IllegalArgumentException("Array inválido.");
		int count = 0;
		double sum = 0;
		for (int j = 0; j < arr[selRow].length; j++) {
			sum += arr[selRow][j];
			count += 1;
		}
		return sum / count;
	}

	// compares every row for highest count above min
	public static int colCompareUp(double[][] arr, double min) {
		if (arr == null || arr.length == 0 || arr[0].length == 0)
			throw new IllegalArgumentException("Array inválido.");
		int count = 0;
		int highest = 0;
		int index = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] >= min) {
					count += 1;
				}
			}
			if (highest <= count) {
				highest = count;
				index = i;
			}
		}
		return index;
	}

	// compares every row for highest count below max
	public static int colCompareDown(double[][] arr, int nTests, double max) {
		if (arr == null || arr.length == 0 || arr[0].length == 0)
			throw new IllegalArgumentException("Array inválido.");
		int count = 0;
		int highest = 0;
		int index = 0;
		for (int col = 0; col < nTests; col++) {
			count = colLessThan(arr, col, max);
			if (highest < count) {
				highest = count;
				index = col;
			}
		}
		return index;
	}
}
