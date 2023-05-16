import java.util.Scanner;
//Calcular a área do trapézio
public class Trapezio {
    public static void main (String [] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.print ("Digite o valor da base maior: ");
        double bM = scanner.nextDouble();
        System.out.print ("Digite o valor da base menor: ");
        double bm = scanner.nextDouble();
        if (bM <= bm){
            System.out.print ("A base maior não pode ser menor ou igual a base menor!  (⊙_⊙;)");
        }
        else {
            System.out.print ("Digite o valor da altura: ");
            double h = scanner.nextDouble();
            double A = ((bM + bm) * h) / 2;
            System.out.print ("Área do trapézio /-| = " + A);
        }
        scanner.close();
    }
    
}
