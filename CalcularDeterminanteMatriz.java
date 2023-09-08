//Faça um programa para armazenar números inteiros em uma matriz 2x2. Em seguida criar um método chamado calcularDeterminante que irá receber a matriz e calcular e imprimir o determinante da matriz. 

public class CalcularDeterminanteMatriz {
    public static void main(String[] args) {
        
        int m[][] = {
            {3, -2},
            {4, 1},
        };

        System.out.println();
        for (int row[] : m) {
            for (int element : row) {
                System.out.print("[" + element + "]");
            }
            System.out.println();
        }

        imprimirDeterminante(m);
    }

    public static void imprimirDeterminante(int m[][]) {
 
        int a1 = m[0][0];
        int a2 = m[1][0];
        int b1 = m[0][1];
        int b2 = m[1][1];

        int determinante = (a1 * b2) - (b1 * a2);

        System.out.println("\nDeterminante = " + determinante);
        return;
    }
}
