//1) Criar um programa em Java que contenha um método denominado Encaixa. O método deve receber dois 
//inteiros positivos, sendo o primeiro definido por A e que contem 4 dígitos, já o segundo número definido de 
//B que contem 2 dígitos. O método deve verificar se B corresponde aos últimos dígitos de A. Imprimir a 
//mensagem “encaixa”, ou “não encaixa”.
//Exemplos: A B Mensagem
 //5478 78 “Encaixa”
 //2367 36 “Não Encaixa”
 //1234 34 “Encaixa”

import java.util.Scanner; 

 public class Ex1ListaProva {
	 
	 public static void main (String[] args){
		 
		Scanner sc = new Scanner(System.in);
		String a = "", b = "";
		
		do {
			
		System.out.print("Digite um inteiro positivo (4 digitos): ");
		a = sc.next();
		
		} while (a.length() < 4 || a.length() > 4);
		
		do {
			
		System.out.print("\nDigite outro inteiro positivo: ");
		b = sc.next();
		
		} while (b.length() < 4 || a.length() > 4);
		
		metodoEncaixa(a, b);
		
		sc.close();
	 }
	 public static void metodoEncaixa(String a, String b){
		 
		String algarismoB = b.substring(2);
		
		System.out.println("\nA B Mensagem");
		System.out.print("\n" + a + " " + algarismoB);
		
		int nA = Integer.parseInt(a), nB = Integer.parseInt(b);
		
		if (nA % 100 == nB % 100)
			
			System.out.print(" Encaixa");
			
		else
			System.out.print(" Não encaixa");
		
		 
	 }
 }