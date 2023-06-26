public class SomaMultiploDeDois {
    public static void main(String[] args) {
        int[] U = new int[13];
        int count = 0;
        U[0] = 1;
        for (int i = 1; i < 13; ++i) {
            U[i] = i;
        }

        for (int i = 0; i < U.length - 3; i++) {
            for (int j = i + 1; j < U.length - 2; j++) {
                for (int k = j + 1; k < U.length - 1; k++) {
                    for (int l = k + 1; l < U.length; l++) {
                        if ((U[i] + U[j] + U[k] + U[l]) % 2 == 0) {
                            count++;
                        }
                    }
                }
            }
        }

        System.out.println("Número de maneiras de escolher quatro números cuja soma é múltiplo de dois: " + count);
    }
}
