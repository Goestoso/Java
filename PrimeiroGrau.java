import java.util.Scanner;
//Calcular equação do primeiro grau
public class PrimeiroGrau {
    public static void main(String [] args) {
        Scanner entrada = new Scanner (System.in);
        System.out.print ("Digite o coefeciente a: ");
        double a = entrada.nextDouble();
        System.out.print ("Digite o coeficiente b: ");
        double b = entrada.nextDouble();
        if (a == 0){
            System.out.print("a não pode ser 0, coeficientes não representam equação de 1º grau");
        }
        else {
            double x = -b/a;
            System.out.print ("x= " + x);
        }
        entrada.close();
    }
}
