
//Faca um programa que receba do usuario um vetor com 10 posicoes. Em seguida deveraser impresso o maior e o menor elemento do vetor e mostrar a posição deles
import javax.swing.JOptionPane;

public class MaiorEMenorDoVetor {
    public static void main(String[] args) {
        int[] v = new int[10];

        StringBuilder Maior = new StringBuilder("");
        StringBuilder Menor = new StringBuilder("");

        for (int i = 0; i < v.length; ++i) {
            v[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Posição " + i + ": ", "Digite 10 valores",
                    JOptionPane.DEFAULT_OPTION));
            // Para armazenar os valores digitados
        }
        int maior = v[0]; // maior = valor da primeira posição do vetor
        int menor = v[0]; // menor = valor da primeira posição do vetor

        for (int j = 0; j < v.length; ++j) {
            if (v[j] > maior) { // Condição caso seja maior que a variável
                maior = v[j]; // Pega o maior valor
                Maior.setLength(0); // O comprimento da String é zerado
                Maior.append(j); // Armazena a iteração em que a condição é atendida

            } else if (v[j] == maior) { // Se a condição anterior não for atendida
                Maior.append(" , ").append(j); // Concatena as iterações repetidas com ,
            }

            if (v[j] < menor) { // Condição caso seja menor que a variável
                menor = v[j]; // Pega o menor valor
                Menor.setLength(0); // O comprimento da String é zerado
                Menor.append(j); // Armazena a iteração em que a condição é atendida
            } else if (v[j] == menor) { // Se a condição anterior não for atendida
                if (Menor.length() > 0) { // Verifica se o comprimento da String é > 0
                    Menor.append(" , "); // Caso seja atentida a condição, concatena com ,
                }
                Menor.append(j); // Concatena as iterações com valores repetidos
            }

        }
        // Exibe na tela
        JOptionPane
                .showMessageDialog(null,
                        "Posição do maior : " + Maior.toString() + " = " + maior + "\nPosição do menor: "
                                + Menor.toString() + " = " + menor,
                        "Maior e Menor Valor", JOptionPane.INFORMATION_MESSAGE);
    }
}
