package Lista4;
import java.util.Scanner;
public class Ex11 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
                
        System.out.print("Digite uma palavra com (;): ");
        String cadeia = ler.nextLine();
        
        String palavra[] = cadeia.split(";");
        
        for (int i = 0; i < palavra.length; i++) {
            System.out.println("Palavra " + (i + 1) + ": " + palavra[i]);
        }
        ler.close();
    }
}
