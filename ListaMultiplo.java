import java.util.Scanner;

public class ListaMultiplo {
    public static void main (String [] args) {
        int [] v = new  int[10]; //declarando e instanciando um vetor de inteiros
        int i;
        Scanner sc = new Scanner (System.in);
        System.out.println("Digite 10 valores: ");
        for (i = 0; i < 10; i++ ) {
            System.out.print ((i + 1) + "o: " );
            v[i] = sc.nextInt();
        }
        System.out.print ("Digite o valor para busca: ");
        int x = sc.nextInt();
        int cont = 0;
        System.out.println ("\nProcurando os multiplos de " + x);
        for (i = 0; i < 10; i++) {
            if (v[i] % x == 0) {
                System.out.print (v[i] + " ");
                cont++;
            }
        }
        System.out.println ("\n Foram encontrados " + cont + " multiplos");
        sc.close();
    } 
}
