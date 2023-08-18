//Ler 20 posições de inteiros em dois vetores e transferir valores de um vetor para o outro e exibir

import java.util.Scanner;
import java.util.Random;

public class TransferirValorVetor {
	
	public static void main (String args []) {
		
		Scanner sc = new Scanner (System.in);
		Random r = new Random ();
		
		int[] v1 = new int[20];
		int[] v2 = new int[20];
		boolean a = true;
		int n1, n2, x;
		char resp;
		String vetor = " ", vetor2 = "";
		
		for (int i = 0; i < v1.length; ++i) {
				
				v1[i] = r.nextInt(20);
				
			}
			
			System.out.println("");
			
		for (int i = 0; i < v1.length; ++i) {	
			
			v2[i] = r.nextInt(20);
				
		}
		
		do {
			
			boolean b = true;
			
			System.out.println("");
			
			for (int i = 0; i < v1.length; ++i) {
				
				System.out.println("Vetor A [" + i + "]: " + v1[i]);
				
			}
			
			System.out.println("");
			
			for (int i = 0; i < v1.length; ++i) {	
			
				System.out.println("Vetor B [" + i + "]: " + v2[i]);
				
			}
			
			while (a) {
			
				System.out.println("\nVamos substituir o valor de um vetor para o outro? Digite sim/Sim para continuar ou nao/Nao para parar.");
    
				System.out.println("\nVocê quer substituir qual posição do Vetor 1? ");
				do {
					n1 = sc.nextInt();
					if (n1 < 0 || n1 >= v1.length) 
						System.out.println("Posição inválida. Digite um valor entre 0 e " + (v1.length - 1));
					
				} while (n1 < 0 || n1 >= v1.length);
				
				System.out.println("\nVocê quer substituir por qual posição do Vetor 2? ");
				do {
					n2 = sc.nextInt();
					if (n2 < 0 || n2 >= v2.length) 
						System.out.println("Posição inválida. Digite um valor entre 0 e " + (v2.length - 1));
					
				} while (n2 < 0 || n2 >= v2.length);
				
				x = v2[n2];
				v2[n2] = v1[n1];
				v1[n1] = x;
				
				System.out.println("\nQuer continuar? S/N");
				resp = sc.next().toLowerCase().charAt(0); 
				
				if (resp != 'S' && resp != 's')
				
					a = false;
			}
			
			System.out.println("\nResultado: ");
			
			for (int i = 0; i < v1.length; ++i) {
				
			vetor += (" {[" + i + "]: " + v1[i] + "} ");
				
			}
			
			for (int i = 0; i < v1.length; ++i) {	
			
				vetor2 += (" {[" + i + "]: " + v2[i] + "} ");
				
			}
			
			System.out.println("\nNovo Vetor A -> " + vetor + "\n\nNovo Vetor B -> " + vetor2);
			System.out.println("\nQuer continuar?");
			resp = sc.next().toLowerCase().charAt(0);
			
			a = true;
			
			if (resp != 'S' && resp != 's')
				
				a = false;
			
		} while (a);
			
		sc.close();
	}
}