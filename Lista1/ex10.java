package Lista1;

import java.util.Scanner;

public class ex10 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int num1 = 0, num2 = 0, a;
		float num3 = 0, b, c;

		System.out.print("Digte o 1º número inteiro: ");
		num1 = ler.nextInt();
		System.out.print("Digte o 2º número inteiro: ");
		num2 = ler.nextInt();
		System.out.print("Digte um número real: ");
		num3 = ler.nextFloat();

		a = (num1 * 2) + (num2 / 2);
		b = (num1 * 3) + num3;
		c = (num3 * num3 * num3);

		System.out.print("\nResultado do produto do dobro do primeiro com metade do segundo: " + a);
		System.out.print("\nResultado da soma do triplo do primeiro com o terceiro: " + b);
		System.out.print("\nResultado do terceiro elevado ao cubo : " + c);

		ler.close();
	}

}
