import java.util.Scanner;

//14. Um programa que leia um numero inteiro positivo par N e imprima todos os numeros pares de 0 ate N em ordem decrescente.
public class ListaPares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Pedir ao usuário para digitar um número
        System.out.print("\nInforme um número inteiro positivo: ");
        int n = scanner.nextInt();
        scanner.close();
        System.out.print ("\nLista dos números pares até " + n + ":\n");

        //Verificar se o número é par
        if (n % 2 != 0) {
            n--; //incremento --n para diminuir o valor em 1
        }

        //Percorrer todos os números pares de n até 0 (em ordem decrescente)
        for (int i = n; i >= 0; i -= 2){
            System.out.println (i + " ");
        }
    }
}
