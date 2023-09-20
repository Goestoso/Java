//Crie um programa em Linguagem Java, usando o conceito de métodos, para calcular o valor da seguinte sequencia:
//1/A + 1/2A + 1/3A + 1/nA
//O método deve receber dois valores que são os valores de A e n, onde n representa o número de termos da sequencia e A representa um valor qualquer.
//Obs1: imprimir o valor da sequencia na main.

import java.util.Scanner;

public class Ex2ListaProva {
	
	public static void main (String[] args){
		
		Scanner sc = new Scanner(System.in);
		int nA, n;
		
		System.out.print("Digite o valor de A: ");
		nA = sc.nextInt();
		
		System.out.print("Digite o valor de n: ");
		n = sc.nextInt();
		
		System.out.println("\nValor da sequência: " + String.format("%.2f",metodoSequencia(nA, n)));
		
		sc.close();
		
	}
	
	public static double metodoSequencia(double nA, double n) { 
		
		int i, v1 = 1;
		
		double seq = 0.0;
		
		for (i = 1; i <= n; ++i) {
			
			System.out.print("1.0" + "/" + (i*nA) + " + ");
			
			seq += 1/(i * nA);
			
		}
		
		System.out.print("...");
		
		return(seq);
	}
}