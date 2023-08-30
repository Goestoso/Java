//Array de três dimensões 

public class Cubo {
	
	public static void main (String[] args) {
		
		int cubo[][][] = new int [3][3][3];
		boolean dimensao = true;
		int index = 1;
		
		System.out.print("Matriz de 3 dimensoes: \n");
		
		for (int i = 0; i < 3; ++i) {
			
			System.out.println("");
			
			for (int j = 0; j < 3; ++j){
				
				for (int k = 0; k < 3; ++k) {
					
					cubo[i][j][k] = index;
					System.out.print("[" + i + "]" + "[" + j + "]" + "[" + k + "]" + " = " + cubo[i][j][k] + " | ");
					++index;
				}
				
				System.out.println("");
			}
		}
	}
}