package Lista3;

import java.util.Scanner;

public class Ex14 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.print("Digite um número de 1 a 7: ");
		int n = ler.nextInt();
		
		if (n == 1)
		System.out.println("Domingo");
		else if (n == 2)
			System.out.println("segunda");
		else if (n == 3)
			System.out.println("Terça");
		else if (n == 4)
			System.out.println("Quarta");
		else if (n == 5)
			System.out.println("Quinta");
		else if (n == 6)
			System.out.println("Sexta");
		else if (n == 7)
			System.out.println("Sábado");
		else 
			System.out.println("Número inválido!");

		ler.close();	
	}
}
