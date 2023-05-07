import java.util.Scanner;
//Calculadora com operações simples + * -
public class Calculadora {
    public static void main (String [] args){
        Scanner entrada = new Scanner (System.in);
        System.out.println ("Digite o primeiro múmero: ");
        double a = entrada.nextDouble();
        System.out.println ( "Digite o segundo número: ");
        double b = entrada.nextDouble();
        System.out.println ("Escolha a operação: \n+ -> soma \n- -> subtração -> \nx -> multiplicação \n/ -> divisão: ");
        char opcao = entrada.next().charAt(0);
        double resultado;
        switch (opcao) {
            case '+': 
                resultado = a + b;
                System.out.print ("O resultado da soma é: " + resultado);
            break;
            case '-':
                resultado = a - b;
                System.out.print("O resultado da subtração é: " + resultado);
            break;
            case 'x':
                resultado = a *b;
                System.out.print("O rsultado a multiplicação é: " + resultado);
            break;
            case '/':
                resultado = a / b;
                System.out.print ("O resultado da divisão é: " + resultado);
            break;
            default: 
                System.out.print ("valor inválido!");
            break;
        }
        entrada.close();
    }
    
}
