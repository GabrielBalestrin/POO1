package Lista3;

import java.util.Scanner;

public class Ex30 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.print("Digite o tipo de combustível, gasolina ou álcool [G/A]:  ");
		char combustivel = ler.next().charAt(0);
		combustivel = Character.toUpperCase(combustivel);
		ler.nextLine();
		System.out.print("Quantos litros será abastecido: ");
		float litros = ler.nextFloat();

		float total, desc = 0;
		if (litros < 20 && combustivel == 'G') {
			total = litros * 2.5f;
			desc = total * 2.50f;
			System.out.println(total);
		} else if (litros >= 20 && combustivel == 'G') {
			total = litros * 2.5f;
			desc = total * 0.94f;
		} else if (litros < 20 && combustivel == 'A') {
			total = litros * 1.9f;
			desc = total * 0.97f;
		} else if (litros >= 20 && combustivel == 'A') {
			total = litros * 1.9f;
			desc = total * 0.95f;
		}
		System.out.println("O total é de " + desc + " reais");
		ler.close();
	}
}
