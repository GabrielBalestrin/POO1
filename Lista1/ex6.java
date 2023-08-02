package Lista1;

import java.util.Scanner;

public class ex6 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double area, raio;
		System.out.print("Digite o raio do circulo: ");
		raio = ler.nextDouble();

		area = 3.14* (raio * raio);

		System.out.print("Essa é a área aproximada do circulo: " + area);
		ler.close();
	}
}
