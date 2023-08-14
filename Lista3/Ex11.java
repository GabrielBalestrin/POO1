package Lista3;

import java.util.Scanner;

public class Ex11 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.print("Digite o turno que você estuda [Matutino/Vespertino/Noturno]: ");
		String turno = ler.nextLine();
		turno = turno.toUpperCase();

		if (turno.equals("M") || turno.equals("MATUTINO"))
			System.out.println("Bom Dia!");
		else if (turno.equals("V") || turno.equals("VESPERTINO"))
			System.out.println("Boa tarde!");
		else if (turno.equals("N") || turno.equals("NOTURNO"))
			System.out.println("Boa noite!");
		else 
			System.out.println("Turno inválido! ");
		ler.close();
	}

}
/*
 * 11.Faça um Programa que pergunte em que turno você estuda. Peça para digitar
 * M- Matutino ou V-Vespertino ou N- Noturno. Imprima a mensagem "Bom Dia!",
 * "Boa
 * 
 * Tarde!" ou "Boa Noite!" , conforme o caso.
 */