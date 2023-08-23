import java.util.Random;
import java.util.Scanner;

public class VetorMulti {
	public static void main (String args []) {
		Random r = new Random ();
		Scanner s = new Scanner (System.in);
		
		System.out.print("\nDigite o tamanho do vetor: ");
		int t = s.nextInt();
		int[] v = new int[t];
		
		for (int i = 0; i < t; ++i) {
			
			v[i] = r.nextInt(10);
			System.out.println("Vetor [" + i + "]" + ": " + v[i]);
			
		}
		
		for (int i = 0; i < t; ++i) { 
			
			v[i] *= 3;
			System.out.println("Vetor Multiplicado[" + i + "]" + ": " + v[i]);
		
		}
	}
}