import javax.swing.JOptionPane;
//Mostrar o maior valor do vetor
public class MaiorDoVetor {
    public static void main (String [] args) {
        int tamanho = Integer.parseInt (JOptionPane.showInputDialog (null, "Tamanho: ", "Digite o tamanho do vetor", JOptionPane.QUESTION_MESSAGE)
        ); //Ler o tamanho do vetor
        int[] v = new int[tamanho];
        for (int i = 0; i < v.length; i++) { //Preencher os campos do vetor
            v[i] = Integer.parseInt(JOptionPane.showInputDialog (null, "Valor: ", "Posição " + i, JOptionPane.QUESTION_MESSAGE));
        }
        int maior = v[0]; //Variável maior recebe o valor do primeiro valor do vetor
        for (int i = 0; i < tamanho; i++) { //Percorre cada valor de cada espaço do vetor
            if (v[i] > maior) { //Verificação para comparar cada valor do vetor com o primeiro
                maior = v[i]; //Sempre que valor atual for maior, a variável = valor atual
            }
        }
        JOptionPane.showMessageDialog (null, "Valor maior: " + maior, "Mostrar Maior Valor", JOptionPane.INFORMATION_MESSAGE);
    }
}
