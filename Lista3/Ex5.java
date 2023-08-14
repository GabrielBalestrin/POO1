package Lista3;

import java.util.Scanner;

public class Ex5 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.print("Digite uma letra: ");
		char letra = ler.next().charAt(0);
		
		letra = Character.toUpperCase(letra);

		if (letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U')
			System.out.println(letra + " essa letra é vogal");
		else
			System.out.println(letra + " essa letra é consoante");

		ler.close();
	}
}
