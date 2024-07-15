package estruturas.sequenciais;

import java.util.Scanner;

public class Aula30Ex1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n1, n2, soma;

		n1 = sc.nextInt();
		n2 = sc.nextInt();
		soma = n1 + n2;

		System.out.println("Entrada:");
		System.out.println(n1);
		System.out.println(n2);
		System.out.println("Saída:");
		System.out.println("Soma = " + soma);

		sc.close();
	}
}
