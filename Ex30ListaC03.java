import javax.swing.JOptionPane;

//30. Faca programas para calcular as seguintes sequencias:
//1 + 2 + 3 + 4 + 5 + ... + n
//1 − 2 + 3 − 4 + 5 + ... + (2n − 1)
//1 + 3 + 5 + 7 + ... + (2n − 1)

public class Ex30ListaC03 {
    public static void main (String [] args) {
        //Ler valor
        int n = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número: ", "Verificar sequências", JOptionPane.INFORMATION_MESSAGE));
        int soma = 0; //Valor inicial da variável soma
        int somadoida = 0; //Valor inicial da variável somadoida
        int sinal = 1; //Variável sinal recebe 1 para póstuma regra de sinais
        int soma2 = 0; //Valor inicial da variável soma2

        //Percorrer todos os números de 1 até n
        for (int i = 1; i <= n; i++) {
            soma += i; //Somar de 1 até n
        }

        //Percorrer todos os números de 1 até 2*n-1 
        for (int i = 1; i <= 2*n - 1;  i++){ 
            somadoida += sinal * i; //somadoida é acumulada com o cálculo da operação 1 * iteração até a condição do for ser alcançada
            sinal = -sinal; //É realizado a regra de sinais depois para a iteração correta
        }
        for (int i = 1; i <= 2*n - 1; i += 2){
            soma2 += i; //soma2 acumula com iteração de i += 2
        }
        //Exibe as sequências na tela
        JOptionPane.showMessageDialog(null, soma, "1 + 2 + 3 + 4 + 5 + ... + " + n, JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog(null, somadoida,"1 − 2 + 3 − 4 + 5 + ... + (2*" + n + " − 1)",JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog(null, soma2,"1 + 3 + 5 + 7 + ... + (2*" + n + " − 1)",JOptionPane.PLAIN_MESSAGE);
    }
}
