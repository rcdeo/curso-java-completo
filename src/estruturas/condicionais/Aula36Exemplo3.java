package estruturas.condicionais;

import java.util.Scanner;

public class Aula36Exemplo3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		if (a < b && a < c) {
			System.out.println("MENOR = " + a);
		} else if (b < c) {
			System.out.println("MENOR = " + b);
		} else {
			System.out.println("MENOR = " + c);
		}

		sc.close();
	}
}
