// Crie um programa em linguagem Java para inserir dados em um vetor A de 30 posições de inteiros. Os números inteiros que serão armazenados no vetor só podem ser divisíveis por 5 (números que divididos por 5 terão resto igual a zero). Ao final mostrar o vetor A, e mostrar se o usuário digitou números não divisíveis por 5 e a respectiva quantidade.

import java.util.Random;

public class DivisivelPor5Vetor {
	
	public static void main (String args []) {
		
		Random r = new Random ();
		
		int[] v = new int[30];
		int var, index = 0, i = 0;
		
		System.out.print("Vetor A: | ");
		while (i < 30) {
			
			var = r.nextInt(30);
			
			if (var % 5 == 0) {
				
				v[i] = var;
				System.out.print(v[i] + " |");
				++i;
			}
			 else {
				
				++index;
			}	
		}
		
		System.out.println("\nQuantidade de valores não divisíveis por 5: " + index);
	}
}