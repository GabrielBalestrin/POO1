package Lista4;

import java.util.Scanner;

public class Ex13 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int v1[] = new int[10];
		int v2[] = new int[10];
		int v3[] = new int[20];

		int i = 0;

		System.out.println("Vetor 1");
		for (i = 0; i < 10; i++) {
			System.out.print("Digite um número: ");
			int n = ler.nextInt();
			v1[i] = n;
		}
		System.out.println("Vetor 2");
		for (i = 0; i < 10; i++) {
			System.out.print("Digite um número: ");
			int n = ler.nextInt();
			v2[i] = n;
		}
		for (i = 0; i < 10; i++) {
			v3[i * 2] = v1[i];
			v3[i * 2 + 1] = v2[i];
		}

		for (i = 0; i < 20; i++) {
			System.out.print(v3[i] + " ");
		}
	}
}
