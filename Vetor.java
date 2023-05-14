//Exemplo do funcionamento de um vetor
public class Vetor {
    public static void main (String [] args) {
        int[] vetor = new int [4];
        vetor[0] = 1;
        vetor[1] = 2;
        vetor[2] = 3;
        vetor[3] = 4;
        for (int i = 0; i < vetor.length; i++) {
            System.out.println (vetor[i] + " ");
        }
    }
}
