import java.util.Scanner;
//Ler e separar cada algarismo de um número com quatro dígitos
public class OperacaoMod {
    public static void main (String [] args) {
        //entradas
        Scanner scanner = new Scanner (System.in);
        System.out.println ("Digite um número com quatro dígitos: ");
        int numero = scanner.nextInt();
        //processamento
        int algarismo1 = numero % 10;
        int algarismo2 = numero / 10; 
        int algarismo3 = algarismo2 % 10;
        int algarismo4 = algarismo2 / 10;
        int algarismo5 = algarismo4 % 10;
        int algarismo6 = algarismo4 / 10; 
        //saída
        System.out.println ("O primeiro algarismo é: " + algarismo6 + " \nO segundo algarismo é: " + algarismo5 + " \nO terceiro alagarismo é: " + algarismo3 + "\nO quarto algarismo é: " + algarismo1);
        scanner.close();
    }    
}
