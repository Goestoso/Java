//Faça um programa que contenha um método chamado emitirConceito e que recebe a média final de um aluno por parâmetro e retorna o seu conceito

import java.util.Scanner;

public class EmitirConceito {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("\nEMITIR UM CONCEITO");

        System.out.print("\nMe informe sua média geral: ");
        double media = sc.nextDouble();

        System.out.println("\nSeu conceito será: " + emitirConceito(media)); 

        sc.close();

    }

    public static String emitirConceito(double m) {

        String conceito = new String ("");

        if (m >= 0.0 && m <= 4.9 ) 
            conceito = "D";
        
        else if (m > 4.9 && m <= 6.9) 
            conceito = "C";
        
            
        else if (m > 6.9 && m <= 7.0) 
            conceito = "B";

        else 
            conceito = "A";

        return (conceito);

    }
}
