import java.util.Scanner;

public class Vetor {
	public static void main (String args []) {
		
		Scanner input = new Scanner (System.in);

		System.out.print("Digite o tamanho do vetor: ");
		int t = input.nextInt();
		int[] n = new int[t];
		
		for (int i = 0; i < t; i++) {
			
			System.out.print("\nVetor [" + i + "]" + ": ");
			n[i] = input.nextInt();
		
		}
		
		for (int j = t; j != 0; --j) {
			
			System.out.print("\nVetor Retorno [" + j + "]" + ": " + n[j]);
			
		}
		
		input.close();
	}
}