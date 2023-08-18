package Lista4;

import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		final int TAM = 10;
		float vet[] = new float[TAM];
		float inv[] = new float[TAM];

		for (int i = 0; i < TAM; i++) {
			System.out.print("Digite um numero: ");
			float num = ler.nextFloat();
			vet[i] = num;
		}
		for (int i = TAM-1;	i  >= 0;i--) {
			inv[TAM - 1 -i ] = vet[i];
			System.out.print(inv[TAM - 1 -i]+" ");
		}
		ler.close();
	}

}
