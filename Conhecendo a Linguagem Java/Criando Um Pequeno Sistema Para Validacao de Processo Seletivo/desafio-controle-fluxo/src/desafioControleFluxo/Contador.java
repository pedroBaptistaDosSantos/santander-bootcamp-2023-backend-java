package desafioControleFluxo;

import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite o primeiro valor:");
		int valor1 = scan.nextInt();
		System.out.println("Digite o segundo valor:");
		int valor2 = scan.nextInt();

		System.out.println("--------------------------------");
		System.out.println("Valores digitados: " + valor1 + " e " + valor2);

		try {
			contar(valor1, valor2);
		} catch (ParametrosInvalidosException error) {
			System.out.println(error.getMessage());
		}
	}

	static void contar(int valor1, int valor2) throws ParametrosInvalidosException {
		
		if (valor2 > valor1);
		else throw new ParametrosInvalidosException("O segundo valor deve ser maior que o primeiro!");
		
		System.out.println("Os valores não podem ser igual!");
		System.out.println("O segundo valor deve ser maior que o primeiro!");

		int contagem = valor2 - valor1;
		for (int i = 1; i <= contagem; i++) {
			System.out.println("imprimindo o número " + i);
		}
	}
}
