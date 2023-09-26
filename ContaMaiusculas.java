//Escreva um programa em Java que receba uma frase do teclado e informe quantas letras maiúsculas essa frase possui.

import javax.swing.JOptionPane;

public class ContaMaiusculas {
    public static void main(String[] args) {
        
        String message = JOptionPane.showInputDialog(null, "Digite uma frase: ");

        JOptionPane.showMessageDialog(null, "Possui " + contaMaiusculas(message) + " letras maiúsculas.");
    }

    public static int contaMaiusculas(String mensagem){

        int index = 0;

        for (char element : mensagem.toCharArray()) {

            if (element > 64 && element < 91)
                ++index;
        }

        return index;
    }
}
