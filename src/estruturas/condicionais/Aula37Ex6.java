package estruturas.condicionais;

import java.util.Locale;
import java.util.Scanner;

public class Aula37Ex6 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double numero = sc.nextDouble();

		if (numero >= 0.0 && numero <= 25.0) {
			System.out.println("Intervalo [0,25]");
		} else if (numero >= 25.01 && numero <= 50.0) {
			System.out.println("Intervalo [25,50]");
		} else if (numero >= 50.01 && numero <= 75.0) {
			System.out.println("Intervalo [50,75]");
		} else if (numero >= 75.01 && numero <= 100.0) {
			System.out.println("Intervalo [75,100]");
		} else {
			System.out.println("Fora de intervalo");
		}

		sc.close();
	}
}
