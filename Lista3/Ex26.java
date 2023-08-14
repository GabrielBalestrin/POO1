package Lista3;
import java.util.Scanner;
public class Ex26 {
		public static void main(String[] args) {
			Scanner ler = new Scanner(System.in);
			
			System.out.print("Digite um número: ");
			int n = ler.nextInt();
			
			if ( n % 2 == 0)
				System.out.println("PAR");
			else if (n % 2 == 1)
				System.out.println("IMPAR");
			
			
			
			ler.close();
			
		}
}
