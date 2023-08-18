package Lista4;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite uma data no formato dd/mm/aaaa: ");
        String data = ler.nextLine();

        String partesData[] = data.split("/");
        
        
   
        if (partesData.length == 3) {
            int dia = Integer.parseInt(partesData[0]);
            int mes = Integer.parseInt(partesData[1]);
            int ano = Integer.parseInt(partesData[2]);
            
            boolean dataValida = true;

            if (!(ano >= 1900 && ano <= 2099) || !(mes >= 1 && mes <= 12)) {
                dataValida = false;
            } else {
                int[] diasPorMes = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

                if (mes == 2 && ano % 4 == 0 && (ano % 100 != 0 || ano % 400 == 0)) {
                    dataValida = dia >= 1 && dia <= 29;
                } else {
                    dataValida = dia >= 1 && dia <= diasPorMes[mes];
                }
            }
            
            if (dataValida) {
                int[] vetorData = {dia, mes, ano};
                
                System.out.println("Data válida! Partes da data armazenadas no vetor:");
                for (int valor : vetorData) {
                    System.out.print(valor + " ");
                }
            } else {
                System.out.println("Data inválida.");
            }
        } else {
            System.out.println("Formato de data inválido.");
        }
    }
}
