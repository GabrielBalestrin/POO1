package Lista4;

import java.util.Scanner;

public class Ex5 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		final int TAM = 10;
		int i = 0;
		int original[] = new int[TAM];
		int par[] = new int[TAM];
		int impar[] = new int[TAM];

		int num, contPar = 0, contImpar = 0;
		for (i = 0; i < TAM; i++) {
			System.out.print("Digite um numero: ");
			num = ler.nextInt();
			original[i] = num;
			if (num % 2 == 0) {
				par[contPar] = num;
				contPar += 1;
			} else if (num % 2 == 1) {
				impar[contImpar] = num;
				contImpar += 1;
			}
			ler.close();
		}

		System.out.println("Vetor original: ");
		for (i = 0; i < TAM; i++) {
			System.out.print(original[i] + " ");
		}
		System.out.println();
		System.out.println("Vetor pares: ");
		for (i = 0; i < contPar; i++) {
			System.out.print(par[i] + " ");
		}
		System.out.println();
		System.out.println("Vetor ímpares: ");
		for (i = 0; i < contImpar; i++) {
			System.out.print(impar[i] + " ");
		}
		
	
	}
}
