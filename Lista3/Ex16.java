package Lista3;
import java.util.Scanner;
public class Ex16 {
		public static void main(String[] args) {
			Scanner ler = new Scanner(System.in);
			
		System.out.print("Digite a 1° nota: ");
		float n1 = ler.nextFloat();
		System.out.print("Digite a 2° nota: ");
		float n2 = ler.nextFloat();
		System.out.print("Digite a 3° nota: ");
		float n3 = ler.nextFloat();
		
		float media = (n1 + n2 + n3)/ 3;
		
		if (media < 3)
			System.out.println("Reprovado com média: "+media);
		else if  (media >= 3 && media < 7)
		System.out.println("Em exame com média: "+media);
		else 
			System.out.println("Aprovado com média: "+media);
			
		
			ler.close();
		}
}
/*

16. Altere o programa que calcula a média do aluno, e mostre a mensagem de acordo com a
média. De 0 a 3 - Reprovado, de 3 a 6.9 - Em Exame, de 7 a 10 - Aprovado
 
*/