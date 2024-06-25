package estruturas.sequenciais;

import java.util.Locale;

public class Aula24 {
	public static void main(String[] args) {
//		System.out.print("Bom dia!");
//		System.out.println("Bom dia!");

		int y = 32;
		System.out.println("y= " + y);

		double x = 10.35784;
		System.out.println("x= " + x);

//		%n = quebra de linha (independente de plataforma)
//		%.<qnt de casas>f + \n ou %n(quebra de linha)
		System.out.printf("x2f= " + "%.2f%n", x);
		System.out.printf("x4f= " + "%.4f%n", x);

//		Para considerar o separador de decimais como ponto, ANTES da declaracao do Scanner, faca:
		Locale.setDefault(Locale.US);
		System.out.printf("x4fUS= " + "%.4f%n", x);

		System.out.println("Resultado = " + x + " metros");
		System.out.printf("Resultado(printf) = %.2f metros%n", x);

//		%f = ponto flutuante
//		%d = inteiro
//		%s = texto
//		%n = quebra de linha

		String nome = "Maria";
		int idade = 31;
		double renda = 4000.0;
		Locale.setDefault(new Locale("pt", "BR"));
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
	}
}
