import java.util.Scanner;

// Leia um número e informe se ele é primo ou não
public class NumeroPrimo {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número para verificar se ele é primo: ");
        int n = scanner.nextInt();
        scanner.close();

        // Verificar se o número é primo
        int raiz = (int) Math.sqrt(n);
        boolean ePrimo = true;

        // Percorrer todos os números de 2 até a raiz do número para verificar se ele é
        // divisível
        for (int i = 2; i <= raiz && ePrimo; i++) {
            if (n % i == 0) {
                // Se o número for divisível por um número diferente de 1 e ele mesmo, não é
                // primo
                ePrimo = false;
            }
        }
        // Exibir mensagem informando se o número é primo ou não
        if (ePrimo) {
            System.out.println(n + " é primo");
        } else {
            System.out.println(n + " não é primo");
        }
    }
}
