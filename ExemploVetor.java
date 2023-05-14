import java.util.Scanner;
//Ler um vetor de um tamanho escolhido pelo usuário e depois exibir os valores na ordem inversa
public class ExemploVetor {
    public static void main (String [] args) {
        Scanner entrada = new Scanner (System.in);
        System.out.print("Digite o tamanho do vetor: ");
        int tamanho = entrada.nextInt();
        int[] v = new int[tamanho]; // Cria um vetor com o tamanho informado
        System.out.println("Agora digite " + tamanho + " valores");
        for (int i = 0; i < tamanho; i++) {
            System.out.print ("Posição " + i + ": ");
            v[i] = entrada.nextInt(); // Preenche o vetor com valores informados pelo usuário
        }
        System.out.println("Mostrar os valores ao contrário: ");
        for (int j = v.length-1; j >= 0; j--){
            System.out.println(v[j]);
        }
        entrada.close();
    } 
}
