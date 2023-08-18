//Ler 50 valores do vetor e exibir o maior dos valores

import java.util.Scanner;
import java.util.Random;

public class MaiorDoVetor {
	public static void main (String args []) {
		
		int var;
		String p = "";
		
		Scanner sc = new Scanner (System.in);
		Random r = new Random ();
		
		System.out.print("\nDigite o tamanho do vetor: ");
		int t = sc.nextInt();
		int[] v = new int[t];
		
		
		System.out.println("");
		
		for (int i = 0; i < t; ++i) {
			
			v[i] = r.nextInt(50);
			System.out.println("Vetor [" + i + "]: " + v[i]);
			
		}
		
		var = v[0]; 
		
		for (int i = 0; i < t; ++i) {
			
			if (v[i] > var) {
				
				var = v[i];
				p = "" + i;
				
			}
		}
		
		System.out.println("\nO maior valor é o Vetor [" + p + "]: " + var);
	}
}