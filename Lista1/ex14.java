package Lista1;

import java.util.Scanner;

public class ex14 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int horasTrabalhadas;
		double salarioHora, salarioTotal, impostoRenda, inss, sindicato, salarioBruto;

		System.out.print("Digite seu salario por hora trabalhada: ");
		salarioHora = ler.nextDouble();
		System.out.print("Digite o n�mero de horas trabalhadas no m�s: ");
		horasTrabalhadas = ler.nextInt();

		salarioTotal = salarioHora * horasTrabalhadas;
		salarioBruto = salarioTotal;
		impostoRenda = salarioTotal * 0.11;
		inss = salarioTotal * 0.08;
		sindicato = salarioTotal * 0.05;
		salarioTotal = salarioTotal - impostoRenda - inss - sindicato;

		System.out.println("\nSeu sal�rio bruto � de: " + salarioBruto + " reais");
		System.out.println("O pagamento ao imposto de renda foi de: " + impostoRenda + " reais");
		System.out.println("O pagamento ao inss foi de: " + inss + " reais");
		System.out.println("O pagamento ao sindicato foi de: " + sindicato + " reais");
		System.out.println("Seu sal�rio l�quido � de: " + salarioTotal + " reais");

		ler.close();
	}
}
/*
 * 14.Fa�a um Programa que pergunte quanto voc� ganha por hora e o n�mero de
 * horas trabalhadas no m�s. Calcule e mostre o total do seu sal�rio no referido
 * m�s, sabendo-se que s�o descontados 11% para o Imposto de Renda, 8% para o
 * INSS e 5% para o sindicato, fa�a um programa que nos d�: a. sal�rio bruto. b.
 * quanto pagou ao INSS. c. quanto pagou ao sindicato. d. o sal�rio l�quido. e.
 * calcule os descontos e o sal�rio l�quido, conforme a tabela abaixo: f. +
 * Sal�rio Bruto : R$ g. - IR (11%) : R$ h. - INSS (8%) : R$ i. - Sindicato (
 * 5%) : R$ j. = Sal�rio Liquido : R$ Obs.: Sal�rio Bruto - Descontos = Sal�rio
 * L�quido.
 */