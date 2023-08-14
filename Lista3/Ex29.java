package Lista3;

import java.util.Scanner;

public class Ex29 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int contador = 0;
		System.out.println("Responda com sim ou não ");
		System.out.print("Telefonou para a vítima?  ");
		String r1 = ler.nextLine();
		System.out.print("Esteve no local do crime?  ");
		String r2 = ler.nextLine();
		System.out.print("Mora perto da vítima?  ");
		String r3 = ler.nextLine();
		System.out.print("Devia para a vítima?  ");
		String r4 = ler.nextLine();
		System.out.print("Já trabalhou com a vítima?  ");
		String r5 = ler.nextLine();

		r1 = r1.toUpperCase();
		r2 = r2.toUpperCase();
		r3 = r3.toUpperCase();
		r4 = r4.toUpperCase();
		r5 = r5.toUpperCase();

		if (r1.equals("SIM"))
			contador += 1;
		if (r2.equals("SIM"))
			contador += 1;
		if (r3.equals("SIM"))
			contador += 1;
		if (r4.equals("SIM"))
			contador += 1;
		if (r5.equals("SIM"))
			contador += 1;

		System.out.println();

		if (contador == 2)
			System.out.println("Suspeito");
		else if (contador >= 3 && contador <= 4)
			System.out.println("Cúmplice");
		else if (contador == 5)
			System.out.println("Assassino");
		else
			System.out.println("Inocente");

		ler.close();
	}
}
