//Criar duas matrizes A e B de ordem 2 e depois elaborar uma matriz C que é o resultado da soma das matrizes anteriores

import java.util.Random;

public class SomaMatriz {
	
	public static void main (String [] args) {
		
		Random r = new Random();
		int[][] m1 = new int [2][2], m2  = new int [2][2], m3 = new int [2][2];
		int i, j;
		
		System.out.println("");
		System.out.println("Matriz A: \n");
		
		for (i = 0; i < 2; ++i) {
		
			for (j = 0; j < 2; ++j) {
				
			m1[i][j] = r.nextInt(9) + 1;
			
			System.out.print("[" + m1[i][j] + "]");
			
			}
		
			System.out.println("");
			
		}
		
		System.out.println("\nMatriz B: \n");
		
		for (i = 0; i < 2; ++i) {
		
			for (j = 0; j < 2; ++j) {
				
			m2[i][j] = r.nextInt(10) + 1;
			
			System.out.print("[" + m2[i][j] + "]");
			
			}
		
			System.out.println("");
			
		}
		
		System.out.println("\nMatriz C: \n");
		
		for (i = 0; i < 2; ++i) {
		
			for (j = 0; j < 2; ++j) {
				
			m3[i][j] = m1[i][j] + m2[i][j];
			
			System.out.print("[" + m3[i][j] + "]");
			
			}
		
			System.out.println("");
			
		}
		
	}
}