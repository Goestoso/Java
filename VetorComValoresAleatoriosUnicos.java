import java.util.Random;

public class VetorComValoresAleatoriosUnicos {
    
    public static int[] gerarVetorComValoresAleatoriosUnicos(int tamanho) {

        Random r = new Random();
        int v[] = new int[tamanho];
        v[0] = r.nextInt(tamanho) + 1;

        for (int i = 1; i < v.length; i++) {
            int novo = r.nextInt(tamanho) + 1;
            boolean repete = false; // Variável para verificar se o número gerado já existe no vetor
            int j = i - 1;  // Inicia 'j' com o índice anterior a 'i'

            while (j >= 0 && !repete) { // Loop para verificar se o número gerado já existe no vetor

                if (v[j] == novo) 
                    repete = true;
                else 
                    j--;
            }
            if (repete)  // Se o número gerado já existe no vetor, decrementa 'i' para repetir a geração
                i--;
            else  // Caso contrário, atribui o número gerado à posição atual do vetor
                v[i] = novo;
        }

        return v;  // Retorna o vetor preenchido com valores aleatórios únicos
    }
}
