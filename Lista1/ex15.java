package Lista1;

import java.util.Scanner;

public class ex15 {
	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		float metrosQuadradosTotal, litros, precoTotal, latas;

		System.out.print("Digite quantos metros quadrados ser�o pintados: ");
		metrosQuadradosTotal = ler.nextFloat();

		litros = metrosQuadradosTotal / 3;
		latas = litros / 18;
		precoTotal = latas * 80;

		System.out.println("O total de latas ser�: " + latas);
		System.out.println("O preco total ser� de: " + precoTotal + "reais");

		ler.close();
	}
}
