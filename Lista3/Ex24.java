package Lista3;

import java.util.Scanner;

public class Ex24 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.print("Digite a 1° nota: ");
		int n1 = ler.nextInt();
		System.out.print("Digite a 2° nota: ");
		int n2 = ler.nextInt();
		System.out.print("Digite a 3° nota: ");
		int n3 = ler.nextInt();

		float media = (n1 + n2 + n3) / 3;

		if (media >= 7 && media <= 9.9)
			System.out.println("Aprovado com média " + media);
		else if (media < 7)
			System.out.println("Reprovado com média " + media);
		else if (media == 10)
			System.out.println("Aprovado com Distinção!");
		else
			System.out.println("Nota inválida!");

		ler.close();
	}
}
