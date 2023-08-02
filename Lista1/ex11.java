package Lista1;

import java.util.Scanner;

public class ex11 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		double altura, pesoIdeal;

		System.out.print("Digite sua altura em metros: ");
		altura = ler.nextDouble();

		pesoIdeal = (72.7 * altura) - 58;

		System.out.println("Seu peso ideal é de: " + pesoIdeal + " Kg");
		ler.close();
	}
}
