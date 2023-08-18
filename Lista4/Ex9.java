package Lista4;

import java.util.Scanner;

public class Ex9 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.println("Digite uma palavra: ");
		String palavra = ler.nextLine();

		char letras[] = new char[palavra.length()];

		for (int i = 0; i < palavra.length(); i++) {
			letras[i] = palavra.charAt(i);
		}
		
		System.out.println("");
		for (int i=0; i < palavra.length();i++) {
			System.out.print(letras[i]+ " ");
		}
		ler.close();
	}
}
