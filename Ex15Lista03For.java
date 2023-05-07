import java.util.Scanner;
// Faça um programa que leia um numero inteiro positivo ımpar N e imprima todos os numeros ımpares de 1 ate N em ordem crescente usando for
public class Ex15Lista03For {
    public static void main (String args []) {
        Scanner scanner = new Scanner (System.in);
        System.out.print ("digite um número inteiro: ");
        int n = scanner.nextInt();
        scanner.close();
        for (int i = 1; i <= n; i += 2) {
            System.out.print (i + " ");
        }
    }
} 