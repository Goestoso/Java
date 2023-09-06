//Calcular soma dentro de um método e imprimir resultado da soma dentro do método criado

import java.util.Scanner;

public class CalcularSoma {

	public static void main (String[] args){
	
	Scanner sc = new Scanner (System.in);
	
	System.out.print("\nDigite um valor: ");
	int s1 = sc.nextInt();
	System.out.print("\nDigite outro valor: ");
	int s2 = sc.nextInt();
	
	System.out.print("\nSoma dos valores: " + calcularSoma(s1, s2));

	sc.close();
	
	}
	
	public static int calcularSoma (int v1, int v2) {
	
		return (v1 + v2);	
	}
}