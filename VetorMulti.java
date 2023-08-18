//Vetor com 15 números e depois armazenar em outro vetor imprimindo o resultado do primeiro multiplicado por 3

import java.util.Random;
import java.util.Scanner;

public class VetorMulti {
	public static void main (String args []) {
		Random r = new Random ();
		Scanner s = new Scanner (System.in);
		
		System.out.print("\nDigite o tamanho do vetor: ");
		int t = s.nextInt();
		int[] v = new int[t], v2 = new int[t];
		
		System.out.println("");
		
		for (int i = 0; i < t; ++i) {
			
			v[i] = r.nextInt(10);
			System.out.println("Vetor 1 [" + i + "]" + ": " + v[i]);
			
		}
		
		System.out.println("\nTransferindo valor do vetor 1 para vetor 2: ");
		System.out.println("");
		
		for (int i = 0; i < t; ++i) { 
			
			v2[i] = v[i];
			System.out.println("Vetor 1 [" + i + "]: " + v[i] + " -> Vetor 2 [" + i + "]: " + v2[i]);
			
		
		}
		
		System.out.println("\nMultiplicando os valores do vetor 2 por 3: ");
		System.out.println("");
		
		for (int i = 0; i < t; ++i) {
			
			v2[i] *= 3;
			System.out.println("Vetor 2 multiplicado por 3 [" + i + "]" + ": " + v2[i]);
			
		}
	}
}