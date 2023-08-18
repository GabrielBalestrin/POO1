package Lista4;

import java.util.Scanner;

public class Ex15 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.print("Digite o tamanho n: ");
		int n = ler.nextInt();
		int vet[] = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.print("digite um número de 0 a 20: ");
			int num = ler.nextInt();

			if (num >= 0 && num <= 20) {
				vet[i] = num;
			} else {
				System.out.println("Digite corretamente!");
				i--;
			}
		}
		for (int i = 0; i < n; i++) {
			System.out.println();
			for (int j = 0; j < vet[i]; j++) {
				System.out.print("#");
			}
		}

		ler.close();

	}

}
