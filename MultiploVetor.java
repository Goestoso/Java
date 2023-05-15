//Faca um programa que leia um vetor de 10 numeros. Leia um numero x. Conte os multiplos de um numero inteiro x num vetor e mostre-os na tela
import java.util.Random;
import java.util.Scanner;

public class MultiploVetor {
    public static void main (String [] args) {
        Random random = new Random ();
        Scanner scanner = new Scanner (System.in);
        int[] v = new int[10];
        int i = 0; //Sentinela do primeiro while
        while (i < v.length) {
            v[i] = random.nextInt(101);
            ++i;
        }
        System.out.print ("x = " );
        int n = scanner.nextInt();
        scanner.close();
        int j = 0; //Sentinela do segundo while
        int count = 0;
        System.out.println ("Números múltiplos de x: ");
        while (j < v.length) { 
            if (v[j] % n == 0) { //Condição para ser múltiplo 
                System.out.println ("Posição " + j + ": " + v[j]); //Mostra as posições dos multiplos
                ++count; //
            }
            ++j;
        }
        //Exibir quantidade
        System.out.println ("A quantidade de múltiplos de " + n + " = " + count);
    }
}
