//Escreva um programa que solicita ao usuário dois números e realiza uma divisão. Certifique-se de tratar a exceção ArithmeticException caso o segundo número seja zero.

import java.util.Scanner;

public class DivisaoPorZero {

    public static void main(String[] args) {

    Scanner sc = new Scanner (System.in);
    int n1 = 0, n2 = 0;
        
    try {

            System.out.println("\nVamos dividir dois números\n");
            System.out.print("nº 1: ");
            n1 = sc.nextInt();
            System.out.print("\nnº 2: ");
            n2 = sc.nextInt();

           System.out.println(n1/n2);

        } catch (ArithmeticException e) {

            System.err.println("\nErro: " + e);

            System.out.println("\nResultado da divisão: " + metodoDivisao(n1));

        } finally {

        sc.close();

        }
    }

    public static double metodoDivisao(double v1) {

         Scanner sc = new Scanner(System.in);
         double v2 = 0;

        try {
            
            while (v2 == 0) {

                System.out.print("\nDigite um valor diferente de zero para nº 2: ");
                v2 = sc.nextDouble();
                    
            }

            return v1/v2;

        } finally {

            sc.close();
        }
    }
    
}
