package Lista3;

import java.util.Scanner;

public class Ex19 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.print("Digite o valor de A: ");
		double a = ler.nextDouble();

		if (a == 0) {
			System.out.println("A equação não é do segundo grau.");
		} else {
			System.out.print("Digite o valor de B: ");
			double b = ler.nextDouble();

			System.out.print("Digite o valor de C: ");
			double c = ler.nextDouble();

			double delta = (b * b) - (4 * a * c);

			if (delta < 0) {
				System.out.println("A equação não possui raízes reais.");
			} else if (delta == 0) {
				double raiz = -b / (2 * a);
				System.out.println("A equação possui uma raiz real: " + raiz);
			} else {
				double raiz1 = (-b + Math.sqrt(delta)) / (2 * a);
				double raiz2 = (-b - Math.sqrt(delta)) / (2 * a);
				System.out.println("A equação possui duas raízes reais:");
				System.out.println("Raiz 1: " + raiz1);
				System.out.println("Raiz 2: " + raiz2);
			}
		}

		ler.close();
	}
}
