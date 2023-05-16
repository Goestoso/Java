import java.util.Scanner;

//27. Em Matematica, o numero harmonico designado por H(n) define-se como sendo a somada serie harmonica: H(n) = 1 + 1/2 + 1/3 + 1/4 + ... + 1/n 
//Faca um programa que leia um valor n inteiro e positivo e apresente o valor de H(n)
public class Harmonica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Ler valor n inteiro e positivo
        System.out.print("Digite um número inteiro para calcular a harmônica dele: ");
        int n = scanner.nextInt();
        scanner.close(); //Fecha scanner
        double harmonica = 0.0; //Variável inicia com valor vazio para acumulação 

        // Laço para percorrer todos os valores até n
        for (double i = 1; i <= n; i++) {
            harmonica += 1 / i; 
            // Para acumular valores em uma variável, é necessário realizar a operação e atribuir o resultado novamente à mesma variável usando o operador de atribuição "+="
            // Se for 'variavel = operacao' dentro de um laço, você está apenas atribuindo um novo valor à variável, sem considerar os valores anteriores
        }
        System.out.printf ("H(%d) = %.2f", n, harmonica); //Exibe o resultado no temrinal
    }
}
