package Lista3;

import java.util.Scanner;

public class Ex17 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.print("Digite a 1° nota: ");
		float n1 = ler.nextFloat();
		System.out.print("Digite a 1° nota: ");
		float n2 = ler.nextFloat();
		System.out.println();
		float media = (n1 + n2) / 2;

		if (media > 0 && media < 4)
			System.out.println(media + " é nota E - Reprovado");
		else if (media >= 4 && media < 6)
			System.out.println(media + " é nota D - Reprovado");
		else if (media >= 6 && media < 7.5)
			System.out.println(media + " é nota C - Aprovado");
		else if (media >= 7.5 && media < 9)
			System.out.println(media + " é nota B - Aprovado");
		else if (media >= 9 && media <= 10)
			System.out.println(media + " é nota A - Aprovado");
		else
			System.out.println(media + " Média inválida");

		ler.close();
	}
}
