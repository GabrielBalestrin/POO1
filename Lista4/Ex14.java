package Lista4;

import java.util.Scanner;

public class Ex14 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int vetId[] = new int[5];
		float vetAlt[] = new float[5];

		float soma = 0, med = 0, cont = 0;
		for (int i = 0; i < 5; i++) {
			System.out.println("Aluno " + (i + 1));
			System.out.print("Digite a idade do aluno: ");
			int id = ler.nextInt();
			vetId[i] = id;
			System.out.print("Digite a altura do aluno: ");
			float alt = ler.nextFloat();
			vetAlt[i] = alt;

			soma = soma + vetAlt[i];

		}

		med = (soma) / 5;

		for (int i = 0; i < 5; i++) {
			if (vetId[i] > 13 && vetAlt[i] < med) {
				cont = cont + 1;
			}
		}
		System.out.println("A média de altura é de: " + med);
		System.out.println("Os alunos com mais de 13 anos com altura menor que a média é de: " + cont + " alunos");
		ler.close();
	}
	
}
