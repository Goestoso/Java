
// Faca um programa que leia dois vetores de 10 elementos. Crie um vetor que seja a intersecçao entre os 2 vetores anteriores, ou seja, que contem apenas os numeros que estao em ambos os vetores. Nao deve conter numeros repetidos
import java.util.Random;
import java.util.Set;
import java.util.HashSet;

public class VetorIntersecção {
    public static void main(String[] args) {
        Random r = new Random();
        int[] v1 = new int[10], v2 = new int[10];

        // Armazenar os valores random no 1º conjunto
        System.out.println("\nElementos do 1º vetor: \n");
        for (int i = 0; i < 10; ++i) {
            int novo = r.nextInt(21);
            v1[i] = novo;
            System.out.println((i + 1) + "º elemento: " + v1[i]);
        }
        // Armazenar os valores random no 2º conjunto
        System.out.println("\nElementos do 2º vetor: \n");
        for (int i = 0; i < 10; ++i) {
            int novo = r.nextInt(21);
            v2[i] = novo;
            System.out.println((i + 1) + "º elemento: " + v2[i]);
        }

        // Criando um conjunto para o primeiro vetor
        Set<Integer> set1 = new HashSet<>();
        for (int num : v1) {
            set1.add(num);
        }

        // Encontrando a interseção entre os dois vetores
        Set<Integer> intersecao = new HashSet<>();
        for (int num : v2) { // for-each (tipo elemento : colecao) //tipo: é o tipo do elemento que você está
                             // iterando. // elemento: é uma variável que representa cada elemento da coleção
                             // a cada iteração do loop. //colecao: é a coleção na qual você deseja iterar.
            if (set1.contains(num)) {
                intersecao.add(num);
            }
        }
        // Saída com a intersecção dos conjuntos
        System.out.print("\nIntersecção dos vetores: ");
        for (int num : intersecao) {
            System.out.print(num + " "); // Imprime cada número da interseção
        }
    }
}
