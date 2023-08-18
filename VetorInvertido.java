import java.util.Scanner;
import java.util.Random;

//Vetor com 20 números, imprimir na ordem inversa.

public class VetorInvertido {
	public static void main (String args []) {
		
		Scanner input = new Scanner (System.in);
		Random r = new Random();
		
		System.out.print("Digite o tamanho do vetor: ");
		int t = input.nextInt();
		int[] n = new int[t];
		
		for (int i = 0; i < t; i++) {
			
			n[i] = r.nextInt(20);
			System.out.print("\nVetor [" + i + "]" + ": " + n[i]);
		
		}
		
		System.out.println("");
		
		for (int j = t - 1; j >= 0; j--) {
			
			System.out.print("\nVetor Invertido [" + j + "]" + ": " + n[j]);
			
		}
		
		input.close();
	}
}