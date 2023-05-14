
//Faca um programa que receba do usuario um vetor com 10 posicoes. Em seguida deveraser impresso o maior e o menor elemento do vetor.
import javax.swing.JOptionPane;

public class MaiorEMenorDoVetor {
    public static void main(String[] args) {
        int[] v = new int[10];
        for (int i = 0; i < v.length; ++i) {
            v[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Posição " + i + ": ", "Digite 10 valores",JOptionPane.DEFAULT_OPTION));
            // Para armazenar os valores digitados
            }
        int maior = v[0]; // maior = valor da primeira posição do vetor
        int menor = v[0]; // menor = valor da primeira posição do vetor
        
        for (int j = 0; j < v.length; ++j) {
            if (v[j] > maior) {
                maior = v[j]; // Pega o maior valor
            } if (v[j] < menor) {
                v[j] = menor; // Pega o menor valor
            }
        }
        JOptionPane.showMessageDialog(null, "Maior: " + maior + "\nMenor: " + menor, "Maior e Menor Valor", JOptionPane.INFORMATION_MESSAGE);
    }
}
