package Lista3;

import java.util.Scanner;

public class Ex10 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.print("Digite o 1� n�mero: ");
		int n1 = ler.nextInt();
		System.out.print("Digite o 2� n�mero: ");
		int n2 = ler.nextInt();
		System.out.print("Digite o 3� n�mero: ");
		int n3 = ler.nextInt();

		System.out.println();

		if (n1 >= n2 && n1 >= n3)
			System.out.println(n1 + " � o maior");
		else if (n2 >= n1 && n2 >= n3)
			System.out.println(n2 + " � o maior");
		else if (n3 >= n1 && n3 >= n2)
			System.out.println(n3 + " � o maior");

		if (n1 <= n2 && n2 <= n3)
			System.out.println(n1 + " � o menor");
		else if (n2 <= n1 && n2 <= n3)
			System.out.println(n2 + " � o menor");
		else if (n3 <= n1 && n3 <= n2)
			System.out.println(n3 + " � o menor");

		ler.close();
	}
}
// 10.Fa�a um Programa que leia tr�s n�meros e mostre o maior e o menor deles.