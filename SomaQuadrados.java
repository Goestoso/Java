import java.util.Scanner;
//Faça a leitura de tres valores e apresente como resultado a soma dos quadrados dos tres valores lidos.
public class SomaQuadrados {
    public static void main(String [] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.print ("Digite o primeiro valor: ");
        double a = scanner.nextDouble();
        System.out.print ("Digite o segundo valor: ");
        double b = scanner.nextDouble();
        System.out.print ("Digite o terceiro valor: ");
        double c = scanner.nextDouble();
        double quadrado1 = Math.pow (a,a);
        double quadrado2 = Math.pow (b,b);
        double quadrado3 = Math.pow (c,c);
        double soma = quadrado1 + quadrado2 + quadrado3;
        System.out.print ("A soma dos quadrados dos três valores: " + soma);
        scanner.close();
    }    
}
