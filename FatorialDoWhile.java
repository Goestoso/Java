import java.util.Scanner;
import java.math.BigDecimal; // é uma classe que representa um número decimal preciso e de alta precisão. Diferentemente do double e do float, que são tipos de ponto flutuante e têm uma precisão limitada, o BigDecimal pode representar números com uma precisão muito alta e pode ser usado para realizar cálculos em que a precisão é crítica.

//ler um número inteiro positivo e calcular e mostrar seu fatorial usando comando do-while
public class FatorialDoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        BigDecimal fat; // criando variável para armazenar o fatorial com precisão de alta precisão

        // ler n, com validação
        do {
            System.out.print("digite um inteiro positivo: ");
            n = scanner.nextInt();
        } while (n < 0); // o loop só sairá quando n for maior ou igual a 0
        scanner.close(); // fechando o scanner para liberar recursos do sistema
        fat = BigDecimal.ONE;  // inicializando fat com 1, já que 0! = 1
        int cont = 2; // variável de controle do loop que vai multiplicar os números de 2 até n
        if (n < 2) { // caso especial para n = 0 e n = 1, em que o fatorial é 1
            System.out.printf("Fatorial de %d = 1 \n", n);
        } else { 
            do { // loop que vai multiplicar os números de 2 até n
                fat = fat.multiply(BigDecimal.valueOf(cont)); // multiplicando fat por cont (iniciando em 2) e armazenando o resultado em fat
                cont++;  // incrementando cont para multiplicar pelo próximo número
            } while (cont <= n); // o loop continua até cont ser maior que n
            System.out.println("fatorial de " + n + " = " + fat);  // mostrando o resultado
        }
    }
}
