package Lista3;

import java.util.Scanner;

public class Ex28 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.print("Digite um 1� n�mero: ");
		float n1 = ler.nextFloat();
		System.out.print("Digite um 2� n�mero: ");
		float n2 = ler.nextFloat();
		ler.nextLine();
		System.out.print("Digite a opera��o que deseja fazer [/;+;-;*]: ");
		String op = ler.nextLine();

		op = op.toUpperCase();

		if (op.equals("/")) {
			float div = n1 / n2;
			System.out.println(div);
		} else if (op.equals("*")) {
			float mult = n1 * n2;
			System.out.println(mult);
		} else if (op.equals("+")) {
			float soma = n1 + n2;
			System.out.println(soma);
		} else if (op.equals("-")) {
			float min = n1 - n2;
			System.out.println(min);
		} else {
			System.out.println("Opera��o inv�lida");
		}

		ler.close();

	}

}
