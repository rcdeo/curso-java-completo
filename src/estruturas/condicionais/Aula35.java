package estruturas.condicionais;

import java.util.Scanner;

public class Aula35 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int hora;

		System.out.println("Quantas horas?");
		hora = sc.nextInt();

//		As chaves sao opicionais (if-else) quando tem apenas um comando
		if (hora < 12) {
			System.out.println("Bom dia!");
		}
		else if (hora < 18) {
			System.out.println("Boa tarde!");
		}
		else {
			System.out.println("Boa noite!");
		}

		sc.close();
	}
}
