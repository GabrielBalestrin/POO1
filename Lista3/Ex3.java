package Lista3;

import java.util.Scanner;

public class Ex3 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.print("Digite F ou M: ");
		char sexo = ler.next().charAt(0);

		if (sexo == 'F')
			System.out.println("Feminino");
		else if (sexo == 'M')
			System.out.println("Masculino");
		else
			System.out.println("Letra inválida");

		ler.close();
	}
}
