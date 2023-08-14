package Lista3;

import java.util.Scanner;

public class Ex13 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.print("Digite quanto você ganha por hora trabalhada: ");
		float salarioHora = ler.nextFloat();
		System.out.print("Quantas horas você trabalhou no mês: ");
		int horasTrabalhadas = ler.nextInt();
		float ir=0, descontos=0;

		float salarioBruto = salarioHora * horasTrabalhadas;
		float inss;

		float fgts = salarioBruto * 0.11f;
		inss = salarioBruto * 0.10f;

		
		 if (salarioBruto > 900 && salarioBruto <= 1500) {
		    ir = salarioBruto * 0.05f;
		} else if (salarioBruto > 1500 && salarioBruto <= 2500) {
		    ir = salarioBruto * 0.10f;
		} else if (salarioBruto > 2500) {
		    ir = salarioBruto * 0.20f;
		}

		descontos = inss + ir;
		float salarioLiquido = salarioBruto - descontos;
		
		System.out.println();
		System.out.println("Salário por hora trabalhada é de "+salarioHora+" reais");
		System.out.println("O total de horas é de "+horasTrabalhadas);
		System.out.println("Seu salário Bruto é de "+salarioBruto+" reais");
		System.out.println("Imposto de renda é de "+ir+" reais");
		System.out.println("O total do INSS é de "+inss+ " reais");
		System.out.println("O total do FGTS é de "+fgts+ " reais");
		System.out.println("O total de descontos é de "+descontos+" reais");
		System.out.println("Seu salário liquido  é de "+salarioLiquido+" reais");
		ler.close();
	}

}
