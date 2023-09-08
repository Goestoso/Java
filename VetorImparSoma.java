//Ler 100 valores e somar os que estão no índice ímpar do vetor

import java.util.Scanner;
import java.util.Random;

public class VetorImparSoma {
	public static void main (String args []) {
		
		Scanner sc = new Scanner (System.in);
		Random r = new Random ();
		
		System.out.print("\nDigite o tamanho do vetor: ");
		int t = sc.nextInt();
		int[] v = new int[t];
		
		System.out.println("");
		
		for (int i = 0; i < t; ++i) {
			
			v[i] = r.nextInt(100);
			System.out.println("Vetor [" + i + "]: " + v[i]);
			
		}
		
		int soma = 0;
		
		for (int i = 0; i < t; ++i) {
			
			if (i % 2 != 0) 
				
				soma += v[i];
				
		}
		
		System.out.println("\nA soma dos vetores ímpares é igual a " + soma);

		sc.close();
	}
}