package Lista3;
import java.util.Scanner;
public class Ex4 {
		public static void main(String[] args) {
			Scanner ler = new Scanner(System.in);
			
			System.out.print("Digite um ano com 4 digitos: ");
			int ano = ler.nextInt();
			
			if (ano % 4  == 0)
				System.out.println("Ano bissexto");
			else 
				System.out.println("Ano normal");
		
			ler.close();
		}
}
