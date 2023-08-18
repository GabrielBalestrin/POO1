package Lista4;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int vet[] = new int[5];
		
		for (int i = 0; i < 5;i++) {
			System.out.print("Digite um número: ");
			int num = ler.nextInt();
			vet[i] = num;
		}	
		
		for (int i = 0; i < 5;i++)
			System.out.print(vet[i]+" ");

		ler.close();
	}

}
