package estruturas.sequenciais;

import java.util.Locale;
import java.util.Scanner;

public class Aula30Ex4 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int nroFuncionario;
		double horas, vlrHora, salario;

		nroFuncionario = sc.nextInt();
		horas = sc.nextDouble();
		vlrHora = sc.nextDouble();
		salario = horas * vlrHora;

		System.out.println("Funcionário: " + nroFuncionario);
		System.out.printf("Salário: $ %.2f%n", salario);

		sc.close();
	}
}
