package Lista3;
import java.util.Scanner;
public class Ex32 {	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.println("|---------------------------|");
		System.out.println("| Escolha 2 tipos de carnes |");
		System.out.println("|---------------------------|");
		System.out.println("| 1- Filé duplo             |");
		System.out.println("| 2- Alcatra                |");
		System.out.println("| 3- Picanha                |");
		System.out.println("|---------------------------|");
		System.out.println("|Escreva o tipo da carne    |");
		System.out.println("|---------------------------|");
		System.out.print("Escolha o primeiro tipo: ");
		String t1 = ler.nextLine();
		System.out.print("Quantos kilos deseja: ");
		float kg1 = ler.nextFloat();
		ler.nextLine();
		System.out.print("Escolha o segundo tipo: ");
		String t2 = ler.nextLine();
		System.out.print("Quantos kilos deseja: ");
		float kg2 = ler.nextFloat();
		ler.nextLine();
		System.out.print("A compra vai ser com cartão do mercado? [S/N]: ");
		char cartao = ler.nextLine().charAt(0);
		
		t1 = t1.toUpperCase();
		t2 = t2.toUpperCase();
		cartao = Character.toUpperCase(cartao);
		
		float total1=0,total2=0,desc=0;
		

		if (t1.equals("FILÉ DUPLO")) {
		    if (kg1 < 5)
		        total1 = kg1 * 4.9f;
		    else
		        total1 = kg1 * 5.8f;
		} else if (t1.equals("ALCATRA")) {
		    if (kg1 < 5)
		        total1 = kg1 * 5.9f;
		    else
		        total1 = kg1 * 6.8f;
		} else if (t1.equals("PICANHA")) {
		    if (kg1 < 5)
		        total1 = kg1 * 6.9f;
		    else
		        total1 = kg1 * 7.8f;
		}

		if (t2.equals("FILÉ DUPLO")) {
		    if (kg2 < 5)
		        total2 = kg2 * 4.9f;
		    else
		        total2 = kg2 * 5.8f;
		} else if (t2.equals("ALCATRA")) {
		    if (kg2 < 5)
		        total2 = kg2 * 5.9f;
		    else
		        total2 = kg2 * 6.8f;
		} else if (t2.equals("PICANHA")) {
		    if (kg2 < 5)
		        total2 = kg2 * 6.9f;
		    else
		        total2 = kg2 * 7.8f;
		}

    float total = total1 + total2;
   
        if (cartao == 'S') {
            desc = total * 0.95f; 
        } else {
        	desc = total * 1f;
        }

        System.out.println();
        System.out.println("|--------------------------------------------------------------------------------|");
        System.out.println("|                            Cupom Fiscal                                        |");
        System.out.println("|--------------------------------------------------------------------------------|");
        System.out.println("|Tipo de carne 1: " + t1 + " - Quantidade: " + kg1 + "kg - Valor: R$ " + total1+"|");
        System.out.println("|Tipo de carne 2: " + t2 + " - Quantidade: " + kg2 + "kg - Valor: R$ " + total2+"|");
        System.out.println("|Total a pagar: R$ " + desc+"                                                    |");
        System.out.println("|--------------------------------------------------------------------------------|");
		
		ler.close();
	}
}
