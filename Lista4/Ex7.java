package Lista4;
import java.util.Scanner;;
public class Ex7 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int vet[] = new int[5];
		int soma=0,mult=1;
		for (int i = 0; i < 5;i++) {
			System.out.print("Digite um n�mero: ");
			int n = ler.nextInt();
			vet[i] = n;
			soma += n;
			mult *= n;
		}
		ler.close();
		
		System.out.println("Essa � a soma: "+soma);
		System.out.println("Essa � a multiplica��o: "+mult);
		for (int i = 0; i <5;i++) {
			System.out.print(vet[i]+ " ");
			
		}
		
		
	}

}
