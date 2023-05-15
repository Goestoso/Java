// Faca um programa para ler a nota da prova de 15 alunos e armazene num vetor, calcule e imprima a media geral.

import java.text.DecimalFormat; //DecimalFormat é usada para formatar valores numéricos em strings com uma determinada configuração de formato. Ela permite controlar o número de dígitos decimais, o separador de milhares, o símbolo de moeda, entre outras opções de formatação.
import java.util.Random;

public class MediaVetor {
    public static void main(String[] args) {
        Random random = new Random();
        DecimalFormat decimalformat = new DecimalFormat("#.##"); // Converte os números para duas casas depois da vírgula
        char[] name = new char[15];
        double[] v = new double[15];
        char a = 'a'; //Inicia a iteração com o char a

        // Percorrer todos os nomes e notas dos alunos
        for (int i = 0; i < v.length; ++i) {
            v[i] = random.nextDouble() * 10.0;
            String rounded = decimalformat.format(v[i]); // Armazena os números decimais
            
            name[i] = a; // Armazena os nomes dos alunos como letras
            a++; // A primeira iteração exibe o char a 
            System.out.println("Nota do " + name[i] + ": " + rounded); //Imprime as notas
        }
        double soma = 0; 
        for (int j = 0; j < v.length; ++j) {
            soma += v[j]; //Realiza a soma das notas
        }
        double media = soma / 15; // Calcula a média 
        System.out.print("Média Geral: " + String.format("%.2f", media)); //Imprime resultado
    }
}
