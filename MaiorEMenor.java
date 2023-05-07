import javax.swing.JOptionPane;
//Usuário insere vários números (número negativo para o looping), mostrar o maior e o menor

public class MaiorEMenor {
    static public void main (String [] args) {
        int numero, maior = Integer.MIN_VALUE, menor = Integer.MAX_VALUE;

        while (true) {
            String input = JOptionPane.showInputDialog("Digite um número inteiro (negativo para sair):");

            try {
                numero = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                continue;
            }

            if (numero < 0) {
                break;
            }

            if (numero > maior) {
                maior = numero;
            }

            if (numero < menor) {
                menor = numero;
            }
        }

        if (maior != Integer.MIN_VALUE) {
            JOptionPane.showMessageDialog(null, "O maior número lido foi: " + maior);
        }

        if (menor != Integer.MAX_VALUE) {
            JOptionPane.showMessageDialog(null, "O menor número lido foi: " + menor);
        }
    }
}
    

