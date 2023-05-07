import javax.swing.JOptionPane;
// Ler um número e informar a soma dos divisores desse número
public class SomaDivisores {
    public static void main (String args []) {
        // Ler um número do usuário
        int n = Integer.parseInt (JOptionPane.showInputDialog("Digite um número: "));

        // Definir a metade do número para limitar o loop
        int metade = n / 2;

        // Inicializar a variável de soma
        int soma = 0;

        // Loop para encontrar e somar os divisores de n
        for (int i = 1; i <= metade; i++) {
            if (n % i == 0) {
                soma = soma + i;
            }
        }
        
        // Exibir o resultado para o usuário
        JOptionPane.showMessageDialog(null, "Soma dos divisores: " + soma, "Resultado", JOptionPane.INFORMATION_MESSAGE);
    }
}
