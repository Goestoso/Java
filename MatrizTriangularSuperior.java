//Criar um programa em Java para permitir que o usuário insira valores em uma matriz quadrada de ordem 4 de inteiros e imprimir se a matriz é uma matriz triangular superior, ou não. 

import java.util.Random;

public class MatrizTriangularSuperior {
	
	public static void main (String[] args){
		
		Random r = new Random();
		int[][] m = new int [4][4];
		boolean t = true;
		
		System.out.println("");
		
		for (int i = 0; i < 4; ++i){
			
			for (int j = 0; j < 4; ++j){
				
				m[i][j] = r.nextInt(2);
				System.out.print("[" + m[i][j] + "]");
				
				if (j < i && m[i][j] != 0)
					
					t = false;
					
			}
			
			System.out.println("");	
		}
		
		if (t) 
			
			System.out.println("\nMatriz Triangular!");	
		
		else
			
			System.out.println("\nNão é Matriz Triangular!");
		
	}
	
}