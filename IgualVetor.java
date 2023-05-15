//Faca um programa que leia um vetor de 10 posicoes e verifique se existem valores iguais e os escreva na tela.

import java.util.Scanner;
import java.util.HashSet; //A classe HashSet é uma implementação da interface Set na linguagem Java. Ela representa uma coleção de elementos únicos, em que a ordem dos elementos não é garantida.
import java.util.Set; //A interface Set no Java define um conjunto de métodos para manipular conjuntos de elementos.

public class IgualVetor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] v = new int[10];
        int i = 0;

        // Conjunto para armazenar os números iguais
        Set <Integer> niguais = new HashSet<>(); // Os sinais <> são conhecidos como "diamond operator" ou "operador diamante" em Java. Eles são usados para inferir automaticamente o tipo de dados de uma classe genérica quando você está instanciando um objeto.

         // Conjunto para verificar os números únicos
        Set <Integer> nunicos = new HashSet<>();

        do {
            System.out.print("Posição " + i + ": \n");
            v[i] = scanner.nextInt();

            // Verifica se o número já existe no conjunto de números únicos
            // Se já existir, adiciona-o ao conjunto de números iguais
            if (!nunicos.add(v[i])) { //O operador ! é usado para negar o resultado do método add(v[i]). O método add() retorna um valor booleano indicando se o elemento foi adicionado com sucesso ao conjunto ou não

                niguais.add(v[i]); //Verifica-se se o valor já existe no conjunto de números únicos usando o método add(). 
            }
            ++i;
        } while (i < v.length);
        scanner.close();

        // Verifica se existem números iguais
        if (niguais.isEmpty()){
            System.out.println("Não existem números iguais!");
        }
        else { // Exibe os números iguais
            System.out.print ("Números iguais: ");
            for (int numero : niguais){ // Itera-se sobre o conjunto niguais utilizando um loop for-each para exibir os números repetidos.
                System.out.print (numero + " ");
            }
            System.out.println(); //Para imprimir uma nova linha vazia após a exibição dos números iguais.
        }
    }
}