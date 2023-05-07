import java.util.Scanner;
//Listar números ímpares até número informado
public class ListaImpar {
    public static void main (String [] args) {
        Scanner scanner = new Scanner (System.in);

        //Informar número inteiro positivo
        System.out.print ("\nInforme um número inteiro positivo: ");
        int n = scanner.nextInt();
        scanner.close();
        System.out.println ("\nLista números dos ímpares até " + n + ": ");

        int cont = 2;
        //Laço para listar os números ímpares
        while (n >= 1) {
            if (n % 2 != 0) { //Condição para número declarado ser ímpar
                System.out.println (n);
            }
            else { //Condição para número declarado ser par
                n--;
                System.out.println (n);
            }
            n -= cont;
         }
    }
}  
