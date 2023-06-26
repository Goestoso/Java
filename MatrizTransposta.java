public class MatrizTransposta {
    public static void main(String[] args) {
        // Definir a matriz original
        int[][] matrizOriginal = {
            {1, 8, 6},
            {5, 3, 7},
            {9, 4, 2}
        };

        // Calcular a matriz transposta
        int[][] matrizTransposta = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrizTransposta[j][i] = matrizOriginal[i][j];
            }
        }

        // Imprimir a matriz transposta
        System.out.println("Matriz Original:");
        imprimirMatriz(matrizOriginal);

        System.out.println("Matriz Transposta:");
        imprimirMatriz(matrizTransposta);
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

