public class ExemploArgs {
    public static void main (String [] args) { 
        // O método main é o ponto de entrada do programa Java
        // O parâmetro args é um array que contém os argumentos passados na linha de comando
        
        // Vamos percorrer esse array e imprimir cada argumento
        for (int i = 0; i < args.length; i++ )
        System.out.println(args[i]);
    }
}
