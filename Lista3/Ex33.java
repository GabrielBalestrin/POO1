package Lista3;
import java.util.Scanner;

public class Ex33 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        char[] gabarito = {'a', 'a', 'b', 'b', 'c', 'c', 'd', 'd', 'e', 'e'};
        char[] respostas = new char[10];
        
        for (int i = 0; i < 10; i++) {
            System.out.print("Questão " + (i + 1) + ": ");
            respostas[i] = ler.next().charAt(0);
        }
        
        int pontuacao = 0;
        System.out.println("\nRespostas dadas:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Q" + (i + 1) + " : " + respostas[i] + " : ");
            if (respostas[i] == gabarito[i]) {
                System.out.println("Correto");
                pontuacao++;
            } else {
                System.out.println("Errada, resposta correta (" + gabarito[i] + ")");
            }
        }
        
        System.out.println("\nPontuação Final: " + pontuacao);
        
        ler.close();
    }
}
