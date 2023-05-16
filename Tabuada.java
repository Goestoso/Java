import java.util.Scanner;
//Montar a tabuada do número inserido de 0 a 10.
public class Tabuada {
    public static void main (String [] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.print ("Tabuada dos números");
        //Pedir ao usuário inserir um número
        System .out.print ("\nInsira um número: ");
        int n = scanner.nextInt(); //Armazenar valor inserido
        scanner.close(); //Fechar scanner

        //Percorrer todos os números de 0 até 10
        for (int i = 0; i <= 10; ++i) {
            int tabuada = n * i; //Operação da tabuada
            System.out.println (n + " x " + i + " = " + tabuada + " "); //Imprimir tabuada
        }
    }
}
