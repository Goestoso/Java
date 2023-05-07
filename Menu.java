import java.util.Scanner;

//Escreva o menu de opc¸oes abaixo. Leia a opcao do usuario e execute a operacao escolhida. Escreva uma mensagem de erro se a opcao for invalida.
//Escolha a opcao:
//1- Soma de 2 numeros.
//2- Diferenca entre 2 numeros (maior pelo menor).
//3- Produto entre 2 numeros.
//4- Divisao entre 2 numeros (o denominador nao pode ser zero).

public class Menu {
    public static void main(String [] args) {
        Scanner entrada = new Scanner (System.in);
        char continua = 's';
        while (continua == 's' || continua == 'S') {
        System.out.print("\nMenu do cálculo, escolha uma opção: \n \n1- Soma de 2 números; \n2- Diferença entre 2 números; \n3- Produto entre 2 números; \n4- Divisão entre dois números; \n \nSua opção: ");
        int opcao = entrada.nextInt();
        System.out.print ("\nValor do primeiro número: ");
        double a = entrada.nextDouble();
        System.out.print ("\nValor do segundo número: ");
        double b = entrada.nextDouble();
        switch (opcao) {
            case 1:
                double soma = a + b;
                System.out.print("\nA soma entre os dois valores é: " + soma);
            break;
            case 2: 
                double subtracao = a - b;
                System.out.print("\nA diferença entre os dois valores é: " + subtracao);
            break;
            case 3: 
                double vezes = a * b;
                System.out.print("\nO produto entre os dois valores é: " + vezes);
            break;
            case 4: 
                double divisao = a / b;
                if (b == 0){
                    System.out.println ("\nDenominador não pode ser zero!");
                }
                else {
                System.out.print("\nA divisão entre os dois valores é: " + divisao);
                }
            break;
            default: 
                System.out.print ("\nValor inválido!");
            break; 
            }
            System.out.print ("\n");
            System.out.println("\nQuer continuar? (Sim ou Não)");
            continua = entrada.next().charAt(0);           
        }
        entrada.close();       
    }    
}
