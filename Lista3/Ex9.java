package Lista3;

import java.util.Scanner;

public class Ex9 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.print("Digite seu sexo [F/M]: ");
		String sexo = ler.nextLine();
		System.out.print("Digite sua altura em metros: ");
		float altura = ler.nextFloat();
		System.out.print("Digite seu peso: ");
		float peso = ler.nextFloat();

		sexo = sexo.toUpperCase();
		float pesoIdeal = 0;

		if (sexo.equals("F") || sexo.equals("FEMININO")) {
			pesoIdeal = (62.1f * altura) - 44.7f;
		} else if (sexo.equals("M") || sexo.equals("MASCULINO")) {
			pesoIdeal = (72.7f * altura) - 58;
		} else {
			System.out.println("N�o foi poss�vel calcular o seu peso ideal");
		}

		System.out.println("\nSua altura � de: " + altura + " metros");
		System.out.println("Seu peso atual � de: " + peso + " Kg");
		System.out.println("Seu sexo � " + sexo);
		System.out.println("Seu ideal � de: " + pesoIdeal + " Kg");

		if (peso > pesoIdeal)
			System.out.println("Voc� est� acima do peso ideal");
		else if (peso < pesoIdeal)
			System.out.println("Voc� est� abaixo do peso ideal");
		else
			System.out.println("Voc� est� no peso ideal");

		ler.close();
	}
}
