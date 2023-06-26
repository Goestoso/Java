public class MatrizInversa {
    public static void main(String[] args) {
        // Defina a matriz original
        double[][] matrizOriginal = {
                {5, -1, -1},
                {4, -3, 0},
                {-2, 4, -1}
        };

        // Calcule o determinante da matriz original
        double determinante = calcularDeterminante(matrizOriginal);

        // Verifique se a matriz é inversível
        if (determinante == 0) {
            System.out.println("A matriz não possui inversa.");
        } else {
            // Calcule a matriz adjunta
            double[][] matrizAdjunta = calcularMatrizAdjunta(matrizOriginal);

            // Calcule a matriz inversa dividindo a matriz adjunta pelo determinante
            double[][] matrizInversa = multiplicarPorEscalar(matrizAdjunta, 1 / determinante);

            // Imprima a matriz inversa
            imprimirMatriz(matrizInversa);
        }
    }

    // Função para calcular o determinante de uma matriz 3x3
    public static double calcularDeterminante(double[][] matriz) {
        double determinante = 0;

        determinante += matriz[0][0] * (matriz[1][1] * matriz[2][2] - matriz[1][2] * matriz[2][1]);
        determinante -= matriz[0][1] * (matriz[1][0] * matriz[2][2] - matriz[1][2] * matriz[2][0]);
        determinante += matriz[0][2] * (matriz[1][0] * matriz[2][1] - matriz[1][1] * matriz[2][0]);

        return determinante;
    }

    // Função para calcular a matriz adjunta de uma matriz 3x3
    public static double[][] calcularMatrizAdjunta(double[][] matriz) {
        double[][] matrizAdjunta = new double[3][3];

        matrizAdjunta[0][0] = matriz[1][1] * matriz[2][2] - matriz[1][2] * matriz[2][1];
        matrizAdjunta[0][1] = -(matriz[1][0] * matriz[2][2] - matriz[1][2] * matriz[2][0]);
        matrizAdjunta[0][2] = matriz[1][0] * matriz[2][1] - matriz[1][1] * matriz[2][0];

        matrizAdjunta[1][0] = -(matriz[0][1] * matriz[2][2] - matriz[0][2] * matriz[2][1]);
        matrizAdjunta[1][1] = matriz[0][0] * matriz[2][2] - matriz[0][2] * matriz[2][0];
        matrizAdjunta[1][2] = -(matriz[0][0] * matriz[2][1] - matriz[0][1] * matriz[2][0]);

        matrizAdjunta[2][0] = matriz[0][1] * matriz[1][2] - matriz[0][2] * matriz[1][1];
        matrizAdjunta[2][1] = -(matriz[0][0] * matriz[1][2] - matriz[0][2] * matriz[1][0]);
        matrizAdjunta[2][2] = matriz[0][0] * matriz[1][1] - matriz[0][1] * matriz[1][0];

        return matrizAdjunta;
    }

    // Função para multiplicar uma matriz por um escalar
    public static double[][] multiplicarPorEscalar(double[][] matriz, double escalar) {
        double[][] resultado = new double[matriz.length][matriz[0].length];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                resultado[i][j] = matriz[i][j] * escalar;
            }
        }

        return resultado;
    }
    
    
    // Função para imprimir uma matriz
    public static void imprimirMatriz(double[][] matriz) {
        System.out.print ("Matriz inversa: \n");
        for (double[] linha : matriz) {
            for (double elemento : linha) {
                System.out.print(elemento + " | ");
            }
            System.out.println();
        }
    }
}
