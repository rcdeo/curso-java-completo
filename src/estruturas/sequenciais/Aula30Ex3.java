package estruturas.sequenciais;

import java.util.Scanner;

public class Aula30Ex3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a, b, c, d, resultado;
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();

		resultado = (a * b - c * d);
		System.out.println("Resultado: " + resultado);

		sc.close();
	}
}
