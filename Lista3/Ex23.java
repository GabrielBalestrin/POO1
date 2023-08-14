package Lista3;

import java.util.Scanner;

public class Ex23 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.print("Digite a idade do 1° aluno: ");
		int idade1 = ler.nextInt();
		System.out.print("Digite a idade do 2° aluno: ");
		int idade2 = ler.nextInt();
		System.out.print("Digite a idade do 3° aluno: ");
		int idade3 = ler.nextInt();

		float media = (idade1 + idade2 + idade3) / 3;

		System.out.println("Média de idade é de " + media + " anos");
		if (media < 25)
			System.out.println("Turma jovem");
		else if (media >= 25 && media <= 40)
			System.out.println("Turma Adulta");
		else
			System.out.println("Turma Idosa");

		ler.close();
	}
}
