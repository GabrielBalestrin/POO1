package Lista3;

import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.print("Digite um n�mero: ");
		int n1 = ler.nextInt();
		
		if (n1 > 0)
			System.out.println(n1+" � positivo");
		else if (n1 < 0)
			System.out.println(n1+" � negativo");
		else 
			System.out.println("O n�mero � 0");

		ler.close();
	}
}
