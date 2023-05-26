//29. Faca um programa que receba 6 numeros inteiros e mostre: 
//• Os numeros pares digitados; 
//• A soma dos numeros pares digitados; 
//• Os numeros ımpares digitados;
//• A quantidade de numeros ımpares digitados;

import java.util.Scanner;

public class SomaParImparVetor {
    public static void main (String [] args) {
        Scanner sc = new Scanner (System.in);
        int [] v = new int [6];
        System.out.println("Digite 6 números inteiros: ");
        int cont = 0;
        int somapar = 0, somaimpar = 0;
        String par = " ", impar = " ";
        while (cont < 6) { //Reeber os 6 números digitados
            System.out.print ((cont + 1) + "º valor: ");
            v[cont] = sc.nextInt();
            ++cont;
        }
        for (int i = 0; i < 6; ++i) { //Laço dos números pares
            if (v[i] % 2 == 0) {
                 par += "\n" + v[i] + " "; //Concatenar os valores pares
                somapar += v[i]; //Somar valores pares
            }
        }
        for (int i = 0; i < 6; ++i){ //Laço dos números ímpares
            if (v[i] % 2 !=0 ) {
                impar += "\n" + v[i] + " "; //Concatenar os valores ímpares
                somaimpar += v[i]; //Somar valores ímpares
            }
        }
        System.out.print ("\nNúmeros pares: " + par);
        System.out.print ("\nSoma dos números pares: " + somapar);
        System.out.print("\n\nNúmeros ímpares: " + impar);
        System.out.print ("\nSoma dos números ímpares: " + somaimpar);
        sc.close();
    }
}
