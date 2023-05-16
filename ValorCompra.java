import java.util.Scanner;
//Calcular o valor total da compra, se é a vista ou parcelado e aplicar o desconto. 
public class ValorCompra {
    public static void main (String [] args){
        Scanner scanner = new Scanner (System.in);
        System.out.print ("digite o total de compra: ");
        double compra = scanner.nextDouble();
        System.out.print ("digite o número de parcelas (1, 2 ou 3): ");
        int parcelas = scanner.nextInt();
        if (parcelas == 1){
            double desconto;
            desconto = compra * 10/100;
            compra = compra - desconto;
            System.out.println ("Total a pagar à vista (com 10% de desconto): R$" + compra); 
        }
        else if (parcelas == 2){
            double desconto;
            desconto = compra * 5/100;
            compra = (compra - desconto) / parcelas;
            System.out.println ("Cada parcela vai custar (com 5% de desconto): R$" + String.format( "%.2f", compra));
        }
        else if (parcelas == 3) {
            compra = compra / 3;
            System.out.println ("Cada parcela vai custar (sem desconto): R$" + String.format( "%.2f", compra));
        }
        else {
            System.out.println ("numero de parcelas invalido!");
        } 
        scanner.close();
    }
}
