package Lista1;

import java.util.Scanner;

public class ex9 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		float celsius, fahrenheit;

		System.out.print("Digite a temperatura em °F: ");
		fahrenheit = ler.nextFloat();

		celsius = (5 * (fahrenheit - 32) / 9);

		System.out.println("Essa temperatura corresponde a " + celsius + "°C");
		ler.close();
	}
}
