//Faça um programa que contenha um método que verifique se um valor é perfeito ou não. Um valor é dito perfeito quando ele é igual a soma dos seus divisores.

import java.util.Scanner;

public class MetodoNumPerfeito {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("\nDigite um número: ");
        int n = sc.nextInt();

        System.out.println("\nVamos verificar se ele é perfeito (ele deve ser igual a soma dos seus divisores)...");

        if (verificaPerfeito(n))
            System.out.println("\nÉ um número perfeito!");
        else 
            System.out.println("\nNão é um número perfeito.");

        sc.close();
    }

    public static boolean verificaPerfeito(int valor) {
        int perfeito = 0;
        StringBuffer str = new StringBuffer("");

        for (int i = 1; i < valor; ++i) {
            
            if (valor % i == 0) {
                str.append(i + " + ");
                perfeito += i;
            }
        }

        int lastIndex = str.lastIndexOf("+");
        str.deleteCharAt(lastIndex);
        lastIndex = str.lastIndexOf(" ");
        str.deleteCharAt(lastIndex);
        int index = str.length();

        if (perfeito == valor) {
            str.insert(index-1, " = " + valor);
            System.out.println("\n" + str);
            return true;
        }
        else {
            str.insert(index-1, " != " + valor);
            System.out.println("\n" + str);
            return false;
        }
    }
}
