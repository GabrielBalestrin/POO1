package Lista1;
import java.util.Scanner;

public class ex5 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		float m,cm;
		System.out.print("Digite o comprimento em metros: ");
		m = entrada.nextFloat();
		
		cm = m*100;
		
		System.out.print("O valor  é de: "+cm+" centimetros");
		entrada.close();
	}
 
}
