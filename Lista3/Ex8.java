package Lista3;

import java.util.Scanner;

public class Ex8 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.print("Digite a 1� nota: ");
		float n1 = ler.nextFloat();
		System.out.print("Digite a 2� nota: ");
		float n2 = ler.nextFloat();

		float media = (n1 + n2) / 2;

		if (media >= 7)
			System.out.println("Voc� foi aprovado com m�dia " + media);
		else
			System.out.println("Voc� foi reprovado com m�dia " + media);

		ler.close();
	}
}
