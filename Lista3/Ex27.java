package Lista3;
import java.util.Scanner;

public class Ex27 {
		public static void main (String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		float n1 = ler.nextFloat();
		
		if ( n1 == Math.round(n1) ) 
			System.out.println("Inteiro");
		else 
			System.out.println("Float");

		ler.close();
			
		}
}
