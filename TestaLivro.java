public class TestaLivro {
	
    public static void main(String[] args) {
		
        // Criando um objeto de Livro usando o construtor
		
        Livro livro1 = new Livro("Dom Casmurro", "Machado de Assis", 1899, 29.99);

        // Definindo informações usando os métodos setters
		
        livro1.setTitulo("Dom Casmurro - Edição Revisada");
        livro1.setPreco(34.99);

        // Exibindo informações usando o método mostrarDetalhes
		
        System.out.println("Detalhes do Livro 1:");
        System.out.println(livro1.mostrarDetalhes());

        // Verificando se o livro é caro
		
        if (livro1.verificaPreco()) {
			
            System.out.println("Este livro é caro.");
			
        } else {
			
            System.out.println("Este livro não é caro.");
			
        }

        // Criando um segundo livro usando o construtor cópia
		
        Livro livro2 = new Livro(livro1);

        // Exibindo informações do segundo livro
		
        System.out.println("\nDetalhes do Livro 2:");
        System.out.println(livro2.mostrarDetalhes());
		livro1.setPreco(52.85);
		System.out.println("\nOops, o preço que antes era " + livro2.getPreco() + " agora é " + livro1.getPreco());
		System.out.println("\nPortanto antes os detalhes do livro eram: \n" + livro2.mostrarDetalhes() + "\nE agora os detalhes atualizados são: \n" + livro1.mostrarDetalhes());
		System.out.println("Logo, " + (livro1.verificaPreco() == true ? "este livro é caro." : "este livro não é caro."));
    }
}
