package ficha7;

import java.util.Scanner;

public class Ex72 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int nStudents = arrayLib.scanInt("Insira o número de alunos inscritos na UC:");
		String[] students = new String[nStudents];

		int nTests = arrayLib.scanInt("Insira o número de testes realizados:");
		double[][] grades = new double[nStudents][nTests];

		boolean blockMenu1 = false;
		while (true) {
			if (blockMenu1 == false) {
				printMenu1();
			} else {
				printMenu2();
			}
			System.out.printf("Escolha a opção a executar: ");
			String input = sc.nextLine().trim();
			switch (input) {
				// ler nomes dos alunos
				case "1" -> students = arrayLib.scanStringArr("Nome do aluno", nStudents);
				// ler grades[i][selectTest]
				case "2" -> {
					int selectTest = arrayLib.scanIndex("Insira o teste para que quer inserir as notas:", nTests);
					matrixLib.scanDoubleRow(grades, "Nota", selectTest, 0, 20);
				}
				// ler grades[selectStudent][j]
				case "3" -> {
					int selectStudent = arrayLib.scanIndex("Insira o aluno para que quer inserir as notas", nTests);
					matrixLib.scanDoubleCol(grades, "Nota", selectStudent, 0, 20);
				}
				// ler tudo
				case "4" -> matrixLib.scan2DDouble(grades, "Nota", 0, 20);
				// dar bonus a todos os alunos em selectTest com nota min
				case "5" -> {
					int selectTest = arrayLib.scanIndex("Insira o teste para dar o bónus:", nTests);
					double min = arrayLib.scanDouble("Insira a nota a partir da qual quer dar o bonus:");
					double bonus = arrayLib.scanDouble("Insira o bonus para adicionar às notas:");
					matrixLib.colBonusMoreThan(grades, selectTest, min, bonus);
				}
				// arredondar selTest a c casas decimais
				case "6" -> {
					int selTest = arrayLib.scanIndex("Insira o teste para arredondar:", nTests);
					int cDecimais = arrayLib.scanIntInterval("insira o número de casas decimais para arredondamento",
							0, 3);
					matrixLib.colRound(grades, selTest, cDecimais);
				}
				// calcular a média de 1 teste selTest
				case "7" -> {
					int selTest = arrayLib.scanIndex("Insira o teste para calcular a média:", nTests);
					double avg = matrixLib.colAverage(grades, selTest);
					System.out.printf("A média do teste %d, é %.2f\n", selTest, avg);
				}
				// média de 1 aluno selStudent
				case "8" -> {
					int selStudent = arrayLib.findIndex("Insira o nome do aluno para calcular a média:", students);
					if (selStudent == -1) {
						System.out.println("O aluno não consta na lista da UC.");
						break;
					}
					double avg = matrixLib.rowAverage(grades, selStudent);
					System.out.printf("A média do aluno %s, é %.2f\n", students[selStudent], avg);
				}
				// switch to second menu screen
				case "9" -> blockMenu1 = true;
				// percentagem de positivas no teste selTest
				case "10" -> {
					int selTest = arrayLib.scanIndex("Insira o teste para calcular a percentagem de positivas:",
							nTests);
					int positives = matrixLib.colMoreThan(grades, selTest, 9.50);
					System.out.println(positives);
					System.out.printf("Percentagem de positivas no teste %d: %.2f%%.\n", selTest,
							(positives / (double) nStudents) * 100.0);
				}
				// número de negativas no teste selTest
				case "11" -> {
					int selTest = arrayLib.scanIndex("Insira o teste para calcular a percentagem de positivas:",
							nTests);
					System.out.printf("O número de negativas no teste %d foi %d.\n", selTest,
							matrixLib.colLessThan(grades, selTest, 9.49));
				}
				// teste em que houve mais negativas
				case "12" -> System.out.printf("O teste com mais negativas foi o teste %d.\n",
						matrixLib.colCompareDown(grades, nTests, 9.49));
				case "17" -> {
					int selTest = arrayLib.scanIndex("Insira o teste para calcular a percentagem de positivas:",
							nTests);
					double avg = matrixLib.colAverage(grades, selTest);
					System.out.printf("Número de notas inferiores à média %.2f no teste %d: %d.\n", avg, selTest,
							matrixLib.colLessThan(grades, selTest, avg));
				}
				case "18" -> printUC(students, grades);
				case "19" -> blockMenu1 = false;
				case "0" -> {
					sc.close();
					return;
				}
				default -> System.out.println("Opção inválida.");
			}
			// if switching menu do not wait for input
			if (!input.equals("9") && !input.equals("19")) {
				// wait for input before reprinting menu
				System.out.printf("Press enter to continue.");
				sc.nextLine();
			}
		}
	};

	private static void printUC(String[] students, double[][] grades) {
		for (int i = 0; i < students.length && i < grades.length; i++) {
			System.out.printf("Aluno %s: ", students[i]);
			for (int j = 0; j < grades[i].length; j++) {
				System.out.printf("%.2f, ", grades[i][j]);
			}
			System.out.println("");
		}
	}

	private static void printMenu1() {
		System.out.println("""
				1) Ler os nomes de todos os alunos;
				2) Ler as notas de todos os alunos num determinado teste.
				3) Ler as notas de um determinado aluno em todos os testes.
				4) Ler as notas de todos os alunos em todos os testes.
				5) Dar um bónus b a todos os alunos que tiveram mais de v valores no teste t.
				6) Arredondar as notas dum determinado teste a c casas decimais.
				7) Calcular a média das notas num determinado teste.
				8) Calcular a média das notas de um determinado aluno.
				9) Página 2.
				0) Fechar programa.
				""");
	}

	private static void printMenu2() {
		System.out.println("""
				10) Calcular a percentagem de positivas num determinado teste.
				11) Calcular a número de negativas num determinado teste.
				12) Indicar o teste em que houve mais negativas.
				13) Ordenar a pauta por ordem crescente dos nomes.
				14) Ordenar a pauta por ordem decrescente das notas de um determinado teste.
				15) Calcular o desvio padrão das notas num determinado teste.
				16) Indicar o teste em que as notas apresentam um menor desvio padrão.
				17) Calcular o número de notas inferiores à média de um determinado teste.
				18) Imprimir alunos e notas.
				19) Página 1;
				0) Fechar programa.
				""");
	}
}
