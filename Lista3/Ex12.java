package Lista3;

import java.util.Scanner;

public class Ex12 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.print("Digite seu s�lario atual em reais: ");
		float salario = ler.nextFloat();

		float reajuste = 0, salarioNovo = 0;
		String percentual;

		if (salario <= 280) {
			reajuste = salario * 0.20f;
			salarioNovo = salario + reajuste;
			percentual = "20%";
		} else if (salario > 280 && salario < 700) {
			reajuste = salario * 0.15f;
			salarioNovo = salario + reajuste;
			percentual = "15%";
		} else if (salario > 700 && salario < 1500) {
			reajuste = salario * 0.10f;
			salarioNovo = salario + reajuste;
			percentual = "10%";
		} else {
			reajuste = salario * 0.05f;
			salarioNovo = salario + reajuste;
			percentual = "5%";
		}

		System.out.println();
		System.out.println("Seu sal�rio atual � de " + salario + " reais");
		System.out.println("O percentual do reajuste � de " + percentual);
		System.out.println("Seu aumento foi de " + reajuste + " reais");
		System.out.println("Seu novo sal�rio ser� de " + salarioNovo + " reais");

		ler.close();
	}
}