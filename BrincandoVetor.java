import java.util.Scanner;
import java.util.Random;

public class BrincandoVetor {
    public static void main(String[] args) {
        int[] v;
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um tamanho de vetor para comecar: ");
        int t = sc.nextInt();
        System.out.print("\nO vetor: ");
        while (t > 0) {
            v = new int[t];
            v[0] = r.nextInt(t);
            for (int i = 1; i < t; i++) {
                int novo = r.nextInt(t);
                boolean repete = false;
                int j = i - 1;
                while (j >= 0 && !repete) {
                    if (v[j] == novo) {
                        repete = true;
                    } else {
                        j--;
                    }
                }
                if (repete) {
                    i--;
                } else {
                    v[i] = novo;
                    System.out.print (v[i] + " ");
                }
            }
            System.out.print("\n\nDigite outro tamanho, 0 encerra: ");
            t = sc.nextInt();
        }
        sc.close();
    }
}
