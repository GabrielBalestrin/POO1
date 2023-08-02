package Lista1;

import java.util.Scanner;

public class ex16 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		double metrosTotal, latas18, latas3, litros, precoTotal18, precoTotal3;

		System.out.print("Digite o total de metros quadrados a serem pintados: ");
		metrosTotal = ler.nextDouble();

		litros = metrosTotal / 6;
		latas3 = litros / 3.6;
		latas18 = litros / 18;

		precoTotal3 = latas3 * 25;
		precoTotal18 = latas18 * 80;

		System.out.println("\nO total a ser pago com latas de 18 litros: " + precoTotal18 + " reias");
		System.out.println("Com o total de " + latas18 + " latas");
		System.out.println("\nO total a ser pago com latas de 3,6 litros: " + precoTotal3 + " reias");
		System.out.println("Com o total de " + latas3 + " latas");

		ler.close();
	}
}
/*
 * 16.Faça um Programa para uma loja de tintas. O programa deverá pedir o
 * tamanho em metros quadrados da área a ser pintada. Considere que a cobertura
 * da tinta é de 1 litro para cada 6 metros quadrados e que a tinta é vendida em
 * latas de 18 litros, que custam R$ 80,00 ou em galões de 3,6 litros, que
 * custam R$ 25,00. o Informe ao usuário as quantidades de tinta a serem
 * compradas e os respectivos preços em 2 situações: o comprar apenas latas de
 * 18 litros; o comprar apenas galões de 3,6 litros;
 */