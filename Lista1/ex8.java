package Lista1;

import java.util.Scanner;

public class ex8 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		float salarioHora, horas, total;

		System.out.print("Digite o seu sal�rio por hora trabalhada: ");
		salarioHora = ler.nextFloat();
		System.out.print("Digite quantas horas foram trabalhadas no m�s: ");
		horas = ler.nextFloat();

		total = salarioHora * horas;

		System.out.println("\nSeu sal�rio mensal � de: " + total + " reais");
		ler.close();
	}
}
