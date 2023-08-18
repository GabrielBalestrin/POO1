package Lista4;

import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        char[] alfabeto = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r',
            's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };

        System.out.println("Digite o tamanho da senha: ");
        int tam = ler.nextInt();

        if (tam > 0 && tam <= 26) {
            for (int i = 0; i < tam; i++) {
                System.out.print(alfabeto[i % 21]); 
                System.out.print(alfabeto[(i + 1) % 5]); 

                if (tam % 2 == 1 && i == tam - 1) {
                    System.out.print(alfabeto[(i + 2) % 21]); 
                }
            }
        }
    }
}
