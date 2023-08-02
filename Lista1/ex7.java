package Lista1;

import java.util.Scanner;

public class ex7 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		float area,lado;

		System.out.print("Digite o lado do quadrado: ");
		lado = ler.nextFloat();
	
		area = lado * lado;

		System.out.print("Essa é a área total do quadrado: " + area);
		ler.close();
	}
}
