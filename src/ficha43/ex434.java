package ficha43;

public class ex434 {
	public class TernarioAninhado {
		public static void main(String[] args) {
			int idade = 25;
			boolean estudante = true;
			// Uso de operadores ternários aninhados
			String categoria = (idade < 12) ? "Criança"
					// se idade for menor que 12 imprime logo Criança sem testar as outras condições
					: (idade < 18) ? "Adolescente"
							// se idade for menor que 18 imprime logo Adolescente sem testar as outras
							// condições
							: (idade < 60) ? (estudante ? "Adulto Estudante" : "Adulto")
									// se idade for maior que 60 testa se estudante é verdadeiro, e se for
									// verdadeiro imprime Adulto Estudante, senão imprime apenas adulto
									: "Idoso";
			// caso nenhuma das condições anteriores forem verdadeiras imprime Idoso
			System.out.println("Classificação: " + categoria);
		}
	}
}
