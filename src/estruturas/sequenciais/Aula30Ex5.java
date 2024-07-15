package estruturas.sequenciais;

import java.util.Locale;
import java.util.Scanner;

public class Aula30Ex5 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int codigo1, quantidade1, codigo2, quantidade2;
		double valor1, valor2, vlrTotal;

		codigo1 = sc.nextInt();
		quantidade1 = sc.nextInt();
		valor1 = sc.nextDouble();

		codigo2 = sc.nextInt();
		quantidade2 = sc.nextInt();
		valor2 = sc.nextDouble();

		vlrTotal = (quantidade1 * valor1) + (quantidade2 * valor2);

		System.out.println("++++++++++++++++++++++++++++++");
		System.out.println("Produtos:");
		System.out.printf("Cód.: %d | Quant.: %d | Preço: R$ %.2f%n", codigo1, quantidade1, valor1);
		System.out.printf("Cód.: %d | Quant.: %d | Preço: R$ %.2f%n", codigo2, quantidade2, valor2);
		System.out.println();
		System.out.printf("Valor a pagar: R$ %.2f%n", vlrTotal);
		System.out.println("++++++++++++++++++++++++++++++");

		sc.close();
	}
}
