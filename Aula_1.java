//Retomando os estudos da linguagem Java - agora na discplina de Linguagem de Programação //

import java.util.Scanner;

public class Aula_1 {
	public static void main (String args []) {
		Scanner entrada = new Scanner (System.in);
		System.out.print("Ola amigo, digite seu nome: ");
		String var = entrada.next();
		System.out.println("Prazer, " + var + ".");
		
		System.out.print("\nVamos somar dois numeros inteiros.\nDigite o primeiro: ");
		int n1 = entrada.nextInt();
		System.out.print("Digite o segundo: ");
		int n2 = entrada.nextInt();
		
		int soma = n1 + n2;
		System.out.println("Resultado: " + soma);
		
		
		entrada.close();
	}
}