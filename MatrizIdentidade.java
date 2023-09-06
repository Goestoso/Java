//Crie um programa para armazenar os valores 0s e 1s em uma matriz quadrada de ordem 3. Em seguida verificar se a matriz é uma matriz identidade.

import java.util.Scanner;

public class MatrizIdentidade {
	
	public static void main (String [] args) {
		
		Scanner sc = new Scanner(System.in);
		int[][] m = new int [3][3];
		int n1 = 0, n2 = 0;
		
		System.out.println("\nMatriz de ordem 3 (digite 1 ou 0): \n");
		
		for (int i = 0; i < 3; ++i){
			
			for (int j = 0; j < 3; ++j){
				
				System.out.print("\nLinha " + (i + 1) + " e Coluna " + (j + 1) + ": ");
				m[i][j] = sc.nextInt();
					
					while (m[i][j] < 0 || m[i][j] > 1) {
						
						System.out.print("\nValor inválido!\n\nLinha " + (i + 1) + " e Coluna " + (j + 1) + ": ");
						m[i][j] = sc.nextInt();
					
				}
				
			}
			
		}
		
		System.out.println("");
		
		for (int[] row : m) {
            // Loop através dos elementos de cada linha
            for (int element : row) {
                System.out.print("[" + element + "]");
            }
            System.out.println(); // Pula para a próxima linha
        }
		
		for (int i = 0; i < 3; ++i) {
			
			for (int j = 0; j < 3; ++j) {
				
				if (i == j)
					
					n1 += 1;
				
				else 
								
					n2 += n2 = m[i][j];
			}
		}
		
			if (n1 == 3 && n2 == 0) 
				
				System.out.println("\nMatriz Identidade!");
				
			else 
				
				System.out.println("\nNão é Matriz Identidade! :^(");

		
		sc.close();
	}
}