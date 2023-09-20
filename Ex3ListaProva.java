//) Escreva um programa em linguagem Java que permita a leitura de um número inteiro N. O programa deve conter três métodos chamados F1, F2, e F3. Obs: será necessário validar o valor de N com um loop, ou seja, N só pode receber ou o valor 1, ou o valor 2, ou o valor 3. Para outros valores imprimir a mensagem: “Valor invalido. Digite novamente”. Se o usuário digitar o valor um (1) o programa irá executar o método F1. Dentro do método deve ser adicionada uma instrução que permitirá que o usuário digite 20 números inteiros e os armazene em um vetor denominado VetA. Além disso, nesse método realizado o cálculo da soma dos números pares e divisíveis por 3 contidos no vetor, retornando e imprimindo o valor dessa soma para o método main. Se o usuário digitar o valor dois (2) o método F2 deve ler um vetor A de 15 inteiros. O método deve  gerar um outro vetor denominado B cujos elementos serão o somatório de cada elemento de A. Exemplo:
//Para o valor 4 irá somar 1+2+3+4= 10; para o valor 5 irá somar 1+2+3+4+5=15
//ou
//A 4 | 1 | 0 | 5 ...
//B 10 | 1 | 0 | 15 ...
//Se o usuário digitar o valor três (3) o programa irá chamar o método f3. Esse método deve receber uma matriz 5x5. Em seguida o programa deve somar os elementos da diagonal principal e guardar o resultado em uma variável chamada somaP, além de somar os elementos da diagonal secundária e guardar o resultado em uma variável chamada somaS. Esse método deve devolver (e imprimir no método) a letra ‘V’ se somaP for um número ímpar e somaS um número par divisível por 3, caso contrário o método deve devolver a letra ‘F’.

import java.util.Scanner;

public class Ex3ListaProva {
	
	public static void main (String[] args){
		
		Scanner sc = new Scanner(System.in);
		int n = 0, index = 0;
		
		while (index == 0) {
		System.out.print("Digite o valor de N (1, 2 ou 3): ");
		n = sc.nextInt();
		
		if (n > 0 || n < 4)
			++index;
		else 
			System.out.println("Valor inválido. Digite novamente! ");
		}
		
		switch (n) {
			
			case 1: System.out.println("\nSoma dos pares e divisíveis por 3: " + metodoF1());
			
				break;
				
			case 2: 
				
				for(int element : metodoF2()) {
							
							System.out.print("[" + element + "]");
						}
			
				break;
			
			case 3: 
					int matrix[][] = {
					{1, 2, 3, 4, 2},
					{1, 2, 3, 1, 5},
					{1, 2, 1, 4, 5},
					{1, 1, 3, 4, 5},
					{1, 2, 3, 4, 5},
					};
					
					System.out.println(metodoF3(matrix));;
			
				break;
				
			default: System.out.println("Oops...");
			
				break;
		}
		
		sc.close();
	}
	
	public static int metodoF1() {
		
		Scanner sc = new Scanner(System.in);
		int vetA[] = new int[20], soma = 0;
		
		for (int i = 0; i < vetA.length; ++i) {
			
			System.out.print("\nPosição " + (i+1) + ": ");
			vetA[i] = sc.nextInt();
			
		}
		
		for (int j = 0; j < vetA.length; ++j) {
			
			if (vetA[j] % 2 == 0 && vetA[j] % 3 == 0)
				
				soma += vetA[j];
			
		}
		
		return(soma);
	}
	
	public static int [] metodoF2() {
			
		Scanner sc = new Scanner(System.in);
		int vetA[] = new int[15];
		int vetB[] = new int[15];

		for (int i = 0; i < vetA.length; ++i) {
			
			System.out.print("\nPosição " + (i+1) + ": ");
			vetA[i] = sc.nextInt();
			
		}
		
		for (int j = 0; j < vetB.length; ++j) {
			
			int index = 0, soma = vetA[j], indice = 0;
			
			while(index < vetA[j] + 1) {
				indice += soma;
				--soma;
				++index;
			}
			
			vetB[j] = indice;
		}
		
		System.out.println("\nElementos que são o somatório de cada elemento de A: \n");
		
		return(vetB);
	}
	
	public static char metodoF3 (int m[][]) {
		
		int somaP = 0, somaS = 0;
		
		for (int i = 0; i < 5; ++i) {
			
			for (int j = 0; j < 5; ++j) {
				
				if (i == j)
					
					somaP += m[i][j];
			}
		}
		
		for (int i = 0; i < 5; ++i) {
			
			for (int j = 0; j < 5; ++j) {
				
				if (i + j == 4)
					
					somaS += m[i][j];
				
			}
		}
		
		if (somaP % 2 != 0 && somaS % 2 == 0 && somaS % 3 == 0)
			return('V');
		
		else
			
			return('F');
			
	}
}
