package Lista3;

import java.util.Scanner;

public class Ex7 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.print("Digite o 1° número: ");
		int n1 = ler.nextInt();
		System.out.print("Digite o 2° número: ");
		int n2 = ler.nextInt();
		System.out.print("Digite o 3° número: ");
		int n3 = ler.nextInt();

		if (n1 >= n2 && n2 >= n3)
			System.out.println("Ordem decrescente: " + n1 + " > " + n2 + " > " + n3);
		else if (n1 >= n3 && n3 >= n2)
			System.out.println("Ordem decrescente: " + n1 + " > " + n3 + " > " + n2);
		else if (n2 >= n1 && n1 >= n3)
			System.out.println("Ordem decrescente: " + n2 + " > " + n1 + " > " + n3);
		else if (n2 >= n3 && n3 >= n1)
			System.out.println("Ordem decrescente: " + n2 + " > " + n3 + " > " + n1);
		else if (n3 >= n1 && n1 >= n2)
			System.out.println("Ordem decrescente: " + n3 + " > " + n1 + " > " + n2);
		else if (n3 >= n2 && n2 >= n1)
			System.out.println("Ordem decrescente: " + n3 + " > " + n2 + " > " + n1);
		
		ler.close();
	}

}
