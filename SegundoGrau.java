import java.util.Scanner;
//Calcular equação do segundo grau
public class SegundoGrau {

    public static void main(String [] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.print ("Digite o valor de a: ");
        double a = scanner.nextDouble();
        System.out.print ("Digite o valor de b: ");
        double b = scanner.nextDouble();
        System.out.print ("Digite o valor de c: ");
        double c = scanner.nextDouble();
        if (a == 0) {
            System.out.print("Não é do 2º grau");
        }
        else {
            double delta = (b*b) - (4*a*c);
            if (delta < 0){
            System.out.print ("Não tem raiz real");
            }
            else {
                double raiz = Math.sqrt (delta);
                double x1 = (-b + raiz) / (2*a);
                double x2 = (-b - raiz) / (2*a);
                System.out.print("x1= " + x1 + "\nx2= " + x2);
            }
        }
        scanner.close();
    }    
}
