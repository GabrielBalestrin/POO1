package Lista1;

import java.util.Scanner;

public class ex4 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		float n1, n2, n3, n4, soma, media;

		System.out.print("Digite a 1� nota: ");
		n1 = entrada.nextFloat();
		System.out.print("Digite a 2� nota: ");
		n2 = entrada.nextFloat();
		System.out.print("Digite a 3� nota: ");
		n3 = entrada.nextFloat();
		System.out.print("Digite a 4� nota: ");
		n4 = entrada.nextFloat();

		soma = n1 + n2 + n3 + n4;
		media = (soma / 4);

		System.out.print("\nSua m�dia foi de: " + media);
		entrada.close();
	}
}
