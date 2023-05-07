import java.util.Scanner;
// Leia um número e informe quantos números primos existem até esse número
public class ListaPrimosAteN {
    public static void main (String [] args){
        Scanner scanner = new Scanner (System.in);

        // Pedir ao usuário para digitar um número
        System.out.print("Digite um número para verificar todos os primos até ele: ");
        int n = scanner.nextInt();
        scanner.close();

        // Percorrer todos os números de 2 até o número informado pelo usuário
        for (int j = 2; j <= n; j++) {
            // Calcular a raiz quadrada do número atual
            int raiz = (int) Math.sqrt(j);
            // Inicializar a variável que indica se o número é primo como true
            boolean ePrimo = true;
            // Percorrer todos os números de 2 até a raiz do número atual para verificar se é primo
            for (int i = 2; i <= raiz && ePrimo; i++) {
                if (j % i == 0) {
                    // Se o número for divisível por um número diferente de 1 e ele mesmo, não é primo
                    ePrimo = false;
                }
            }
            // Se o número for primo, exibi-lo na tela
            if (ePrimo) {
                System.out.print (j + " ");
            }
        }
    }    
}
