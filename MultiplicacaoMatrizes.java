public class MultiplicacaoMatrizes {
    public static void main(String[] args) {
        // Definir as matrizes
        int[][] matrizA = {
            {1, 8, 6},
            {5, 3, 7},
            {9, 4, 2}
        };

        int[][] matrizB = {
            {1, 5, 9},
            {8, 3, 4},
            {6, 7, 2}
        };

        // Verificar se as matrizes são multiplicáveis
        if (matrizA[0].length != matrizB.length) {
            System.out.println("As matrizes não são multiplicáveis.");
            return;
        }

        // Calcular a multiplicação de matrizes
        int[][] matrizResultado = new int[matrizA.length][matrizB[0].length];
        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizB[0].length; j++) {
                int soma = 0;
                for (int k = 0; k < matrizA[0].length; k++) {
                    soma += matrizA[i][k] * matrizB[k][j];
                }
                matrizResultado[i][j] = soma;
            }
        }

        // Imprimir a matriz resultado
        System.out.println("Matriz Resultado:");
        imprimirMatriz(matrizResultado);
    }

    public static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
