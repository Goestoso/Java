import java.util.Scanner;

//19. Escreva um algoritmo que leia um numero inteiro entre 100 e 999 e imprima na saıda cada um dos algarismos que compoem o numero 
public class Algarismos {
    public static void main (String [] args) {
        Scanner scanner = new Scanner (System.in);
        int numero;
        boolean valido; // Variável para avaliar o número informado
    
        do { //Laço para verificar se o número está dentro dos parâmetros requisitados
        System.out.print ("Digite um número inteiro entre 100 e 999: "); 
        numero = scanner.nextInt(); //Armazena o número
        if (numero < 100 || numero > 999) {
            valido = false; // Reinicia o loop
            System.out.print ("Número inválido! \nTente novamente:\n");
        }
        else {
            valido = true; //Vai para o próximo loop
        }
        } while (valido == false); //Enquanto false, reinicia o loop
        scanner.close();
        do { //laço para separar os algarismos do número
        int algarismo1 = numero % 10; // Separa a unidade
        int algarismo2 = numero / 10; // Operação para transformar número em dezena
        int algarismo3 = algarismo2 % 10; //Separa a dezena
        int algarismo4 = algarismo2 / 10; //Separa a centena
        System.out.printf ("Algarismos do número %d \ncentena: %d \ndezena: %d \nunidade: %d" , numero, algarismo4, algarismo3, algarismo1);
        } while (numero < 0); // O comando será executado apenas uma vez
    }
}
