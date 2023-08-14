package Lista3;

import java.util.Scanner;

public class Ex6 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.print("Digite um número: ");
		int numero = ler.nextInt();

		if (numero % 2 == 0) {
			numero = numero + 1;
			System.out.println("O número digitado virou ímpar: " + numero);
		} else if (numero % 2 == 1) {
			numero = numero + 1;
			System.out.println("O número digitado virou par: " + numero);
		}

		ler.close();
	}
}
