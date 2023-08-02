package Lista1;

import java.util.Scanner;

public class ex14 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int horasTrabalhadas;
		double salarioHora, salarioTotal, impostoRenda, inss, sindicato, salarioBruto;

		System.out.print("Digite seu salario por hora trabalhada: ");
		salarioHora = ler.nextDouble();
		System.out.print("Digite o número de horas trabalhadas no mês: ");
		horasTrabalhadas = ler.nextInt();

		salarioTotal = salarioHora * horasTrabalhadas;
		salarioBruto = salarioTotal;
		impostoRenda = salarioTotal * 0.11;
		inss = salarioTotal * 0.08;
		sindicato = salarioTotal * 0.05;
		salarioTotal = salarioTotal - impostoRenda - inss - sindicato;

		System.out.println("\nSeu salário bruto é de: " + salarioBruto + " reais");
		System.out.println("O pagamento ao imposto de renda foi de: " + impostoRenda + " reais");
		System.out.println("O pagamento ao inss foi de: " + inss + " reais");
		System.out.println("O pagamento ao sindicato foi de: " + sindicato + " reais");
		System.out.println("Seu salário líquido é de: " + salarioTotal + " reais");

		ler.close();
	}
}
/*
 * 14.Faça um Programa que pergunte quanto você ganha por hora e o número de
 * horas trabalhadas no mês. Calcule e mostre o total do seu salário no referido
 * mês, sabendo-se que são descontados 11% para o Imposto de Renda, 8% para o
 * INSS e 5% para o sindicato, faça um programa que nos dê: a. salário bruto. b.
 * quanto pagou ao INSS. c. quanto pagou ao sindicato. d. o salário líquido. e.
 * calcule os descontos e o salário líquido, conforme a tabela abaixo: f. +
 * Salário Bruto : R$ g. - IR (11%) : R$ h. - INSS (8%) : R$ i. - Sindicato (
 * 5%) : R$ j. = Salário Liquido : R$ Obs.: Salário Bruto - Descontos = Salário
 * Líquido.
 */