//Crie uma classe chamada Livro que represente informações sobre livros. 
// A classe deve ter os seguintes atributos:
//titulo (uma String)
//autor (uma String)
//anoPublicacao (um inteiro)
//preco (um double)

public class Livro {
	
	//atributos
	
	private String titulo; 
	private String autor;
	private int anoPublicacao;
	private double preco;
	
	//getters e setters
	
	public String getTitulo() { 
		
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		
		this.titulo = titulo;
	}
	
	public String getAutor() {
		
		return autor;
	}
	
	public void setAutor(String autor) {
		
		this.autor = autor;
	}
	
	public int getAnoPublicacao() {
		
		return anoPublicacao;
	}
	
	public void setAnoOublicacao(int anoPublicacao) {
		
		this.anoPublicacao = anoPublicacao;
	}
	
	public double getPreco() {
		
		return preco;
	}
	
	public void setPreco(double preco) {
		
		this.preco = preco;
	}
	
	//construtores
	
	public Livro(String titulo, String autor, int anoPublicacao, double preco) {
		
		this.titulo = titulo;
		this.autor = autor;
		this.anoPublicacao = anoPublicacao;
		this.preco = preco;
		
	}
	
	public Livro(Livro livro) {
		
		this.titulo = livro.titulo;
		this.autor = livro.autor;
		this.anoPublicacao = livro.anoPublicacao;
		this.preco = livro.preco;
		
	}
	
	public Livro () {
		
		titulo = null;
		autor = null;
		anoPublicacao = 0;
		preco = 0.0;
		
	}
	
	//workers
	
	public String mostrarDetalhes(){
		
		return("Titulo: " + titulo + "\nAutor: " + autor + "\nAno: " + anoPublicacao + "\nPreço: " + preco);
		 
	}
	
	public boolean verificaPreco() { //verificar se o preço é caro
		
		boolean verifica;
		
		if (preco > 50)
			
			verifica = true;
			
		else 
			
			verifica = false;
			
		return verifica;
		
	}
	
}