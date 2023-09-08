//Faça um método chamado mostrarTabuadas e que recebe, por parâmetro, um valor inteiro N. Calcular e imprimir as tabuadas dos números de 1 até N, ou seja, se o usuário digitou o valor 3 deve imprimir a tabuada do 1, a tabuada do 2 e a tabuada do 3. Exibir as tabuadas, dentro do método, considerando os cálculos de 1 a 10. Dessa forma,  método não deve retornar nada

import java.util.Scanner;

public class MostrarTabuadaMetodo {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("\nTABUADA");
        System.out.print("\nDigite um valor natural: ");
        int n = sc.nextInt();

        mostrarTabuada(n);

        sc.close();
    }

    public static void mostrarTabuada(int valor) {

        int i, index = 1;

        while (index <= valor) {

            System.out.println("\nTabuada do " + index);

            for (i = 0; i <= 10; ++i) {

                System.out.println("\n" + index + " x " + i + " = " + (index * i));
            }

            index++;
        }

        return;
    }
}
