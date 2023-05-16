import javax.swing.JOptionPane;

//30. Faca programas para calcular as seguintes sequencias:
//1 + 2 + 3 + 4 + 5 + ... + n
//1 − 2 + 3 − 4 + 5 + ... + (2n − 1)
//1 + 3 + 5 + 7 + ... + (2n − 1)

public class Ex30ListaC03 {
    public static void main(String[] args) {
        // Ler valor
        int n = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número: ", "Verificar sequências 🔢",
                JOptionPane.INFORMATION_MESSAGE));
        int soma = 0; // Valor inicial da variável soma
        int somadoida = 0; // Valor inicial da variável somadoida
        int sinal = 1; // Variável sinal recebe 1 para póstuma regra de sinais
        int soma2 = 0; // Valor inicial da variável soma2

        StringBuilder sequencia1 = new StringBuilder(); // Criar StringBuilder para a sequência 1
        StringBuilder sequencia2 = new StringBuilder(); // Criar StringBuilder para a sequência 2
        StringBuilder sequencia3 = new StringBuilder(); // Criar StringBuilder para a sequência 3

        // Percorrer todos os números de 1 até n
        for (int i = 1; i <= n; i++) {
            soma += i; // Somar de 1 até n
            sequencia1.append(i); // Adicionar cada número à sequência 1

            if (i < n) {
                sequencia1.append(" + "); // Adicionar o sinal de "+" entre os números na sequência 1
            }
        }

        // Percorrer todos os números de 1 até 2*n-1
        for (int i = 1; i <= 2 * n - 1; i++) {
            somadoida += sinal * i; // somadoida é acumulada com o cálculo da operação 1 * iteração até a condição
                                    // do for ser alcançada
            sequencia2.append(i); // Adicionar cada número à sequência 2
            if (i < 2 * n - 1) { //Verificar a condição da sequência
                sequencia2.append("" + (sinal > 0 ? " - " : " + ")); // Adicionar o sinal correto entre os números na
                                                                      // sequência 2
            }
            sinal = -sinal; // É realizado a regra de sinais depois para a iteração correta

        }
        for (int i = 1; i <= 2 * n - 1; i += 2) {
            soma2 += i; // soma2 acumula com iteração de i += 2
            sequencia3.append(i); // Adicionar cada número à sequência 3
            if (i < 2 * n - 1) { // Verirficar a condição da sequência
                sequencia3.append(" + "); // Adicionar o sinal de "+" entre os números na sequência 3
            }
        }
        //Armazenar cáclulos na String
        String sequencias = "Primeira sequência: " + sequencia1.toString() + " = " + soma + "\n\nSegunda sequência: " + sequencia2.toString() + " = " + somadoida + "\n\nTerceira sequência: " + sequencia3.toString() + " = " + soma2;
        // Exibe as sequências na tela
        JOptionPane.showMessageDialog(null, sequencias, "Sequências 🔢: ", JOptionPane.PLAIN_MESSAGE);
    }
}
