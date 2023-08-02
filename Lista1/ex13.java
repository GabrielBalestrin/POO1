package Lista1;

import java.util.Scanner;

public class ex13 {
	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		double excedente, pesoPeixe, multa;

		System.out.print("Digite quantos Kg foram pescados: ");
		pesoPeixe = ler.nextDouble();

		if (pesoPeixe > 50) {
			excedente = pesoPeixe - 50;
			multa = excedente * 4;
			System.out.println("O total de multa a ser paga é de:  " + multa);
		} else {
			System.out.println("Não há multa!");
		}

		ler.close();
	}
}