//Uma matriz 3x3x3 onde cada elemento da matriz será igual a soma de seus índices

public class SomaIndiceCubo {
	public static void main (String[] args) {
		
		int cubo[][][] = new int[3][3][3];
		int i, j, k;
		
		System.out.println("Matriz 3x3x3 onde cada elemento = soma dos índices: ");
		
		for (i = 0; i < 3; ++i) {
			
			System.out.println("");
			
			for (j = 0; j < 3; ++j) {
				
				for (k = 0; k < 3; ++k) {
					
				cubo[i][j][k] = i + j + k;
				System.out.print(" [" + i + "]" + "[" + j + "]" + "[" + k + "] = " + cubo[i][j][k] + " |");	
					
				}
				
				System.out.println("");
			}
		}
	}
}