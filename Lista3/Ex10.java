package Lista3;

import java.util.Scanner;

public class Ex10 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.print("Digite o 1° número: ");
		int n1 = ler.nextInt();
		System.out.print("Digite o 2° número: ");
		int n2 = ler.nextInt();
		System.out.print("Digite o 3° número: ");
		int n3 = ler.nextInt();

		System.out.println();

		if (n1 >= n2 && n1 >= n3)
			System.out.println(n1 + " é o maior");
		else if (n2 >= n1 && n2 >= n3)
			System.out.println(n2 + " é o maior");
		else if (n3 >= n1 && n3 >= n2)
			System.out.println(n3 + " é o maior");

		if (n1 <= n2 && n2 <= n3)
			System.out.println(n1 + " é o menor");
		else if (n2 <= n1 && n2 <= n3)
			System.out.println(n2 + " é o menor");
		else if (n3 <= n1 && n3 <= n2)
			System.out.println(n3 + " é o menor");

		ler.close();
	}
}
// 10.Faça um Programa que leia três números e mostre o maior e o menor deles.