package Lista3;

import java.util.Scanner;

public class Ex18 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.print("Digite o 1° lado do triângulo: ");
		float l1 = ler.nextFloat();
		System.out.print("Digite o 2° lado do triângulo: ");
		float l2 = ler.nextFloat();
		System.out.print("Digite o 3° lado do triângulo: ");
		float l3 = ler.nextFloat();

		 if (l1 + l2 > l3 && l1 + l3 > l2 && l2 + l3 > l1) {
			if (l1 == l2 && l2 == l3)
				System.out.println("Triângulo Equilatero");
			else if (l1 == l3 || l1 == l2 || l2 == l3)
				System.out.println("Triângulo Isósceles");
			else
				System.out.println("Triângulo escaleno");
		} else {
			System.out.println("Não é um triângulo");
		}

		ler.close();
	}
}
