package ficha7;

import java.util.Arrays;
import java.util.Scanner;

public class Ex72 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int nStudents = arrayLib.scanInt("Insira o número de alunos inscritos na UC:");
		String[] students = new String[nStudents];

		int nTests = arrayLib.scanInt("Insira o número de testes realizados:");
		double[][] grades = new double[nStudents][nTests];

		while (true) {
			printMenu1();
			System.out.printf("Escolha a opção a executar: ");
			String input = sc.nextLine().trim();
			switch (input) {
				// ler nomes dos alunos
				case "1":
					students = arrayLib.scanStringArr("Nome do aluno", nStudents);
					break;
				// ler grades[i][selectTest]
				case "2":
					int selectTest = arrayLib.scanIndex("Insira o teste para que quer inserir as notas:", nTests);
					matrixLib.scanDoubleRow(grades, "Nota", selectTest, 0, 20);
					break;
				// ler grades[selectStudent][j]
				case "3":
					int selectStudent = arrayLib.scanIndex("Insira o aluno para que quer inserir as notas", nTests);
					matrixLib.scanDoubleCol(grades, "Nota", selectStudent, 0, 20);
					break;
				case "4":
					matrixLib.scan2DDouble(grades, "Nota", 0, 20);
					break;
				case "5":
					System.out.printf("O índice do maior valor no vetor é %d.\n", arrayLib.largestIndex(arr));
					break;
				case "6":
					System.out.printf("O índice do menor valor no vetor é %d.\n", arrayLib.smallestIndex(arr));
					break;
				case "7": {
					System.out.printf("A inversão do vetor é:\n");
					arrayLib.printArray(arrayLib.flip(arr));
					break;
				}
				case "8": {
					System.out.printf("O vetor ordenado por ordem decrescente é:\n");
					arrayLib.printArray(arrayLib.bigToSmall(arr));
					break;
				}
				case "9": {
					System.out.printf("O vetor ordenado por ordem crescente é:\n");
					arrayLib.printArray(arrayLib.smallToBig(arr));
					break;
				}
				case "10": {
					arr = arrayLib.removeIndex(arr);
					System.out.printf("O novo vetor é:\n");
					arrayLib.printArray(arr);
					break;
				}
				case "11":
					arrayLib.printArray(arr);
					break;
				case "0":
					return;
				default:
					System.out.println("Opção inválida.");
			}
			// wait for input before reprinting menu
			System.out.printf("Press enter to continue.");
			sc.nextLine();
		}
		sc.close();
	};

	public static void printMenu1() {
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

	public static void printMenu2() {
		System.out.println("""
				10) Calcular a percentagem de positivas num determinado teste.
				11) Calcular a número de negativas num determinado teste.
				12) Indicar o teste em que houve mais negativas.
				13) Ordenar a pauta por ordem crescente dos nomes.
				14) Ordenar a pauta por ordem decrescente das notas de um determinado teste.
				15) Calcular o desvio padrão das notas num determinado teste.
				16) Indicar o teste em que as notas apresentam um menor desvio padrão.
				17) Calcular o número de notas inferiores à média de um determinado teste.
				18) Página 1;
				0) Sair
				""");
	}
}
