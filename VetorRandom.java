//Armazenar valores aleatórios dentro de cada posição do vetor e imprimir
import java.util.Random;

public class VetorRandom {
    public static void main (String [] args){
        Random random = new Random ();
        int[] v = new int [5]; //Tamanho do vetor é de 5 espaços
        for (int i = 0; i < v.length; ++i) {
            v[i] = random.nextInt(101); //Valores aleatórios entre 0 e 100
        }
        for (int j = 0; j < v.length; ++j) {
            System.out.println("Posição " + j + ": " + v[j] ); //Imprimir cada valor aleatório
        }
    }
}
