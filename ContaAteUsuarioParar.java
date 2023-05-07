import java.util.Scanner;
//Contar até usuário pedir para parar de contar
public class ContaAteUsuarioParar {
    public static void main (String [] args) {
        char continua = 'c';
        int cont = 1;
        Scanner scanner = new Scanner (System.in);
        while (continua == 'c' || continua == 'C'){
            System.out.println (cont++);
            System.out.print ("Digite p para parar ou c para continuar: ");
            String aux = scanner.next();
            if (aux.length () > 1){
                continua = 'p';
            }
            else{
                continua = aux.charAt(0);
            } 
        }
        scanner.close();
    }  
}
