//Ler o primeiro nome e contar quantas vogais ele possui

import java.util.Scanner;

public class VogaisNaString {
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int i = 0, index = 0;
		
		System.out.print("Ola! Digite seu primeiro nome: ");
		String name = sc.next();
		name.toLowerCase(); //Converte a string para minúsculo
		
		while (i < name.length()) { //Loop para percorrer cada caractere do nome
            
			if(isVogal(name.charAt(i))) //Se o caractere atual for uma vogal
				++index; //Aumenta o index de vogal
			
			++i;
		}
		
		System.out.println("Quantidade de vogais : " + index);
		
		
		sc.close();
		
	}
		
	private static boolean isVogal (char c) {
			
			//verifica se o caractere é uma vogal
			return c == 'a' 
			|| c == 'e'
			|| c == 'i'
			|| c == 'o'
			|| c =='u';
		
	}
}