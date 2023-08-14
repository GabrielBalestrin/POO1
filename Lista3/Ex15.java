package Lista3;
import java.util.Scanner;
public class Ex15 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite o preço de custo do produto: ");
		float custo = ler.nextFloat();
		System.out.print("Digite o código de origem: ");
		int cod = ler.nextInt();
		System.out.println();
		
		if (cod == 1 ) {
			System.out.println("Esse é o preço do produto "+custo+" reais");
			System.out.println("O protudo tem origem do Sul");
		} else if (cod == 2) {
			System.out.println("Esse é o preço do produto "+custo+" reais");
			System.out.println("O protudo tem origem do Norte");
		} else if (cod == 3) {
			System.out.println("Esse é o preço do produto "+custo+" reais");
			System.out.println("O protudo tem origem do Leste");
		} else if (cod == 4) {
			System.out.println("Esse é o preço do produto "+custo+" reais");
			System.out.println("O protudo tem origem do Oeste");
		} else if (cod == 5 || cod == 6) {
			System.out.println("Esse é o preço do produto "+custo+" reais");
			System.out.println("O protudo tem origem do Nordeste");
		}	else if (cod == 7 || cod == 8) {
			System.out.println("Esse é o preço do produto "+custo+" reais");
			System.out.println("O protudo tem origem do Centro-oeste");
		} else {
			System.out.println("Esse é o preço do produto "+custo+" reais");
			System.out.println("O protudo tem origem importado");
		}
		
		ler.close();
	}
}
