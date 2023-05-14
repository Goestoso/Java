import java.util.Scanner;
//Leia um vetor de 10 posicoes. Contar e escrever quantos valores pares ele possui
public class ParesVetor {
    public static void main (String [] args) {
        int[] v = new int[10]; //Declarar o tamanho do vetor = 10
        int cont = 0; //Contador para contar a quantidade de pares
        System.out.println ("Valor de cada posição do vetor: ");
        Scanner scanner = new Scanner (System.in);
        for (int i = 0; i < v.length; ++i) { //Atribuir valores às posições do vetor
            System.out.print ("Posição " + i + ": ");
            v[i] = scanner.nextInt(); // Armazenar em cada posição da variável v um valor
        }
        scanner.close();
        for (int j = 0; j < v.length; ++j) {
            if (v[j] % 2 == 0) {
                cont++; //Contar se o resto da divisão do valor atual = 0 (Par)
            }
        }
        System.out.print("Quantidade de pares é igual a " + cont);
    } 
}
