//id dos caracteres na tabela Ascii

public class TabelaAscii {
	
	public static void main (String[] args) {
		
		int i;
		char start = ' ', end = '~'; 
		// O primeiro caractere imprimível na tabela ASCII é o ' '
		// O último caractere imprimível na tabela ASCII é o '~'
		
		System.out.println("####################\n   Tabela ASCII  \n####################");
		
		for (char c = start; c  <= end; ++c) {
			
			i = (int) c;
			
			System.out.println(c + " - " + i);
		}
	}	
}