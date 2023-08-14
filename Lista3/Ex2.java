package Lista3;

import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.print("Digite um número: ");
		int n1 = ler.nextInt();
		
		if (n1 > 0)
			System.out.println(n1+" é positivo");
		else if (n1 < 0)
			System.out.println(n1+" é negativo");
		else 
			System.out.println("O número é 0");

		ler.close();
	}
}
