//Crie um método chamado verificaPalindromo que aceite uma string como argumento e retorne true se a string for um palíndromo (ou seja, pode ser lida da mesma forma da esquerda para a direita e da direita para a esquerda), ou false caso contrário.

import java.util.Scanner;

public class Palindromo {
	
	public static void main (String [] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite uma palavra (true se for palíndromo): ");
		String word = sc.next();
		System.out.println(lerPalindromo(word));
	}
	
	public static boolean lerPalindromo(String palavra) {
		
		char [] word = palavra.toCharArray();
		int i, j = palavra.length()-1;
		
		char [] palindromo = new char[palavra.length()];
		
		for (i = 0; i < palindromo.length; ++i) {
			
			palindromo[j] = word[i];
			--j;
		}
		
		String novaPalavra = new String(palindromo);
		
		if (novaPalavra.equalsIgnoreCase(palavra))
			return true;
		
		else
			return false;
	}
}