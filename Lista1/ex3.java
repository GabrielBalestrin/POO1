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

		System.out.print("Está é a soma entre os números informados: " + soma);
		entrada.close();
	}
}
