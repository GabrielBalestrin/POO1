package Lista3;

import java.util.Scanner;

public class Ex25 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Observação: apenas saques de 10 a 600 reais ");
		System.out.print("Digite quantos reais a ser sacados: ");
		int total = ler.nextInt();

		if (total >= 10 && total <= 600) {

			int nota100 = total / 100;
			int restoApos100 = total % 100;

			int nota50 = restoApos100 / 50;
			int restoApos50 = restoApos100 % 50;

			int nota10 = restoApos50 / 10;
			int restoApos10 = restoApos50 % 10;

			int nota5 = restoApos10 / 5;
			int nota1 = restoApos10 % 5;

			System.out.println("Total de Cédulas: ");
			System.out.println("Notas de 100: " + nota100 + " cédulas");
			System.out.println("Notas de 50: " + nota50 + " cédulas");
			System.out.println("Notas de 10: " + nota10 + " cédulas");
			System.out.println("Notas de 5: " + nota5 + " cédulas");
			System.out.println("Notas de 1: " + nota1 + " cédulas");

		} else {
			System.out.println("Valor indisponivel para saque!");
		}

		ler.close();
	}
}
