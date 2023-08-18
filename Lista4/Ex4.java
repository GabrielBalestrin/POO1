package Lista4;

import java.util.Scanner;

public class Ex4 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		char vet[] = new char[10];
		int cons = 0;
		char letra = ' ';
		for (int i = 0; i < 10; i++) {
			System.out.print("Digite uma letra: ");
			letra = ler.nextLine().charAt(0);
			letra = Character.toUpperCase(letra);
			vet[i] = letra;
			if (letra != 'A' && letra != 'E' && letra != 'I' && letra != 'O' && letra != 'U') {
				cons += 1;
			}

		}
		System.out.println("O total de consoante é de: " + cons);

		for (int i = 0; i < 10; i++) {
			char l = vet[i];
			if (l != 'A' && l != 'E' && l != 'I' && l != 'O' && l != 'U') {
				System.out.println("letra consoante: " + l);
			}

		}

		ler.close();

	}

}
