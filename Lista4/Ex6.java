package Lista4;
import java.util.Scanner;
public class Ex6 {
	public static void main (String[] args) {
		Scanner ler = new Scanner(System.in);
		float  alunos[] =  new float [10];
		
		float med=0;
		for(int i=0;i<10;i++) {
			System.out.println("Aluno "+(i+1));
			System.out.print("Digite uma nota: ");
			float n1 = ler.nextFloat();
			System.out.print("Digite uma nota: ");
			float n2 = ler.nextFloat();
			System.out.print("Digite uma nota: ");
			float n3 = ler.nextFloat();
			System.out.print("Digite uma nota: ");
			float n4 = ler.nextFloat();
			med  =  (n1+n2+n3+n4)/ 4;
		
			alunos[i] = med;
		}
		int cont=0;
		for (int i=0; i < 10; i++) {
			if (alunos[i] >= 7) {
			cont = cont +1;	
			}
		}
		System.out.println("\nO total de número de alunos acima da média: "+cont);
		ler.close();
	}
}
