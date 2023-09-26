// Crie um método chamado ordenaArray que aceite um array de números inteiros como argumento e ordene-o em ordem crescente.

public class OrdenaArray {
	
	public static void main (String [] args){
		
		int vet [] = new int [10];
		
		vet = VetorComValoresAleatoriosUnicos.gerarVetorComValoresAleatoriosUnicos(10);
		
		for (int element : vet){
			
			System.out.print("[" + element + "]");
		}
		
		metodoImprimirArray(metodoOrdenaArray(vet));
	}
	
	public static int [] metodoOrdenaArray (int vetor []) {
		
		int menorValor;
		
		for (int i = 0; i < vetor.length; ++i){
			
			menorValor = vetor[i];
			
			for (int j = i + 1; j < vetor.length; ++j) {
				
				if (menorValor > vetor[j]){
					
					menorValor = vetor[j];
					vetor[j] = vetor[i];
					vetor[i] = menorValor;
				}
			}
		}
		
		return vetor;
	}
	
	public static void metodoImprimirArray (int [] vetor) {

		System.out.println("\n\nOrdenando Array: \n");
		
		for (int element : vetor) {
			
			System.out.print("[" + element + "]");
			
		}
		
		return;
	}
}