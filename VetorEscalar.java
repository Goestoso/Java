// 23. Ler dois conjuntos de numeros reais, armazenando-os em vetores e calcular o produto escalar entre eles. Os conjuntos tem n elementos cada. Imprimir os dois conjuntos e o produto escalar, sendo que o produto escalar e dado por: x1 ∗ y1 + x2 ∗ y2 + ... + xn ∗ yn.

import java.util.Scanner;

public class VetorEscalar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t; // Tamanho dos conjuntos A e B
        int r; // Variável para controlar se o usuário deseja continuar ou parar
        
        do {
            System.out.print("\nDigite o tamanho dos conjuntos A e B : ");
            t = sc.nextInt();
            double[] v1 = new double[t], v2 = new double[t];
            int posicao1 = 1; //Contador para exibir a posição dos elementos do conjunto A
            int posicao2 = 1; // Contador para exibir a posição dos elementos do conjunto B
            int i = 0; // Variável de controle do loop
            double escala = 0.0; // Variável para armazenar o produto escalar total
            double produto; // Variável para armazenar o produto escalar de cada posição
            StringBuilder sb = new StringBuilder(); // StringBuilder para construir a representação da operação do produto escalar

            while (i < t && i < t) { 
                for (int j = i; j < t; ++j) {
                    System.out.print("\n" + posicao1 + "º número real do conjunto A: ");
                    v1[j] = sc.nextDouble();
                    ++posicao1;
                }
                for (int j = i; j < t; ++j) {
                    System.out.print("\n" + posicao2 + "º número real do conjunto B: ");
                    v2[j] = sc.nextDouble();
                    ++posicao2;
                    ++i;
                }
            }
            if (i == t) {
                posicao1 = 0;
                System.out.println("\nProduto escalar de cada posição dos conjuntos A e B: ");
                for (int j = 0; j < t; j++) {
                    produto = (v1[j] * v2[j]);
                    escala += produto;
                    sb.append(produto);
                    if (j + 1 < t) {
                        sb.append(" + ");
                    }
                    System.out.println("\nVetores" + "[" + ++posicao1 + "]: " + v1[j] + " " + " x " + v2[j] + " "
                            + " = " + produto);
                }
            }
            System.out.print("\nTotal (" + sb.toString() + ") = " + escala);
            System.out.print("\n\nDigite 0 para continuar ou 1 para parar: ");
            r = sc.nextInt();
        } while (r == 0);
        sc.close();
    }
}