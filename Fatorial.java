import java.math.BigInteger; //uma biblioteca matemática que lida com números grandes 
import javax.swing.JOptionPane;
//Calcular fatorial
public class Fatorial {
    public static void main (String [] args) {
        int n = Integer.parseInt (JOptionPane.showInputDialog(null,"Insira um número (fatorial): ", "Fatorial", JOptionPane.INFORMATION_MESSAGE)); //ERROR_MESSAGE // WARNING_MESSAGE // QUESTION_MESSAGE // PLAIN_MESSAGE

        //método BigInteger.valueOf() é usado para criar um objeto BigInteger a partir de um valor inteiro no caso, fatorial termina com x 1
        BigInteger fatorial = BigInteger.valueOf(1); //Fatorial termina com x 1
        String valores = ""; //String para concatenação posterior

        //Percorrer todos os números de 1 até número informado
        for (int i = 1;  i <= n; ++i) {
            fatorial = fatorial.multiply(BigInteger.valueOf(i)); //O método multiply() é usado para multiplicar dois objetos BigInteger e retorna um novo objeto BigInteger que contém o resultado da multiplicação, no caso, fatorial = fatorial * i. 

            if (i == 1) { //Condição para listar valores do fatorial caso = 1
                valores += i; // valores = valores + i // String valores irá armazenar o valor 1
            }
            else { // Condição para listar valores do fatorial caso != 1
                valores += " x " + i; // valores = valores + " x " + i // String valores irá concatenar cada valor da lista fatorial e junto com 'x' 
            }
        }
        //Exibir na tela o resultado da iteração
        JOptionPane.showMessageDialog(null, fatorial, n + "! = " + valores + " : " + " ", JOptionPane.INFORMATION_MESSAGE); 
    }   
}
