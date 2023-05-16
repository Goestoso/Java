import java.util.Scanner;
//Descobrir se o número é par ou ímpar.
public class ParImpar {

    public static void main (String [] args) {
        //entrada
        Scanner scanner = new Scanner (System.in); 
        System.out.print ("digite um numero inteiro: ");
        int numero = scanner.nextInt();
        //processamento
        if (numero % 2 == 0) {
            //saída
            System.out.println (numero + " é par ");

        }
        //processamento
        else {
            //saída
            System.out.println (numero + " é ímpar");
        }
            scanner.close();
    }
}
