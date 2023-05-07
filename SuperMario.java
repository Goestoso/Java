import java.util.Scanner;

//Uma empresa contrata um encanador a R$ 30,00 por dia. Faça um programa que solicite o numero de dias trabalhados pelo encanador e imprima a quantia lıquida que devera ser paga, sabendo-se que sao descontados 8% para imposto de renda.

public class SuperMario {
    public static void main(String [] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println ("Quantos dias o encanador trabalhou? ");
        double dias = scanner.nextDouble();
        double bruto = dias * 30;
        double imposto = bruto * 8/100;
        double liquido = bruto - imposto;
        System.out.print ("A quantia líquida que deverá ser paga: R$" + liquido);
        scanner.close();
    }    
}
