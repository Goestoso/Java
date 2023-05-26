// 27. Leia 10 numeros inteiros e armazene em um vetor. Em seguida escreva os elementos que sao primos e suas respectivas posicoes no vetor. 

import java.util.Scanner;

public class PrimoVetor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] v = new int[10];
        int i, j;
        int cont = 0;

        System.out.println ("\nVamos descobrir quais posições têm números primos: ");
        // Armazenar dez valores
        for (i = 0; i < 10; ++i) {
            System.out.print("\n " + ++cont + "º número: ");
            v[i] = sc.nextInt();
        }
        System.out.println("\nNúmeros primos e suas respectivas posições: ");
        for (i = 0; i < 10; ++i) {
            boolean EPrimo = true;
            if (v[i] <= 1) { // Um número primo é > 1
                EPrimo = false; // A verificação é false
            } else {
                for (j = 2; j <= Math.sqrt(v[i]); j++) { // Percorrer todos os números de 2 até a raiz do número atual
                                                         // para verificar se é primo
                    if (v[i] % j == 0) {
                        EPrimo = false; // Se o número for divisível por um número diferente de 1 e ele mesmo, não é
                                        // primo
                    }
                }
            }
            if (EPrimo) { // Se o número for primo, exibi-lo na tela e a sua posição no vetor
                System.out.print("\n" + (i + 1) + "º posição: " + v[i] + " ");
            }
        }
        sc.close();
    }
}
