package Lista3;

import java.util.Scanner;

public class Ex13 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.print("Digite quanto voc� ganha por hora trabalhada: ");
		float salarioHora = ler.nextFloat();
		System.out.print("Quantas horas voc� trabalhou no m�s: ");
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
		System.out.println("Sal�rio por hora trabalhada � de "+salarioHora+" reais");
		System.out.println("O total de horas � de "+horasTrabalhadas);
		System.out.println("Seu sal�rio Bruto � de "+salarioBruto+" reais");
		System.out.println("Imposto de renda � de "+ir+" reais");
		System.out.println("O total do INSS � de "+inss+ " reais");
		System.out.println("O total do FGTS � de "+fgts+ " reais");
		System.out.println("O total de descontos � de "+descontos+" reais");
		System.out.println("Seu sal�rio liquido  � de "+salarioLiquido+" reais");
		ler.close();
	}

}
