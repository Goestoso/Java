//Criar uma matriz 8x8 que contenha da diagonal principal para baixo n = 1 e para cima n = 0

public class MatrizUmZero {
	
	public static void main (String [] args) {
	
		int[][] m = new int [8][8];
		int i, j; 
		
		System.out.println("\nMatriz 8x8 (1 OU 0): \n");
		
		for (i = 0; i < 8; ++i) {
			
			for (j = 0; j < 8; ++j) {
				
				if (i >= j) 
					
					m[i][j] = 1;
					
				else
					
					m[i][j] = 0;
					
					System.out.print("[" + m[i][j] + "]");
					
			}
			
			System.out.println("");
		}
	}
}