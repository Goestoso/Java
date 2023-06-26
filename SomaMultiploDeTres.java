public class SomaMultiploDeTres {
    public static void main(String[] args) {
        int[] U = new int[37];
        int count = 0;
        for (int i = 0; i < U.length; ++i) {
            U[i] = i + 1;
        }
        for (int i = 0; i < U.length - 2; i++) {
            for (int j = i + 1; j < U.length - 1; j++) {
                for (int k = j + 1; k < U.length; k++) {
                    if ((U[i] + U[j] + U[k]) % 3 == 0) {
                        count++;
                    }
                }
            }
        }
        System.out.println("Número de maneiras de escolher três números cuja soma é múltiplo de três: " + count);
    }
}
