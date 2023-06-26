public class CountMultiplesOfTwo {
    public static void main(String[] args) {
        int[] U = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25};
        int count = 0;

        for (int i = 0; i < U.length - 2; i++) {
            for (int j = i + 1; j < U.length - 1; j++) {
                for (int k = j + 1; k < U.length; k++) {
                    int sum = U[i] + U[j] + U[k];
                    if (sum % 2 == 0) {
                        count++;
                    }
                }
            }
        }

        System.out.println("Número de maneiras de escolher três números cuja soma é um múltiplo de dois: " + count);
    }
}
