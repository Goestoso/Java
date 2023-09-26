//Escreva um programa em Java que receba uma frase, conte as vogais e apresente o histograma da frequência de cada letra. Considere que a linha de texto não contém acentuação. Por exemplo:
//Linha de texto: “Os ultimos Jogos Olimpicos foram no Brasil”
//Histograma:
//a: ** (2)
//e: (0)
//i: **** (4)
//o: ******** (8)
//u: * (1)

import javax.swing.JOptionPane;

public class Histograma {
    public static void main(String[] args) {
        
        String message = JOptionPane.showInputDialog(null, "Digite uma frase: ", "Histograma", JOptionPane.PLAIN_MESSAGE);

        JOptionPane.showMessageDialog(null, contaVogais(message), "Histograma", JOptionPane.INFORMATION_MESSAGE);
    }

    public static String contaVogais (String mensagem){

        int index = 0;

        boolean isE = true, isI = true,  isO = true, isU = true;

        StringBuffer newMessage = new StringBuffer("a: ");

        mensagem.toLowerCase();

        for (char element : mensagem.toCharArray()) {

            if (element == 'a') {
            ++index;
            newMessage.append("*");
            }
            if (element == 'e' && isE) {

                newMessage.insert(newMessage.length(), " (" + index + ")\n");
                newMessage.append("e: ");
                index = 0;

            }if (element == 'e') {

                ++index;
                newMessage.append("*");
            }
            
            if (element == 'i' && isI) {

                newMessage.insert(newMessage.length(), " (" + index + ")\n");
                newMessage.append("i: ");
                index = 0;

            }
            
            if (element == 'i') {

                ++index;
                newMessage.append("*");
            }

            if (element == 'o' && isO) {

                newMessage.insert(newMessage.length(), " (" + index + ")\n");
                newMessage.append("o: ");
                index = 0;

            }
            
            if (element == 'o') {

                ++index;
                newMessage.append("*");
            }

            if (element == 'u' && isU) {

                newMessage.insert(newMessage.length(), " (" + index + ")\n");
                newMessage.append("u: ");
                index = 0;

            }
            
            if (element == 'u') {

                ++index;
                newMessage.append("*");
            }
        }

        newMessage.insert(newMessage.length(), " (" + index + ")\n");

        return newMessage.toString();
    }
}
