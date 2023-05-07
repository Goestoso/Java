import javax.swing.JOptionPane;
import java.math.BigInteger; // É uma classe que representa um número inteiro arbitrariamente grande. Ao contrário do tipo int, que possui um tamanho fixo de 32 bits, ou do tipo long, que possui um tamanho fixo de 64 bits, o BigInteger não tem um tamanho fixo.

//21. Faca um programa que receba dois numeros. Calcule e mostre: 
//• a soma dos numeros pares desse intervalo de numeros, incluindo os numeros digitados;
//• a multiplicacao dos numeros ımpares desse intervalo, incluindo os digitados;

public class Ex21ListaC03 {
    public static void main(String[] args) {
        boolean valido;
        BigInteger n1;
        BigInteger n2;
        // Laço de leitura dos dois números
        do {
            n1 = new BigInteger(
                    JOptionPane.showInputDialog(null, "Digite o primeiro número: ", "",
                            JOptionPane.INFORMATION_MESSAGE));

            n2 = new BigInteger(
                    JOptionPane.showInputDialog(null, "Digite o segundo número: ",
                            "Esse número deve ser maior do que o anterior", JOptionPane.INFORMATION_MESSAGE));
            if (n2.compareTo(n1) > 0) {
                valido = true; // Se a ordem dos números for obedecida 
            } else {
                valido = false; // Se a ordem dos números não for obedecida
                JOptionPane.showMessageDialog(null, "Valor inválido", "Erro: " , JOptionPane.ERROR_MESSAGE);
            }
        } while (valido == false); //Reinicia o loop
        BigInteger somapar = BigInteger.ZERO; // Número par inicia com 0
        BigInteger multimpar = BigInteger.ONE; // Número ímpar inicia com 1

        // Percorrer o intervalo entre os dois números
        for (BigInteger i = n1; i.compareTo(n2) <= 0; i = i.add(BigInteger.ONE)) {
            // Verificar se é par
            if (i.mod(BigInteger.TWO).equals(BigInteger.ZERO)) {
                somapar = somapar.add(i); // Operação do par
            } else {
                multimpar = multimpar.multiply(i); // Operação do ímpar
            }
        }
        // Exibe na tela as duas operações
        JOptionPane.showMessageDialog(null,
                "Soma dos pares = " + somapar + "\nMultiplicação dos ímpares = " + multimpar,
                "Entre " + n1 + " e " + n2 + " : ", JOptionPane.DEFAULT_OPTION);
    }
}
