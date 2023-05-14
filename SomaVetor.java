//Ler o tamanho de uma lista
//Ler os valores e preencher a lista
//Somar todos os valores e exibir a lista
import java.util.Scanner;

public class SomaVetor {
    public static void main (String [] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println ("Qual é o tamanho da lista? ");
        int tamanho = scanner.nextInt();
        int[] v = new int[tamanho]; // Cria um vetor com o tamanho informado
        for (int i = 0; i < v.length; i++) {
            System.out.print ("Posição " + i + " : " );
            v[i] = scanner.nextInt(); // Preenche o vetor com valores informados pelo usuário
        }
        //Somar posição a posição
        int soma = 0;
        for (int i = 0; i < tamanho; i++) { 
            soma += v[i]; //Soma os valores declarados pelo usuário
        }
        System.out.println("A soma é " + soma);
        scanner.close();
    }
}
