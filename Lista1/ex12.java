package Lista1;

import java.util.Scanner;

public class ex12 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		double altura, pesoIdeal = 0;
		String sexo;

		System.out.print("Digite seu sexo: ");
		sexo = ler.nextLine();
		System.out.print("Digite sua altura em metro: ");
		altura = ler.nextDouble();

		if (sexo.equalsIgnoreCase("homem")) {
			pesoIdeal = (72.7 * altura) - 58;
		} else if (sexo.equalsIgnoreCase("mulher")) {
			pesoIdeal = (62.1 * altura) - 44.7;
		}
		System.out.println("Seu peso ideal é de: " + pesoIdeal + " Kg");

		ler.close();
	}
}