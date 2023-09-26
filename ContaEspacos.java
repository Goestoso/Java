//Escreva um programa em Java que receba uma frase do teclado e informe quantos espaços essa frase possui.

import javax.swing.JOptionPane;

public class ContaEspacos {
    
    public static void main(String[] args) {
        
        String message = JOptionPane.showInputDialog(null, "Digite uma frase: ", "Espaços na frase...", JOptionPane.PLAIN_MESSAGE);

        JOptionPane.showMessageDialog(null, "Sua frase possui " + contaEspacos(message) + " espaço(s).", "Então...", JOptionPane.INFORMATION_MESSAGE);

    }

    public static int contaEspacos(String mensagem) {

        int index = 0;
        char[] msg = mensagem.toCharArray();

        for (int i = 0; i < msg.length; ++i) {

            if (msg[i] == ' ')
                ++index;
        }

        return index;
        
    }
}
