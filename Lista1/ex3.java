package Lista1;

import java.util.Scanner;

public class ex3 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite um numero: ");
		float num1 = entrada.nextInt();

		System.out.print("Digite um numero: ");
		float num2 = entrada.nextInt();

		float soma = num1 + num2;

		System.out.print("Est� � a soma entre os n�meros informados: " + soma);
		entrada.close();
	}
}
