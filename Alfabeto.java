public class Alfabeto {
    public static void main (String [] args) {
        System.out.print ("Alfabeto: "); //Inicia com título
        char alfabeto = 'a'; //Variável inicial do alfabeto = 'a'
        while (alfabeto <= 'z') { //Condição para percorrer até 'z'
            System.out.print("\n" + alfabeto); //Exibe o alfabeto na tela
            alfabeto++; //Adiciona + 1 passo para a variável do tipo char 
        }
    } 
}
