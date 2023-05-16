import java.util.Scanner; 
//Descobrir qual é o maior valor entre três números.
public class MaiorDeTres {
    public static void main (String [] args) {
        //entrada
        double v1, v2, v3;
        Scanner scanner = new Scanner (System.in);
        System.out.print ("digite o primeiro valor: ");
        v1 = scanner.nextDouble();
        System.out.print ("digite o segundo valor: ");
        v2 = scanner.nextDouble();
        System.out.print ("digite o terceiro valor: ");
        v3 = scanner.nextDouble();
        //processamento
        if (v1 >= v2 && v1 >= v3) {
            //saída
            System.out.println ("O maior valor é " + v1);
        }
        //processamento
        else if (v2 >= v3) {
            //saída
            System.out.println ("O maior valor e " + v2);
        }
        //processamento
        else {
            //saída
            System.out.println ("O maior valor e " + v3);
        }
        scanner.close();
    }
}
