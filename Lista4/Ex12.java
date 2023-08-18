package Lista4;

import java.util.Scanner;

public class Ex12 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		float altura[] = new float[5];
		int idade[] = new int[5];
		float alturaInv[] = new float[5];
		int idadeInv[] = new int[5];
		
		 float maisVelhoH=0,maisJovemH=0,maisBaixoH=0,maisAltoH=0;
		 int maisVelhoId=0,maisJovemId=0,maisBaixoId=0,maisAltoId=0;
		 
		 for (int i = 0; i < 5; i++) {
			    System.out.print("Digite a idade da pessoa " + (i + 1) + ": ");
			    int id = ler.nextInt();
			    idade[i] = id;
			    System.out.print("Digite a altura da pessoa " + (i + 1) + ": ");
			    float h = ler.nextFloat();
			    altura[i] = h;

			    if (i == 0) {
			        maisVelhoId = id;
			        maisVelhoH  = h;
			        maisJovemId = id;
			        maisJovemH = h;
			        maisBaixoId = id;
			        maisBaixoH = h;
			        maisAltoId = id;
			        maisAltoH = h;	
			    } else {
			        if (id > maisVelhoId) {
			            maisVelhoId = id;
			            maisVelhoH = h;
			        }
			        if (id < maisJovemId) {
			            maisJovemId = id;
			            maisJovemH = h;
			        }
			        if (h < maisBaixoH) {
			            maisBaixoId = id;
			            maisBaixoH = h;
			        }
			        if (h > maisAltoH) {
			            maisAltoId = id;
			            maisAltoH = h;
			        }
			    }
			}

		for (int i = 4; i >=0;i--) {
			alturaInv[5 - 1 - i] = altura[i];
			idadeInv[5 - 1 - i] = idade[i];
		}
		
		
		System.out.println("\nArray invertido da altura: ");
		for (int i = 0; i < 5;i++) {
			System.out.print(alturaInv[i]+" ");
		}
		System.out.println("\nArray invertido da idade: ");
		for (int i = 0; i < 5; i++) {
			System.out.print(idadeInv[i]+" ");
		}
		System.out.println();
		float somaIdades = 0;
		float somaAlturas = 0;
		for (int i = 0; i < 5; i++) {
		    somaIdades += idade[i];
		    somaAlturas += altura[i];
		}

		float mediaIdade = somaIdades / 5;
		float mediaAltura = somaAlturas / 5;

		System.out.println("Pessoa mais velha: Idade = " + maisVelhoId + ", Altura = " + maisVelhoH);
		System.out.println("Pessoa mais jovem: Idade = " + maisJovemId + ", Altura = " + maisJovemH);

		System.out.println("Pessoa mais alta: Idade = " + maisAltoId + ", Altura = " + maisAltoH);
		System.out.println("Pessoa mais baixa: Idade = " + maisBaixoId + ", Altura = " + maisBaixoH);

		System.out.println("Média de idade: " + mediaIdade);
		System.out.println("Média de altura: " + mediaAltura);

		System.out.println("Pessoas acima da média de idade:");
		for (int i = 0; i < 5; i++) {
		    if (idade[i] > mediaIdade) {
		        System.out.println("Idade: " + idade[i] + ", Altura: " + altura[i]);
		    }
		}
		System.out.println("Pessoas acima da média de altura:");
		for (int i = 0; i < 5; i++) {
		    if (altura[i] > mediaAltura) {
		        System.out.println("Idade: " + idade[i] + ", Altura: " + altura[i]);
		    }
		}
			
		ler.close();
	}
}