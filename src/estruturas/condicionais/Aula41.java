package estruturas.condicionais;

import java.util.Scanner;

public class Aula41 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double price = sc.nextInt();

//		double discount = 0;
//
//		if (price > 200.00) {
//			discount = price * 0.1;
//		}

		double discount;

		if (price < 200.00) {
			discount = price * 0.1;
		} else {
			discount = 0;
		}

		System.out.println(discount);
	}
}
