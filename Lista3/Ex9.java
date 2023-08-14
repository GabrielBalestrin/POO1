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
			System.out.println("Não foi possível calcular o seu peso ideal");
		}

		System.out.println("\nSua altura é de: " + altura + " metros");
		System.out.println("Seu peso atual é de: " + peso + " Kg");
		System.out.println("Seu sexo é " + sexo);
		System.out.println("Seu ideal é de: " + pesoIdeal + " Kg");

		if (peso > pesoIdeal)
			System.out.println("Você está acima do peso ideal");
		else if (peso < pesoIdeal)
			System.out.println("Você está abaixo do peso ideal");
		else
			System.out.println("Você está no peso ideal");

		ler.close();
	}
}
