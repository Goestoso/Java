//Ler uma string e substituir os caracteres 'a' por '*'

//Strings são constantes e imutáveis, para alterar valores, será necessário criar uma nova string

import java.util.Scanner;

public class AsteriscoString {
	
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int i = 0, index = 0;
		
		System.out.print("Digite uma frase: ");
		String phrase = sc.nextLine();
		String novaFrase = FraseAsterisco(phrase); //fraseAsterisco é uma classe (função) que usa o construtor StringBuffer
		char[] c = phrase.toCharArray();
		
		while (i < phrase.length()) {
			
			if (phrase.charAt(i) == 'a' || phrase.charAt(i) == 'A') {
				
				c[i] = '*';
				++index;
			}
			
			++i;	
		}
		
		String newPhrase = new String (c);
		
		System.out.println("Substituindo A/a por *: " + newPhrase + "\nQuantidade de substituições: " + index);
		System.out.println("Substituindo A/a por * (StringBuffer): " + novaFrase);

		sc.close();
	}
	
	private static String FraseAsterisco (String frase) { //função para substituir os caracteres
		
		StringBuffer novaFrase =  new StringBuffer(); //instanciando o construtor StringBuffer
		
		for (int i = 0; i < frase.length(); ++i) {
				
			char c = frase.charAt(i);
			
			if (c == 'a' || c == 'A')

				novaFrase.append('*'); //append para adicionar o novo caractere
				
			else
				
				novaFrase.append(c);
		}
		return novaFrase.toString(); //toString para converter em uma string
	}
}