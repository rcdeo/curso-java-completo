package estruturas.condicionais;

import java.util.Locale;
import java.util.Scanner;

public class Aula37Ex5 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int codigo = sc.nextInt();
		int quantidade = sc.nextInt();

		double item1 = 4.0;
		double item2 = 4.5;
		double item3 = 5.0;
		double item4 = 2.0;
		double item5 = 1.5;

		double preco = 0.0;

		if (codigo == 1) {
			preco = item1;
		} else if (codigo == 2) {
			preco = item2;
		} else if (codigo == 3) {
			preco = item3;
		} else if (codigo == 4) {
			preco = item4;
		} else if (codigo == 5) {
			preco = item5;
		} else {
			System.out.println("Código do item inválido");
		}

		double total = quantidade * preco;

		System.out.printf("Total: R$ %.2f%n", total);
	}
}
