import javax.swing.JOptionPane;
//Calculando fatorial com do-while usando JOptionPane
public class Fatorial0aN {
    public static void main(String[] args) {
        int n; // Declara a variável n (será usada para armazenar o número digitado pelo usuário)
        
        // Inicia um loop do-while que solicita que o usuário digite um número inteiro positivo
        do { 
            // Exibe uma caixa de diálogo para o usuário digitar um número inteiro
            n = Integer.parseInt(
                    JOptionPane.showInputDialog("Digite um inteiro positivo")); 
        } while (n < 0); // Continua a exibir a caixa de diálogo enquanto o número digitado for negativo
        String s = ""; // Declara a variável s (será usada para armazenar a string que será exibida para o usuário)

        // Inicia um loop for que irá percorrer os números de 0 até n (inclusivo)
        for (int i = 0; i <= n; i++) {
            // Declara a variável cont (será usada para iterar sobre os números do fatorial)
            int cont = 2;

            // Declara a variável cont (será usada para iterar sobre os números do fatorial)
            double fat = 1;

            // Inicia um loop while que irá calcular o fatorial do número i
            while (cont <= i) {
                fat = fat * cont; // Multiplica o valor atual de fat pelo valor atual de cont 
                cont++; // Incrementa cont em 1
            }
            // Cria uma string que contém o número i, o fatorial de i e uma quebra de linha
            s = s  + "fatorial de " + i +  " = "  + String.format("%.0f", fat) + "\n";
        }
        // Exibe uma caixa de diálogo com a string s
        JOptionPane.showMessageDialog(null, s, "Fatorial de " + n, JOptionPane.DEFAULT_OPTION);
    }
}
