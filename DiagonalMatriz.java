//Crie um programa em Linguagem Java que armazene dados inteiros em uma matriz de ordem 5. Em seguida imprima apenas a diagonal principal. Depois imprima a diagonal secundária.

public class DiagonalMatriz {
	
	public static void main (String [] args) {
		
		int[][] m = {
			{1, 2, 3, 4, 5},
			{1, 2, 3, 4, 5},
			{1, 2, 3, 4, 5},
			{1, 2, 3, 4, 5},
			{1, 2, 3, 4, 5},
		};
		
		System.out.println("\nMatriz de ordem 5: \n");
		
		
		// Loop através das linhas
        for (int[] row : m) {
            // Loop através dos elementos de cada linha
            for (int element : row) {
                System.out.print("[" + element + "]");
            }
            System.out.println(); // Pula para a próxima linha
        }
		
		System.out.println("\nDiagonal principal da matriz: \n");
		
		for (int i = 0; i < 5; ++i) {
			
			for (int j = 0; j < 5; ++j) {
				
				if (i == j)
					
					System.out.print("[" + m[i][j] + "]");
					
				else 
					
					System.out.print("[ ]");
					
				
			}
			
			System.out.println("");
		}
		
		System.out.println("\nDiagonal secundária da matriz: \n");
		
		for (int i = 0; i < 5; ++i) {
			
			for (int j = 0; j < 5; ++j) {
				
				if (i + j == 4)
					
					System.out.print("[" + m[i][j] + "]");
					
				else 
					
					System.out.print("[ ]");
					
				
			}
			
			System.out.println("");
		}
	}
} 