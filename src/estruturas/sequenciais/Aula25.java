package estruturas.sequenciais;

public class Aula25 {
	public static void main(String[] args) {

//		Ex1
		int x1, y1;
		x1 = 5;
		y1 = 2 * x1;
		System.out.println(x1);
		System.out.println(y1);

//		Ex2
		int x2;
		double y2;
		x2 = 5;
		y2 = 2 * x2;
		System.out.println(x2);
		System.out.println(y2);

// 		Boa prática:
//		Sempre indique o tipo do número, se a
//		expressão for de ponto flutuante (não
//		inteira).
//		Para double use:
//		.0
//		Para float use:
//		f

//		Ex3
		double b, B, h, area;
		b = 6.0;
		B = 8.0;
		h = 5.0;
		area = (b + B) / 2.0 * h;
		System.out.println(area);

//		Ex3
//		float b, B, h, area;
//		b = 6f;
//		B = 8f;
//		h = 5f;
//		area = (b + B) / 2f * h;
//		System.out.println(area);

//		Casting
//		É a conversão explícita de um tipo para outro.
//		É necessário quando o compilador não é capaz de “adivinhar” que o
//		resultado de uma expressão deve ser de outro tipo.

//		Ex4
		int a4, b4;
		double resultado;
		a4 = 5;
		b4 = 2;
		resultado = (double) a4 / b4;
		System.out.println(resultado);

//		Ex5
		double a5;
		int b5;
		a5 = 5.0;
		b5 = (int) a5;
		System.out.println(b5);
	}
}
