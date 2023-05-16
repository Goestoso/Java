import java.util.Scanner;
//Faça um programa que leia um numero inteiro positivo ımpar N e imprima todos os numeros ımpares de 1 ate N em ordem crescente usando while
public class Ex15Lista03 {
    public static void main (String args[]) {
        Scanner scanner = new Scanner (System.in);
        System.out.print ("Digite um número inteiro: ");
        int n = scanner.nextInt();
        int i = 1; // início
        while (i <= n) { // fim
            System.out.println (i + " ");
            i = i + 2; // passo
        }
        scanner.close();
    }
}