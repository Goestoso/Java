//Criar um método que verifica se um valor é impar ou par // Imprimir a mensagem dentro do método

import java.util.Scanner;

public class VerificaValor {
	
	public static void main (String[] args){
		
		Scanner sc = new Scanner(System.in);
			
		System.out.print("\nDigite um valor: ");
		int n = sc.nextInt();
		verificaValor(n);

		sc.close();
			
	}
	
	public static void verificaValor(int valor) {
		
		if (valor % 2 == 0)
			System.out.println("Esse valor é par");
		else
			System.out.println("Esse valor é ímpar");
		
	}
}