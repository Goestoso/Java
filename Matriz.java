//Criar uma matriz 4x4 e somar todos os valores dela

import java.util.Random;

public class Matriz {
	
	public static void main (String[] args) {
			
		Random r = new Random();
		int[][] m  = new int [4][4];
		int i, j, soma = 0;
		
		System.out.println("");
		
		for (i = 0; i < 4; ++i) {
			
			for (j = 0; j < 4; ++j) {
			
			m[i][j] = r.nextInt(10) + 1;
			soma += m[i][j]; 
			System.out.print("[" + m[i][j] + "]");
			
			}
		
			System.out.println("");
			
		}
		
		System.out.println("\nSoma dos valores da matriz 4x4: " + soma);
	}
}