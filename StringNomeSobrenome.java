//Ler duas strings (dois nomes) e imprimir eles na tela mais a segunda letra de cada string

import java.util.Scanner;

public class StringNomeSobrenome {
	
	public static void main (String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ola! Por favor, digite seu primeiro nome: ");
		String name = sc.next();
		
		System.out.print("\nAgora digite seu segundo nome: ");
		String surname = sc.next();
		
		System.out.printf(String.format("%s %s %s %s %s %s %s %s", "\nSeu nome: ", name, "\nSeu sobrenome: ", surname, "\nSegunda letra do primeiro nome: ", name.charAt(1), "\nSegunda letra do segundo nome: ", surname.charAt(1)));
		
		sc.close();
		
	}
}