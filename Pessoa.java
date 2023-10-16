// Exemplo de classe com construtor e encapsulamento

public class Pessoa {
    
    private int id;
    public String nome, endereco;

    public int getId () {

        return id;
    }

    public Pessoa (int id, String nome, String endereco) {

        this.nome = nome; 
        this.id = id;
        this.endereco = endereco;

    }

    void imprimirObjeto () {

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + id);
        System.out.println("Endereço: " + endereco);

    }

    public static void main(String[] args) {

        String nm = "Gabriel Goes de Castro", end = "Osasco";

        int idade = 19;

        Pessoa p1 = new Pessoa (idade, nm, end);

        p1.imprimirObjeto();

    }
 
}
