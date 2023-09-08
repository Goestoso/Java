//Criar um vetor que armazene 10 números e outro vetor que armazene 5 números
//Verificar se cada um dos 5 números é divisível por algum dos 10 números e imprimir na tela

import java.util.Random;

public class DivisorEntreVetores {
    public static void main(String[] args) {
        
        Random r = new Random();
        int num[] = new int[10], divs[] = new int[5], i, j;

        System.out.println("\nNum: \n");
        for (i = 0; i < 10; ++i) {

            num[i] = r.nextInt(20) + 1;
            System.out.print("[" + num[i] + "]");

        }

        System.out.println("\n\nDivs: \n");
        for (j = 0; j < 5; ++j) {

            divs[j] = r.nextInt(10) + 2;
            System.out.print("[" + divs[j] + "]");
        }

        System.out.println("");

        for (i = 0; i < 10; ++i) {
            
            int index = 0;
            boolean naoDivisor = false;

            System.out.println("\nNúmero " + num[i]);

            while (index < 5) {
                
                if (num[i] % divs[index] == 0) {
                    System.out.println("Divisível por " + divs[index] + " na posição " + (index+1));
                    naoDivisor = true;
                }

                ++index;
            }

            if (!naoDivisor)
                System.out.println("Não possui divisores no segundo vetor");

        }

    }
}
