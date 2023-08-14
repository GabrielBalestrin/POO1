package Lista3;

import java.util.Scanner;

public class Ex1 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.print("Digite o 1° número: ");
		int num1 = ler.nextInt();
		System.out.print("Digite o 2° número: ");
		int num2 = ler.nextInt();

		if (num1 > num2)
			System.out.println("Maior: " + num1);
		else if (num2 > num1)
			System.out.println("Maior: " + num2);
		else
			System.out.println("Ambos são iguais");

		ler.close();
	}
}
