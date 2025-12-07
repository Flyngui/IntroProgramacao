package ficha31;

public class Exercicio_3_1_5_2 {
	public static void main(String[] args) {
		// DECLARAR
		boolean queroCasarComEla;
		int idade;
		boolean eViuva, eSolteira, eRica;
		System.out.print("Alinea a: ");
		idade = 25;
		eViuva = true;
		eSolteira = false;
		eRica = false;
		queroCasarComEla = ((idade >= 20 && idade <= 30) && (eViuva ^ eSolteira)) || eRica;
		System.out.println(queroCasarComEla);
		System.out.println();
		System.out.print("Alinea b: ");
		idade = 75;
		eViuva = false;
		eSolteira = false;
		eRica = true;
		queroCasarComEla = ((idade >= 20 && idade <= 30) && (eViuva ^ eSolteira)) || eRica;
		System.out.println(queroCasarComEla);
		// Confirmar o ou exclusivo
		System.out.println();
		System.out.print("Alinea b: ");
		idade = 75;
		eViuva = true;
		eSolteira = true;
		eRica = false;
		queroCasarComEla = ((idade >= 20 && idade <= 30) && (eViuva ^ eSolteira)) || eRica;
		System.out.println(queroCasarComEla);
	}
}
