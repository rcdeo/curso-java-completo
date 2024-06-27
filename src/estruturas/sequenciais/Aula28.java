package estruturas.sequenciais;

public class Aula28 {
	public static void main(String[] args) {

		double x = 3.0;
		double y = 4.0;
		double z = -5.0;
		double a, b, c;

//		Variável A recebe a raiz quadrada de x (sqrt)
		a = Math.sqrt(x); //
		b = Math.sqrt(y);
		c = Math.sqrt(25.0);
		System.out.println("Raiz quadrada de " + x + " = " + a);
		System.out.println("Raiz quadrada de " + y + " = " + b);
		System.out.println("Raiz quadrada de 25 = " + c);

//		Variável A recebe o resultado de x elevado a y (pow)
		a = Math.pow(x, y);
		b = Math.pow(x, 2.0);
		c = Math.pow(5.0, 2.0);
		System.out.println(x + " elevado a " + y + " = " + a);
		System.out.println(x + " elevado ao quadrado = " + b);
		System.out.println("5 elevado ao quadrado = " + c);

//		Variável A recebe o valor absoluto de y (abs - remove o sinal negativo, caso exista)
		a = Math.abs(y);
		b = Math.abs(z);
		System.out.println("Valor absoluto de " + y + " = " + a);
		System.out.println("Valor absoluto de " + z + " = " + b);

//		Incluindo funções em expressões maiores
		double delta, x1, x2, a1, b1, c1;
		a1 = 5.0;
		b1 = 10.0;
		c1 = 2.0;

		delta = Math.pow(b1, 2.0) - 4 * a1 * c1;
		x1 = (-b1 + Math.sqrt(delta)) / (2.0 * a1);
		x2 = (-b1 - Math.sqrt(delta)) / (2.0 * a1);
		System.out.println(x1);
		System.out.println(x2);
	}
}
