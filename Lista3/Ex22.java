package Lista3;
import java.util.Scanner;

public class Ex22 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite um número entre 0 e 1000: ");
		int num = ler.nextInt();
		
		
		if (num >= 0 && num < 1000) {
			int centena = num / 100;
			int dezena = (num / 10) % 10;
			int unidade = num % 10;
			
			System.out.println("Esse numero é composto por "+centena+" centenas, "+dezena+" dezenas e "+unidade+" unidades");
		}
		
		
		ler.close();
	}
}
