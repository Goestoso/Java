//Escreva um programa que dados um inteiro n e um caractere ch, solicite que o usuário informe n palavras que começam com a letra ch. Se o usuário informar alguma palavra que não comece com a letra ch, o programa deve exibir uma mensagem informando que a palavra não começa com a letra ch. No final o programa deve exibir as n palavras digitadas pelo usuário que começam com a letra ch.

import javax.swing.JOptionPane;

public class Npalavras {
    public static void main(String[] args) {
        
        int n = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantidade de palavaras que você vai digitar: ", "", JOptionPane.PLAIN_MESSAGE)), index = 0;

        String palavra = "";

        String[] palavrasComALetra = new String[n];

        while (n >= 1) {

            palavra = JOptionPane.showInputDialog(null, "palavra " + (index + 1) + ": ", "", JOptionPane.PLAIN_MESSAGE);

            palavrasComALetra[index] = palavra;

            if (palavra.startsWith("ch") == false) 
                JOptionPane.showMessageDialog(null, "Não começa com ch!");

        ++index;
        --n;
        }

         StringBuffer palavrasComCh = new StringBuffer("");

         for (String element : palavrasComALetra) {

            if (element.startsWith("ch")) 
            palavrasComCh.append(element + " ");

         }

         JOptionPane.showMessageDialog(null, palavrasComCh, "Palavras que começam com ch", JOptionPane.INFORMATION_MESSAGE);
    }
    
}
