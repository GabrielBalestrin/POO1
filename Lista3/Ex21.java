package Lista3;
import java.util.Scanner;

public class Ex21 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite uma data no formato dd/mm/aaaa: ");
        String data = ler.nextLine();

        int dia = Integer.parseInt(data.substring(0, 2));
        int mes = Integer.parseInt(data.substring(3, 5));
        int ano = Integer.parseInt(data.substring(6, 10));

        if (ano >= 0 && ano <= 9999 &&
            mes >= 1 && mes <= 12 &&
            dia >= 1 && dia <= 31) {

            boolean dataValida = false;

            if ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && dia <= 30) {
                dataValida = true;
            } else if (mes == 2) {
                if ((ano % 400 == 0) || (ano % 4 == 0 && ano % 100 != 0)) {
                    if (dia <= 29) {
                        dataValida = true;
                    }
                } else if (dia <= 28) {
                    dataValida = true;
                }
            } else {
                dataValida = true;
            }

            if (dataValida) {
                System.out.println("A data é válida.");
            } else {
                System.out.println("A data não é válida.");
            }
        } else {
            System.out.println("A data não é válida.");
        }

        ler.close();
    }
}
