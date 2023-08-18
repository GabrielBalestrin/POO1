package Lista4;
import java.util.Scanner;
public class Ex3 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		final int TAM = 4;
		float vetor[] = new float[TAM];
		
		float med =0,soma=0;
		for (int i =0; i < 4;i++) {
			System.out.print("Digite uma nota: ");
			float nota = ler.nextFloat();
			soma = soma + nota;
			vetor[i] = nota;
		}
			med = soma / TAM;
		
		for (int i =0; i < TAM; i++) {
			System.out.println("Nota "+(i+1)+": "+vetor[i]);
		}
		System.out.println("A média é de: "+med);
		
		ler.close();
	}

}
