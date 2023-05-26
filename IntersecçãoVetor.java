//30. Faca um programa que leia dois vetores de 10 elementos. Crie um vetor que seja a interseccao entre os 2 vetores anteriores, ou seja, que contem apenas os numeros que estao em ambos os vetores. Nao deve conter numeros repetidos. 

import java.util.Random;

public class IntersecçãoVetor {
    public static void main(String[] args) {
        Random r = new Random();
        int[] v1 = new int[10], v2 = new int[10], interseccao = new int[10];
        System.out.println("\nPrimeiro conjunto: ");
        for (int i = 0; i < 10; ++i) { // Primeiro vetor
            v1[i] = r.nextInt(21);
            System.out.print("\n" + (i + 1) + "º valor: " + v1[i]);
        }
        System.out.print("\n\nSegundo conjunto: \n");
        for (int i = 0; i < 10; ++i) { // Segundo vetor
            v2[i] = r.nextInt(21);
            System.out.print("\n" + (i + 1) + "º valor: " + v2[i]);
        }
        int t = 0;
        // Encontrar a intersecção
        for (int i = 0; i < 10; i++) {
            boolean found = false;
            for (int j = 0; j < 10 && !found; j++) {
                if (v1[i] == v2[j]) {
                    found = true;
                }
            }
            if (found) {
                interseccao[t] = v1[i];
                t++;
            }
        }
        // Criar vetor sem repetições
        int[] interseccaoSemRepeticoes = new int[t];
        int index = 0; // Variável de iteração das não repetições
        for (int i = 0; i < t; i++) { 
            boolean repetido = false; //Verificação da repetição
            for (int j = 0; j < index; j++) {
                if (interseccao[i] == interseccaoSemRepeticoes[j]) {
                    repetido = true; // Sentinela repetido = true pois foi encontrada uma repetição
                }
            }
            if (!repetido) {
                interseccaoSemRepeticoes[index] = interseccao[i]; // Se a sentinela encontrar a repetição, armazená-la dentro de outro vetor
                index++; //Aumenta o tamanho do vetor interseccaoSemRepeticoes a cada repetido = true
            }
        }

        String intersec = " ";
        System.out.print("\n\nInterseção dos conjuntos (sem repetições): [");
        for (int i = 0; i < index; ++i) {          //String.valueOf converte qualquer valor para o formato string
            intersec = (i < index - 1) ? interseccaoSemRepeticoes[i] + ", " : String.valueOf(interseccaoSemRepeticoes[i]);
            System.out.print(intersec);
        }
        System.out.print ("]");
    }
}