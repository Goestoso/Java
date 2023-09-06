//Crie um programa que possua um método chamado calcularMedia e que recebe as 2 notas de um aluno e uma letra por parâmetro. Se a letra recebida for a letra ‘A’ o método devecalcular a média aritmética das notas do aluno, porém se a letra recebida for a ‘P’, o método deve calcular a média ponderada com pesos 7 e 3 para a primeira nota e a segunda nota, respectivamente. A média calculada deve retornar à função principal (main), sendo o valor da média exibido na main.

import java.util.Scanner;

public class CalcularMedia { 

    public static void main (String[] goes) {

        Scanner sc = new Scanner(System.in);
        int index = 0;
        System.out.print("\nDigite a primeira nota do aluno: ");
        String n1 = sc.nextLine();
        System.out.print("\nDigite a segunda nota do aluno: ");
        String n2 = sc.nextLine();

        try { // Código que pode lançar uma exceção

            ++index;
            // Verifica se a entrada contém um ponto em vez de uma vírgula
            if (n1.contains(".")) 
                n1.replace(".", ",");

            if (n2.contains(".")) 
                n2.replace(".", ",");

            // Converte as entradas para valores decimais
            double p1 = Double.parseDouble(n1);
            double p2 = Double.parseDouble(n2);
            
            System.out.print("\nDigite 'A' para calcular a média aritmética, 'P' para calcular a ponderada: ");
            char a = sc.next().charAt(0);

            while (a != 'A' && a != 'P') {
            System.out.print("\nDigite 'A' para calcular a média aritmética, 'P' para calcular a ponderada: ");
            a = sc.next().charAt(0); 

            }

            if (a == 'A') 
                calcularAritmetica(p1,p2);

            else 
                calcularPonderada(p1,p2);

            sc.close();

        } catch (NumberFormatException e) { // Isso lançará uma NumberFormatException
            
            System.err.println("\nErro ao converter a nota para um valor decimal."); //Mensagem de erro
           
            
        }

        if (index < 1) {

        double p1 = Double.parseDouble(n1);
        double p2 = Double.parseDouble(n2);
        
        System.out.print("\nDigite 'A' para calcular a média aritmética, 'P' para calcular a ponderada: ");
        char a = sc.next().charAt(0);

        while (a != 'A' && a != 'P') {
        System.out.print("\nDigite 'A' para calcular a média aritmética, 'P' para calcular a ponderada: ");
        a = sc.next().charAt(0); 

        }

        if (a == 'A') 
            calcularAritmetica(p1,p2);

        else 
            calcularPonderada(p1,p2);

    }

        sc.close();
    }

    public static void calcularAritmetica (double nota1, double nota2) {

        double media = (nota1 + nota2)/2;
        System.out.println("\nMédia aritmética: " + String.format("%.2f", media));

    }

    public static void calcularPonderada(double nota1, double nota2){

         double ponderada = ((nota1 * 7) + (nota2 * 3))/10;
         System.out.println("\nMédia ponderada: " + String.format("%.2f", ponderada));

    }
}