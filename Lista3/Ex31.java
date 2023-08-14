package Lista3;

import java.util.Scanner;

public class Ex31 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.print("Digite quantos KG de morangos foram comprados: ");
		float mor = ler.nextFloat();
		System.out.print("Digite quantos KG de maçãs foram comprados: ");
		float mac = ler.nextFloat();

		float totalApple = 0, totalStrawberry = 0, desc = 0, total = 0, pesoTotal = 0;

		if (mor < 5)
			totalApple = mor * 2.5f;
		else if (mor >= 5)
			totalApple = mor * 2.2f;
		if (mac < 5)
			totalStrawberry = mac * 1.8f;
		else if (mac >= 5)
			totalStrawberry = mac * 1.5f;

		total = totalApple + totalStrawberry;
		pesoTotal = mac + mor;

		if (total > 25 || pesoTotal > 8)
			desc = total * 0.90f;
		else
			desc = total * 1f;

		System.out.println("\nEsse é o valor total a ser pago: " + desc + " reais");

		ler.close();
	}

}
/*
 * 31. Uma fruteira está vendendo frutas com a seguinte tabela de preços: Até 5
 * Kg Acima de 5 Kg Morango R$ 2,50 por Kg R$ 2,20 por Kg Maçã R$ 1,80 por Kg R$
 * 1,50 por Kg
 * 
 * Se o cliente comprar mais de 8 Kg em frutas ou o valor total da compra
 * ultrapassar R$ 25,00, receberá ainda um desconto de 10% sobre este total.
 * Escreva um algoritmo para ler a quantidade (em Kg) de morangos e a quantidade
 * (em Kg) de maças adquiridas e escreva o valor a ser pago pelo cliente.
 */