//Ler 50 valores e mostrar somente os valores positivos

import java.util.Scanner;
import java.util.Random;

public class PositivoVetor {
	
	public static void main (String args []) {

		Scanner sc = new Scanner (System.in);
		Random r = new Random ();
		
		System.out.print("\nDigite o tamanho do vetor: ");
		int t = sc.nextInt();
		int[] v = new int[t];
		
		System.out.println("");
		
		for (int i = 0; i < t; ++i) {
			
			v[i] = r.nextInt(101) - 50;
			System.out.println("Vetor [" + i + "]: " + v[i]);
			
		}
		
		
		int t2 = 0, j = 0;
		
		for (int i = 0; i < t; ++i) {
			
			if (v[i] >= 0) 
				
				++t2;
		}
		
		int[] v2 = new int[t2];
		
		for (int i = 0; i < t; ++i) {
			
			if (v[i] >=0 ) {
				
				v2[j] = v[i];
				++j;
			}				
		}
		
		boolean repete = false;
		String p = "";
		
		for (int i = 0; i < t2; ++i) {
				
			repete = false;
				
			for (j = i + 1; j < t2; ++j) {
				
				if (v2[i] == v2[j])
					
					repete = true;
			}
			
			if (!repete) 
				
				p += " " + v2[i];
		}
		
		System.out.println("\nValores positivos do vetor: " + p);
		
		sc.close();
	}
}