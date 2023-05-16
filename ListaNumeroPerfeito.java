import javax.swing.JOptionPane;
//Listar números perfeitos até o número informado pelo usuário.
public class ListaNumeroPerfeito {
    public static void main (String [] args) {
        // Lê um número inteiro digitado pelo usuário
        int n = Integer.parseInt (JOptionPane.showInputDialog("Digite um número: "));

        // Declara a variável 'saida' como uma string vazia
        String saida = "";

        // Loop que percorre todos os números de 1 até 'n'
        for (int i = 1; i <= n; i++) {     
            // Declara as variáveis 'metade' e 'soma' como 0   
            int metade = i / 2;
            int soma = 0;

            // Loop que percorre todos os números de 1 até 'metade'
            for (int j = 1; j <= metade; j++) {
                // Verifica se 'i' é divisível por 'j' e, se sim, adiciona 'j' à 'soma'
                if (i % j == 0) {
                    soma = soma + j;
                }
            }

            // Verifica se a soma dos divisores de 'i' é igual a 'i' e, se sim, adiciona 'i' à 'saida'
            if (i == soma) {
                saida = saida + i + " ";
            }
        }

        // Exibe a lista de números perfeitos em uma mensagem de diálogo
        JOptionPane.showMessageDialog(null, saida, "Números perfeitos de: " + 1 + " a " + n, JOptionPane.INFORMATION_MESSAGE);
    } 
}
