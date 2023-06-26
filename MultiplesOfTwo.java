import java.util.ArrayList;
import java.util.List;

public class MultiplesOfTwo {

    public static void main(String[] args) {
        int[] U = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21};

        List<List<Integer>> combinacoes = new ArrayList<>();

        // Gerar todas as combinações de 4 números do conjunto U
        gerarCombU(U, 4, 0, new ArrayList<>(), combinacoes);

        int count = 0;

        // Verificar se a soma de cada combinação é um múltiplo de 2
        for (List<Integer> combinacao : combinacoes) {
            int soma = 0;
            for (int num : combinacao) {
                soma += num;
            }
            if (soma % 2 == 0) {
                count++;
            }
        }

        System.out.println("Número de maneiras de escolher 4 números com soma múltipla de 2: " + count);
    }

    // Função recursiva para gerar todas as combinações de 'k' elementos do conjunto 'U'
    private static void gerarCombU(int[] U, int k, int start, List<Integer> temp, List<List<Integer>> result) {
        if (k == 0) {
            result.add(new ArrayList<>(temp));
            return;
        }

        for (int i = start; i <= U.length - k; i++) {
            temp.add(U[i]);
            gerarCombU(U, k - 1, i + 1, temp, result);
            temp.remove(temp.size() - 1);
        }
    }
}
