//Faça um programa que contenha um método chamado lerVetor. Dentro do método permita a leitura de 10 valores inteiros, armazene-os em um vetor, e imprima o maior e o menor deles.

import java.util.Random;

public class MetodoMaiorMenorVetor {
    public static void main(String[] args) {
        
        int i = 10;

        System.out.println("\nVamos verificar o maior valor e o menor valor do vetor...");

        imprimirVetor(lerVetor(i));
    }

    public static void imprimirVetor (int [] v) {

        int i, maior = v[0], menor = v[0];

        System.out.println("");

        for (i = 0; i < v.length; ++i) {

            System.out.print("[" + v[i] + "]");
        }

        for (i = 1; i < v.length; ++i) {
                
            if (v[i] > maior)
                maior = v[i];
            if (v[i] < menor)
                menor = v[i];
            
        }

        System.out.println("\n\nMaior: [" + maior + "]");
        System.out.println("\nMenor: [" + menor + "]");

        return;
    }

    public static int[] lerVetor(int tamanho) {

        Random r = new Random();
        int v[] = new int[tamanho];
        v[0] = r.nextInt(tamanho) + 1;

        for (int i = 1; i < v.length; i++) {
            int novo = r.nextInt(tamanho) + 1;
            boolean repete = false; // Variável para verificar se o número gerado já existe no vetor
            int j = i - 1;  // Inicia 'j' com o índice anterior a 'i'

            while (j >= 0 && !repete) { // Loop para verificar se o número gerado já existe no vetor

                if (v[j] == novo) 
                    repete = true;
                else 
                    j--;
            }
            if (repete)  // Se o número gerado já existe no vetor, decrementa 'i' para repetir a geração
                i--;
            else  // Caso contrário, atribui o número gerado à posição atual do vetor
                v[i] = novo;
        }

        return v;  // Retorna o vetor preenchido com valores aleatórios únicos
    }
}
